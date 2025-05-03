package service;

import modal.Passenger;
import java.util.*;
public class Service {
    static int lb=1;
    static int mb=1;
    static int ub=1;
    static int rac=1;
    static int wait=1;
    Passenger temp=null;
    static Queue<Integer> raclist=new LinkedList<>();
    static Queue<Integer> waitinglist=new LinkedList<>();
    HashMap < String,Integer> ma=new HashMap<>();
    HashMap <Integer,Passenger> passengerlist=new HashMap<>();
    
    public void book(Passenger p){
        ma.put("L",1);
        ma.put("M",2);
        ma.put("U",3);
        if(wait==0){
            System.out.println("Sorry, no seats available");
            return;
        }
        if(p.berth.equals("M") && mb>0){
            System.out.println("middle");
            p.alloted="M";
            p.number=ma.get("M");
            mb--;
            
        }else if(p.berth.equals("U") && ub>0){
            System.out.println("upper");
            p.alloted="U";
            p.number=ma.get("U");
            ub--;
        }else if(p.berth.equals("L") && lb>0){
            System.out.println("lower");
            p.alloted="L";
            p.number=ma.get("L");
            lb--;
        }
        else if(p.berth.equals("L") && lb==0){ //unpreffered berth lower
            if(ub>0){
                System.out.println("upper");
                p.alloted="U";
                p.number=ma.get("U");
                ub--;
            }else if(mb>0){
                System.out.println("middle");
                p.alloted="M";
                p.number=ma.get("M");
                mb--;
            }else{
                if(rac>0){
                    System.out.println("rac");
                    rac--;
                    raclist.add(p.id);
                }else if(wait>0){
                    System.out.println("wait");
                    wait--;
                    waitinglist.add(p.id);
                }
            }
        }
        else if(p.berth.equals("M") && mb==0){ //unpreffered berth middle
            if(ub>0){
                System.out.println("upper");
                p.alloted="U";
                p.number=ma.get("U");
                ub--;
            }else if(lb>0){
                System.out.println("lower");
                p.alloted="L";
                p.number=ma.get("L");
                lb--;
            }else{
                if(rac>0){
                    System.out.println("rac");
                    rac--;
                    raclist.add(p.id);
                }else if(wait>0){
                    System.out.println("wait");
                    wait--;
                    waitinglist.add(p.id);
                }
            }
        }
        else if(p.berth.equals("U") && ub==0){//unpreffered berth lower
            if(lb>0){
                System.out.println("lower");
                p.alloted="L";
                p.number=ma.get("L");
                lb--;
            }else if(mb>0){
                System.out.println("middle");
                p.alloted="M";
                p.number=ma.get("M");
                mb--;
            }else{
                if(rac>0){
                    System.out.println("rac");
                    rac--;
                    raclist.add(p.id);
                }else if(wait>0){
                    System.out.println("wait");
                    wait--;
                    waitinglist.add(p.id);
                }
            }
        }
        
        System.out.println("Seats booked successfully");
    }

    public void booked(Passenger head){
        temp=head;
        while(temp!=null){
            System.out.println("=======================");
            System.out.println("passenger id:"+temp.id);
            System.out.println("name:"+temp.name);
            System.out.println("age:"+temp.age);
            // System.out.println(temp.berth);
            System.out.println("alloted:"+temp.alloted);
            System.out.println("seat number:" +temp.number);
            System.out.println("=======================");
            temp=temp.next;
        }
    }

}

    