//Q23. JAVA program to print all tables from 1 to given n numbers.
import java.util.Scanner;

public class Q23_TableUptoNnumber {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner scan =new Scanner(System.in);
        int num=scan.nextInt();

        for(int j=1; j<=num; j++)
        {
            System.out.println("\n-:The table of " +j +":-");
            for(int i=1; i<=10; i++)
                System.out.println(j +"*" +i +" = "+ i*j );
        }
    }
}
