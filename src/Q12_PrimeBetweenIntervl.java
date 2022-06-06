//Q12. JAVA Program to Display Prime Numbers between Two Intervals.
import java.util.Scanner;

public class Q12_PrimeBetweenIntervl {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter the lower bound: ");
        int lower=scan.nextInt();
        System.out.print("Enter the upper bound: ");
        int upper= scan.nextInt();
        System.out.print("The Prime number between them: ");
        for(int i=lower; i<=upper; i++)
        {
            boolean flag=true;
            for(int j=2; j<=i/2; j++ )
                if(i%j==0)
                {
                    flag=false;
                    break;
                }
            if(flag)
                System.out.print(i +" ");
        }
    }

}
