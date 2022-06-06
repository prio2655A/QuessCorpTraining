package Day2_01_06_2022_LoopingConstruct;//Q17. JAVA program to check given number is palindrome or not.
import java.util.Scanner;

public class Q17_PalindromeOrNot {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner scan= new Scanner(System.in);
        int num=scan.nextInt();

        int temp=num, sum=0;
        while(temp>0)
        {
            sum=sum*10+temp%10;
            temp/=10;
        }

        if(sum==num)
            System.out.print("Given number is Palindrome Number.");
        else
            System.out.print("Given number is not Palindrome Number.");

    }
}
