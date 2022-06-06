//Q22.JAVA program to print table of given number.
import java.util.Scanner;

public class Q22_TableOfNumber {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner scan =new Scanner(System.in);
        int num=scan.nextInt();

        System.out.println("\n-:The table of " +num +":-");
        for(int i=1; i<=10; i++)
            System.out.println(num +"*" +i +" = "+ i*num );
    }
}
