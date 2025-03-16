package model;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private int empId;
    private String empName;
    public List<Device> devices=new ArrayList<>();
    private int amount;
    // public List<Vendor> vendors;
    public void setEmpId(int empId_) {
        this.empId=empId_;
    }
    public void setEmpname(String empName_) {
        this.empName=empName_;
    }
    public void setAmount(int amount_){
        this.amount=amount_;
    }

    public int getEmpId(){
        return this.empId;
    }
    public String getEmpname() {
        return this.empName;
    }
    public int getAmount() {
        return this.amount;
    }

}
