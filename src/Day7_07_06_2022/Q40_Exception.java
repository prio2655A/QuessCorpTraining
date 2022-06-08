package Day7_07_06_2022;//Q40. You will be given two integers x and y as input, you have to compute x/y .
// If x and y are not 32 bit signed integers or if y is zero, exception will occur and you have to report it.
// Read sample Input/Output to know what to report in case of exceptions.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q40_Exception {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        try
        {
            System.out.print("Enter value X: ");
            int x= scan.nextInt();
            System.out.print("Enter value Y: ");
            int y=scan.nextInt();
            int ans=x/y;
            System.out.print(x+"/"+y+"= "+ans);
        }
        catch(InputMismatchException e)
        {
            System.out.println("Input Mismatch Exception");
        }
        catch (ArithmeticException e)
        {
            System.out.println("Y Input can't be Zero");
        }

    }
}
