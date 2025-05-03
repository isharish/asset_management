import java.util.Scanner;

import modal.Passenger;
import service.Service;
public class Main {
    public static  void main(String[] args) throws Exception {
        System.out.println("choose any one\n1.book\n2.cancel\n3.available\n4.booked\n5.exit");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        sc.nextLine();
        Service s=new Service();
        Passenger head=new Passenger("head"),temp=head;
        while (choice!=5) {
            switch (choice) {
                case 1:
                    System.out.println("Book");
                    // System.out.println();
                    String name=sc.nextLine();
                    // System.out.println();
                    int age=sc.nextInt();
                    sc.nextLine();
                    String berth=sc.nextLine();
                    Passenger p=new Passenger(name,age,berth);
                    temp.next=p;
                    temp=temp.next;
                    s.book(p);
                    break;
                case 2:
                    System.out.println("Cancel");
                    
                    break;
                case 3:
                    System.out.println("Available");
                    
                    break;
                case 4:
                    System.out.println("Booked");
                    s.booked(head);
                    break;
                case 5:
                    System.out.println("gud bye");
                    
                    break;
                
                default:
                    break;

            }
            System.out.println("choose any one\n1.book\n2.cancel\n3.available\n4.bookedHAr\n5.exit");
            choice=sc.nextInt();
            sc.nextLine();
        }
        
    }
}

