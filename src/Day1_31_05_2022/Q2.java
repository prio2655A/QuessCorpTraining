package Day1_31_05_2022;//Q2. Write a Java program to input the Principle amount and time period in years,
// consider the rate of interest as 7.5%.
// Find the amount of simple interest and the final amount paid to the Bank.

import java.util.Scanner;

public class Q2 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Principal Value: ");
        float principal = scan.nextFloat();
        System.out.print("Enter the year: ");
        int year = scan.nextInt();

        double simple_interest = (principal * 7.5 * year) / 100;

        System.out.println("Simple Interest= "+ simple_interest);
        System.out.println("Total Amount= "+(principal + simple_interest));
    }
}