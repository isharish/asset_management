package modal;

import java.net.PasswordAuthentication;

public class Passenger {
    public String alloted=new String();
    public int id=1;
     public String name;
     public int age;
     public String berth;
    public Integer number;
    public Passenger next;
     
    public Passenger(String name,int age,String berth){
        this.id=id++;
        this.name=name;
        this.age=age;
        this.berth=berth;
        alloted="";
        number=-1;
        Passenger next;
    }
    public Passenger(String name){
       
        this.name=name;
        
    }

    // public String getName() {
    //     return name;
    // }
    // public String getBerth() {
    //     return berth;
    // }
    // public int getAge() {
    //     return age;
    // }
}
