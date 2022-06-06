package Day2_01_06_2022_LoopingConstruct;//Q14. JAVA program to reverse the given number.
import java.util.Scanner;

public class Q14_ReverseNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=scan.nextInt();
        int sum=0;
        while(num>0)
        {
            sum=sum*10+num%10;
            num/=10;
        }
        System.out.print("Sum of Digits: "+sum);
    }
}
