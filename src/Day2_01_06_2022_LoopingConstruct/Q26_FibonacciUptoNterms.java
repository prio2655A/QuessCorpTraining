package Day2_01_06_2022_LoopingConstruct;//Q26. JAVA program to print Fibonacci series up to given term.
import java.util.Scanner;

public class Q26_FibonacciUptoNterms {
    public static void main(String[] args) {
        System.out.print("Enter the N terms: ");
        Scanner scan =new Scanner(System.in);
        int num=scan.nextInt();

        System.out.print("The Fibonacci Series up to "+ num +" terms : " );
        int first=1, second=1, sum=0;
        for(int i=0; i<num; i++)
        {
            sum+=first;
            System.out.print(second +" ");
            first=second;
            second=sum;
        }
    }
}
