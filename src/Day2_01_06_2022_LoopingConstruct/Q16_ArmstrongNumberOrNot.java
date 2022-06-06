package Day2_01_06_2022_LoopingConstruct;//Q16. JAVA program to check given number is Armstrong or not.
import java.util.Scanner;

public class Q16_ArmstrongNumberOrNot {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=scan.nextInt();
        int noOfDigits=0, temp=num, sum=0;
        while(temp>0)
        {
            temp/=10;
            noOfDigits++;
        }
        temp=num;
        while(temp>0)
        {
            int reminder=temp%10;
            sum+=Math.pow(reminder,noOfDigits);
            temp/=10;
        }

        if(sum==num)
            System.out.print("Given number is armstrong Number.");
        else
            System.out.print("Given number is not armstrong Number.");
    }
}
