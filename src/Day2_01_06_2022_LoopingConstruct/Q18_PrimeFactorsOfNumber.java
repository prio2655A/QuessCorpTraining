package Day2_01_06_2022_LoopingConstruct;//Q18. JAVA program to print all prime factors of given number.
import java.util.Scanner;

public class Q18_PrimeFactorsOfNumber {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=scan.nextInt();
        while(num>1)
        {
            if(num%2==0)
            {
                System.out.println(2);
                num/=2;
            }
            else if(num%3==0)
            {
                System.out.println(3);
                num/=3;
            }
            else if(num%5==0)
            {
                System.out.println(5);
                num/=5;
            }
            else if(num%7==0)
            {
                System.out.println(7);
                num/=7;
            }
            else if(num%11==0)
            {
                System.out.println(11);
                num/=11;
            }
            else if(num%13==0)
            {
                System.out.println(13);
                num/=13;
            }
            else if(num%17==0)
            {
                System.out.println(17);
                num/=17;
            }
            else if(num%19==0)
            {
                System.out.println(19);
                num/=19;
            }
            else if(num%23==0)
            {
                System.out.println(23);
                num/=23;
            }
            else if(num%29==0)
            {
                System.out.println(29);
                num/=29;
            }

        }
    }
}
