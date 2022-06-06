//Q24. JAVA program to find X to power Y (without using inbuilt function).
import java.util.Scanner;

public class Q24_power {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner scan =new Scanner(System.in);
        int num=scan.nextInt();

        System.out.print("Enter the power factor: ");
        int power=scan.nextInt();

        long sum=1;
        for(int i=0; i<power; i++)
            sum*=num;
        System.out.print("\n" +num +"^" +power +"= " +sum);
    }
}
