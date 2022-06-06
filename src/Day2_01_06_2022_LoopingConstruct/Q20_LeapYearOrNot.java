package Day2_01_06_2022_LoopingConstruct;//Q20. JAVA program to check given year is leap or not.
import java.util.Scanner;

public class Q20_LeapYearOrNot {
    public static void main(String[] args) {
        System.out.print("Enter the Year: ");
        Scanner scan =new Scanner(System.in);
        int year=scan.nextInt();

        if(year%400==0 || year%4==0 && year%100!=0 )
            System.out.print("It is Leap Year.");
        else
            System.out.print("It is not Leap Year.");
    }
}
