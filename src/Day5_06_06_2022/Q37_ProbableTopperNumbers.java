package Day5_06_06_2022;//Q37. In the University Examinations conducted during the past 5 years, the toppers registration numbers were 7126, 82417914, 7687 and 6657.
//      Your father is an expert in data mining and he could easily infer a pattern in the toppers registration numbers.
//      In all the registration numbers listed here, the sum of the odd digits is equal to the sum of the even digits in the number.
//      He termed the numbers that satisfy this property as Probable Topper Numbers. Write a program to find whether a given number is a probable topper number or not.
import java.util.Scanner;

public class Q37_ProbableTopperNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scan.nextInt();
        int diff = 0;
        while (num > 0) {
            int reminder = num % 10;
            if (reminder % 2 == 0)
                diff += reminder;
            else
                diff -= reminder;
            num/=10;
        }
        if(diff==0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}