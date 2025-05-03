import java.util.*;

public class main {

    public static void main(String[] args) throws CloneNotSupportedException{
        Scanner sc = new Scanner(System.in);
        int choice=0;
        taxiServices service=new taxiServices();
        do{
            System.out.println("1.Booking ");
            System.out.println("2.print ");
            System.out.println("3.Exit ");
            System.out.print("Enter the Menu: ");
            choice = sc.nextInt();
            

            switch (choice) {
                case 1:
                    System.out.print("Customer Id: ");
                    int cid = sc.nextInt();
                    System.out.print("Pickup location: ");
                    char pick = sc.next().charAt(0);
                    System.out.print("Drop location: ");
                    char drop = sc.next().charAt(0);
                    System.out.print("Pickup time: ");
                    int time = sc.nextInt();
                    // Taxi t=new Taxi();
                    service.booking(cid,pick,drop,time);
                    // System.out.println(t.getid());
                    break;
                case 2:
                    service.display();
                    break;
                case 3: 
                    break;
            
            }
        }while(choice!=3);
    }
}