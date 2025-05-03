import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Deservice {
    ArrayList<De> deList=new ArrayList<>();
    ArrayList<De> history=new ArrayList<>();
    Map <Integer,Integer> queue=new TreeMap<>();
   
    public void booking(int cid,char src,char des,double time){
        boolean same_person=false;
        De ptr=null;
        if(deList.size()==0){
            ptr=new De();
            System.out.println("zero");
        }else{
            int min=Integer.MAX_VALUE;
            for(De i: deList){
                same_person=false;
                if(i.getOrders()<2 && time<i.getWtime() && i.getCurr_loc()==des){
                    ptr=i;
                    same_person=true;
                    System.out.println("same person");
                    // break;
                }
                if(time<i.getFtime() && min<i.getCharge()){
                    ptr=i;
                    min=i.getCharge();
                    System.out.println("random person");
                }
            }
        }
        if(deList.size()<=2 && ptr==null){
            ptr=new De();
            System.out.println("new person");
        }
        // if(deList.size()<=3){
        //     ptr=new De();
        //     System.out.println(ptr.getId());
        // }else{
        //     int min=Integer.MAX_VALUE;
        //     for(De i:deList){
        //         if(i.getCharge()<min && i.getFtime()<time){
        //             ptr=i;
        //             min=i.getCharge();
        //             if(i.getWtime()<=time+0.25 && i.getCurr_loc()==des && i.getOrders()<5){
        //                 ptr=i;
        //             }
        //             // i.setCurr_loc(des);
        //         }
        //     }
        // }
        if(ptr!=null){
            ptr.setId(ptr.getId());
            ptr.setWtime(time+0.25);
            ptr.setFtime(time+0.75);
            ptr.setCurr_loc(des);
            ptr.setOrders(ptr.getOrders()+1);
            ptr.setCharge(50+5*(ptr.getOrders()-1));
            ptr.src.add(src);
            ptr.des.add(des);
            ptr.ptime.add(ptr.getWtime());
            ptr.dtime.add(time+0.75);
            if(!same_person)
                deList.add(ptr);
            System.out.println("***********car booked**********");
        }else{
            System.out.println("No car available :( ");
        }
        
        for(De i: deList){
            System.out.println("--------------------------");
           System.out.println("id: "+i.getId());
           System.out.println("wating time: "+i.getWtime());
           System.out.println("free time: "+i.getFtime());
           System.out.println("Charge: "+i.getCharge());
           System.out.println("Orders: "+i.getOrders());
           System.out.println("destination location: "+i.getCurr_loc());
           System.out.print("Source: ");
           for(char x: i.src){
                System.out.print(x+"  ");
            }
            System.out.println();
            System.out.print("Destination: ");
            for(char x: i.des){
                System.out.print(x+"  ");
            }
            System.out.println();
            System.out.print("Pickup time: ");

            for(double x: i.ptime){
                System.out.print(x+"  ");
            }
            System.out.println();
            System.out.print("Drop time: ");

            for(double x: i.dtime){
                System.out.print(x+"  ");
            }
            System.out.println();
            System.out.println("--------------------------");
            System.out.println();

        }
        
    }

}
