package Day2_01_06_2022_LoopingConstruct;//Q21. JAVA Program to Display Armstrong Number between Two Intervals.
import java.util.Scanner;

public class Q21_ArmstrongNumberBetweenIntervals {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter the lower bound: ");
        int lower=scan.nextInt();
        System.out.print("Enter the upper bound: ");
        int upper= scan.nextInt();
        System.out.print("The Armstrong number between them: ");

        for(int i=lower; i<=upper; i++)
        {
            int noOfDigits=0, temp=i, sum=0;
            while(temp>0)
            {
                temp/=10;
                noOfDigits++;
            }
            temp=i;
            while(temp>0)
            {
                int reminder=temp%10;
                sum+=Math.pow(reminder,noOfDigits);
                temp/=10;
            }

            if(sum==i)
                System.out.print(i+" ");
        }

    }
}
