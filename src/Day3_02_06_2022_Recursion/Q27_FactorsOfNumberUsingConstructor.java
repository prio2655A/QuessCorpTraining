package Day3_02_06_2022_Recursion;//Q27. JAVA program to find the factors of the given number using constructor.
import java.util.Scanner;
class Factor{
    Factor(int num)
    {
        System.out.print("Factors of "+num+" : ");
        for(int i=1; i<=num; i++)
            if(num%i==0)
                System.out.print(i+" ");
    }
}
public class Q27_FactorsOfNumberUsingConstructor {
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.print("Enter the number: ");
    int num=scan.nextInt();
    Factor d=new Factor(num);
    }
}
