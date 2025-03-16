package service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import model.Device;
import model.Employee;
import model.Software;
import model.Vendor;

public class Data {
    public static List<Device> dvcList=new ArrayList<>();
    public  static List<Software> sftList;
    public static List<Vendor> vnrList=new ArrayList<>();
    public static List<Employee> empList=new ArrayList<>();

    
    public List<Software> findSoftwareList(List<Integer> lst,Data d) throws MyException{
        List<Software>res =new ArrayList<>();
        for(int j:lst){
            for(Software i:d.sftList){
                if(j==i.getSoftwareId()){
                    res.add(i);
                }
            }
        }

        if(res.size()!=lst.size()) {
            throw new MyException("Invalid softwareid");
        }
        return res;
    }

    public Vendor findVendor(int vId,Data d) throws Exception{
        for(Vendor i:d.vnrList){
            if(vId==i.getVendorId()){
                return i;
            }
        }
        throw new MyException("Invalid vendor Id");
    }

    public void copulateData() {
        sftList=new ArrayList<>();
        sftList.add( new Software("17/03/2004", 1000, 1));
        sftList.add( new Software("21/06/2004", 4000, 1));
        sftList.add( new Software("22/06/2004", 2000, 3));
        sftList.add( new Software("27/03/1982", 3000, 4));

        vnrList.add(new Vendor(1,new ArrayList<>(Arrays.asList(1,2))));
        vnrList.add(new Vendor(2,new ArrayList<>(Arrays.asList(3))));
        vnrList.add(new Vendor(3,new ArrayList<>(Arrays.asList(4))));
    }

    public int findAmount(Employee emp){
        int cost=0;
        for(Device dvc: emp.devices){
            for(Software sft:dvc.sftList){
                cost+=sft.getCost();
            }
        }

        return cost;
    }
    
    public void printEmployee(){
        for(Employee emp:empList){
            System.out.println("=======================");
            System.out.println("Emp id: "+emp.getEmpId());
            System.out.println("Emp Name: "+emp.getEmpname());
            for(Device d: emp.devices){
                System.out.println("Device Id: "+d.getDeviceid());
                for(Software sft:d.sftList){
                    System.out.println("\t Software-"+sft.getSoftwareId());
                }
            }
            System.out.println("Amount: "+emp.getAmount());
            System.out.println("=======================");

        }
    }

    public Software findSoftware(int sftId){
        for(Software sft:sftList){
            if(sft.getSoftwareId()==sftId){
                return sft;
            }
        }
        return null;
    }

    public void addSoftwareInstalls(List<Integer> lst){
        for(int i:lst){
            Software temp=findSoftware(i);
            int t=temp.getInstalls();
            temp.setInstalls(t+1);
        }
    }

    public void addDetail(Data data) {
        copulateData();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Employees: ");
        int n = sc.nextInt();
        int empId = 0, deviceId = 0;
        String empName = null;

        for (int i = 1; i <= n; i++) {
            Employee temp = new Employee();
            System.out.print("Enter the empid: ");
            empId = sc.nextInt();
            temp.setEmpId(empId);

            System.out.print("Enter the empName: ");
            empName = sc.next();
            temp.setEmpname(empName);

            System.out.print("Enter the no of Devices: ");
            int s = sc.nextInt();
            for (int j = 1; j <= s; j++) {
                System.out.print("Enter the "+j+" deviceId: ");
                deviceId = sc.nextInt();
                System.out.print("Enter the number of softwares in "+j+" device: ");
                int size=sc.nextInt();
                List<Integer> lst=new ArrayList<>();
                for(int k=1;k<=size;k++){
                    System.out.print("Enter the "+k+"st software id for "+j+"th Device: ");
                    int softId = sc.nextInt();
                    lst.add(softId);
                    System.out.println(lst);
                }

                addSoftwareInstalls(lst);

                try {
                    Device dvc= new Device(deviceId,findSoftwareList(lst,data));
                    dvcList.add(dvc);
                    temp.devices.add(dvc);
                } catch (Exception e) {
                    System.out.println("Error by adding list of devices in the softwarelist");
                    e.printStackTrace();
                }
            }

            temp.setAmount(findAmount(temp));
            empList.add(temp);

            
            System.out.println("Detail "+i+" employee added successfully!!");
        }

        printEmployee();
    }

    public void numberofInstalls(Data data,Scanner sc) {
        System.out.print("Enter the software for finding the installs: ");
        int softId = sc.nextInt();

        Software temp=findSoftware(softId);
        if(temp!=null){
            System.out.println("Software installs on the "+softId+ " is: "+temp.getInstalls());
        }
        if(temp==null) System.out.println("no way");

    }

    public void InstallsInDevice(Data data, Scanner sc){
        for(Device dvc:dvcList){
            // System.out.println("Device id: "+dvc.getDeviceid());
            System.out.println("Number of Softwares in Deviceid "+dvc.getDeviceid()+ " :"+dvc.sftList.size());
        }
    }

    public void InstallsforEmployee(Data data, Scanner sc){
        for(Employee emp:empList){
            System.out.println("Employee "+emp.getEmpId());
            for(Device dvc:emp.devices){
                System.out.println("softwares in Deviceid"+dvc.getDeviceid()+": "+dvc.sftList.size());
            }
        }
    }


}
