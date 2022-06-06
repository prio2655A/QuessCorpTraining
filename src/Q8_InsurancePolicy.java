//Q7. Write a Java program for Company Insurance Policy.
//      A company insure its driver under the following conditions
//      If driver is married.
//      If driver is unmarried male and age above 30.
//      If driver is unmarried female and age above 25.

import java.util.Scanner;

public class Q8_InsurancePolicy {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter the driver age: ");
        int age=scan.nextInt();
        System.out.print("Enter the driver sex(male/female?): ");
        String sex=scan.next();
        System.out.print("Enter the driver Marital Status(married/unmarried?): ");
        String maritalStatus=scan.next();

        if(maritalStatus.equals("married"))
            System.out.println("\nCompany will Insurance");
        else if(maritalStatus.equals("unmarried") && sex.equals("male") && age>30 )
            System.out.println("\nCompany will Insurance");
        else if(maritalStatus.equals("unmarried") && sex.equals("female") && age>25)
            System.out.println("\nCompany will Insurance");
        else
            System.out.println("\nCompany will not Insurance");

    }
}
