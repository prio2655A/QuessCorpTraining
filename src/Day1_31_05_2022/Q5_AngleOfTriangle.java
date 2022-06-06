package Day1_31_05_2022;//Q5. Write a Java program to accept three values for angle of triangle and check it is valid triangle or not.

import java.util.Scanner;

public class Q5_AngleOfTriangle {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int sum=0;
        for(int i=1; i<=3; i++)
        {
            System.out.print("Enter the angle " + i+ "= ");
            sum+=scan.nextInt();
        }
        if(sum==180)
            System.out.println("Valid Triangle");
        else
            System.out.println("Not Triangle");
    }
}
