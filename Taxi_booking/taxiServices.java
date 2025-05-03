import java.util.*;

public class taxiServices {
    static int taxilimit=1;
    static int ind=0;
    ArrayList <Taxi>taxiList =new ArrayList<Taxi>();
    ArrayList <Taxi>taxiHistory =new ArrayList<>();

    public void booking(int cid,char pick,char drop,int time) throws CloneNotSupportedException{
        Taxi taxiPointer=null;
        if(taxiList.size()<=taxilimit){
            taxiPointer=new Taxi();
            // taxiList.add(taxiPointer);
            System.out.println("one");
        }else{
            int min=Integer.MAX_VALUE;
            for(Taxi t:taxiList){
                if(t.getDroptime()<=time && Math.abs(pick-t.getCurr_loc())< min){
                    taxiPointer=t;
                    min=Math.abs(pick-t.getCurr_loc());
                }
            }
        }
           

            if(taxiPointer!=null){
                taxiPointer.setid(taxiPointer.getid());
                taxiPointer.setPicktime(time);
                taxiPointer.setDroptime(time+Math.abs(pick-drop));
                taxiPointer.setCurr_loc(drop);
                taxiPointer.setCost(taxiPointer.getCost()+Math.abs(pick-drop) * (100+(10*10)));
                taxiPointer.pickList.add(pick);
                taxiPointer.dropList.add(drop);
                taxiList.add(taxiPointer);
                taxiHistory.add(taxiPointer);

                // taxiHistory.add((Taxi)taxiPointer.clone());
                System.out.println("*********Taxi Booked*********");
            }else{
                System.out.println();
                System.out.println("Taxi rejected :( ");
            }
        
            
    }

    public void display(){
        System.out.println("!!!!!!!!!!!!!!! History !!!!!!!!!!!!!!!!");
        for(Taxi i:taxiHistory){
            System.out.println("--------------------------");
            System.out.println("Driver id:"+i.getid());
            System.out.println("Pickup time:"+i.getPicktime());
            System.out.println("Drop time:"+i.getDroptime());
            System.out.println("Current location:"+i.getCurr_loc());
            System.out.println("Cost earned:"+i.getCost());
            System.out.print("Pickup location: ");
            for(char x: i.pickList){
                System.out.print(x+"  ");
            }
            System.out.println();
            System.out.print("Drop location: ");
            for(char x: i.dropList){
                System.out.print(x+"  ");
            }
            System.out.println();

            System.out.println("--------------------------");
            System.out.println();

        }
    }
}
