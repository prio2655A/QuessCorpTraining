//Q13. JAVA program to print sum of digits. (eg. 512 = 8)
import java.util.Scanner;

public class Q13_SumOfDigits {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=scan.nextInt();
        int sum=0;
        while(num>0)
        {
            sum+=num%10;
            num/=10;
        }
        System.out.print("Sum of Digits: "+sum);
    }
}
