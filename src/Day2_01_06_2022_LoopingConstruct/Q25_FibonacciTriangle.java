package Day2_01_06_2022_LoopingConstruct;//Q25 JAVA program to generate Fibonacci triangle.
import java.util.Scanner;

public class Q25_FibonacciTriangle {
    public static void main(String[] args) {
        System.out.print("Enter the N Row: ");
        Scanner scan =new Scanner(System.in);
        int num=scan.nextInt();

        System.out.println("----The Fibonacci Triangle----" );
        for(int j=1; j<=num; j++)
        {
            int first=1, second=1, sum=0;
            for(int i=0; i<j; i++)
            {
                sum+=first;
                System.out.print(second +" ");
                first=second;
                second=sum;
            }
            System.out.println();
        }

    }
}

