package Day2_01_06_2022_LoopingConstruct;//Q15. JAVA program to find factorial of given number.
import java.util.Scanner;

public class Q15_FactorialOfNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=scan.nextInt();
        int sum=1;
        for(int i=1; i<=num; i++)
            sum*=i;
        System.out.print("Factorial of "+num+ " : "+sum);
    }
}
