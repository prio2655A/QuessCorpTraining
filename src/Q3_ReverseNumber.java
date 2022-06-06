//Q3. Write a Java program to accept any three digit number and reverse it (eg . i/p = 512 o/p = 215)
import java.util.Scanner;

public class Q3_ReverseNumber {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter the three digit number: ");
        String num = scan.next();

        StringBuilder sb=new StringBuilder(num);
        sb.reverse();
        System.out.print("The reverse number: ");
        System.out.println(sb);
    }
}
