import java.util.Scanner;

import service.Data;

public class Main {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        Data data = new Data();
        do {
            System.out.println("=====Menu=====");
            System.out.println("1.Add details");
            System.out.println("2.Number of Installation of a software");
            System.out.println("3.Number of software installed in a device");
            System.out.println("4.Number of software installed for an employee");
            System.out.println("5.Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    data.addDetail(data);
                    break;
                case 2:
                    data.numberofInstalls(data, sc);
                    break;
                case 3:
                    data.InstallsInDevice(data, sc);
                    break;
                case 4:
                    data.InstallsforEmployee(data, sc);
                    break;
                case 5:
                    System.out.println("ta ta Bye!!!");
                    break;

            }

        } while (choice != 5);
    }
}