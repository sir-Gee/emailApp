package emailApp;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
//        Email email1 = new Email("Joe", "Batman");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many persons you are going to add:");
        int num = scanner.nextInt();
        scanner.nextLine();


        for(int i=0; i<num;i++){
            System.out.println("First name of an employee N"+(i+1)+":" );
            String fName = scanner.nextLine();
            System.out.println("Last name of an employee N"+(i+1)+":" );
            String lName = scanner.nextLine();
            new Email(fName, lName);
            System.out.println();
        }
    }
}
