package Day1_31_05_2022;//Q8. Write a Java program to find greater between three numbers using nested ternary operator.

import java.util.Scanner;
public class Q7_LargeNoFrom3No {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int first=scan.nextInt();
        System.out.print("Enter the second number: ");
        int second=scan.nextInt();
        System.out.print("Enter the third number: ");
        int third=scan.nextInt();

        System.out.print("The largest number: ");
        System.out.println(first>second?( first>third ? first: third): (second>third ? second: third) );
    }

}
