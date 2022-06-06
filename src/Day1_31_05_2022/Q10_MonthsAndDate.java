package Day1_31_05_2022;//Q10. Write a Java program convert given days into months and remaining days. (consider a month of 30 days)
import java.util.Scanner;

public class Q10_MonthsAndDate {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.print("Enter the number of Days: ");
        int num=scan.nextInt();
        System.out.println("Means "+ num/30 +" Months and "+ num%30 +" Days.");
    }
}
