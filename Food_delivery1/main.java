import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice=0;
        Deservice service=new Deservice();
        do{
            System.out.println("----------Menu---------");
            System.out.println("1.Booking ");
            System.out.println("2.Print ");
            System.out.println("3.close ");
            System.out.print("Enter the choice: ");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("customer id: ");
                    int cid=sc.nextInt();
                    System.out.print("Source: ");
                    char src=sc.next().charAt(0);
                    sc.nextLine();
                    System.out.print("Destination:");
                    char des=sc.next().charAt(0);
                    System.out.print("Time:");
                    double time=sc.nextDouble();
                    service.booking(cid,src,des,time);
                    break;
                    
                case 2:
                    break;
                case 3:
                    break;
                }
        }while(choice!=3);


    }
}
