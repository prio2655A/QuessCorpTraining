//Q4. Write a Java program to accept any four digit number and
// calculate the sum of first and last digit. eg-(i/p = 4512 o/p = 6)

import java.util.Scanner;
public class Q4_SumOfFirstAndLastDigit {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the four digit number: ");
        String num = scan.next();

        int sum=0;
        sum+=num.charAt(0)-'0';
        sum+=num.charAt(num.length()-1)-'0';
        System.out.print("The sum of first and last digit: ");
        System.out.println(sum);


    }
}
