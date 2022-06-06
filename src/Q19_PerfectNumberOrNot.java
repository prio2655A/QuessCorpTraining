//Q19. JAVA program to check given number is perfect or not.
import java.util.Scanner;

public class Q19_PerfectNumberOrNot {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner scan =new Scanner(System.in);
        int num=scan.nextInt();
        int sum=0;
        for(int i=1; i<=num/2; i++)
            if(num%i==0)
                sum+=i;
        if(sum==num)
            System.out.print("Given number is Perfect Number.");
        else
            System.out.print("Given number is not Perfect Number.");
    }
}
