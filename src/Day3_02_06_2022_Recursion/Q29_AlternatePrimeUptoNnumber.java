package Day3_02_06_2022_Recursion;//Q29. Write a Java program to print alternate prime numbers up to given number.
import java.util.Scanner;

public class Q29_AlternatePrimeUptoNnumber {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        int upper= scan.nextInt();
        System.out.print("The Alternate Prime number upto " +upper +" : ");
        boolean alternateFlag=false;
        for(int i=2; i<=upper; i++)
        {
            boolean flag=true;
            for(int j=2; j<=i/2; j++ )
                if(i%j==0)
                {
                    flag=false;
                    break;
                }
            if(flag)
                alternateFlag=!alternateFlag;
            if(flag && alternateFlag)
                System.out.print(i +" ");
        }
    }
    }

