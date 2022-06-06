//Q11. JAVA Program to Check Whether a Number is Prime or Not.
import java.util.Scanner;

public class Q11_PrimeOrNot {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=scan.nextInt();
        boolean flag=true;
        for(int i=2; i<=num/2; i++ )
            if(num%i==0)
            {
                System.out.print("The num is not Prime.");
                flag=false;
                break;
            }

        if(flag)
            System.out.print("The num is Prime.");
    }
}
