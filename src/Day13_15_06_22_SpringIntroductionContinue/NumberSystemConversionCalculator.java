package Day13_15_06_22_SpringIntroductionContinue;

//Create a " Number System Conversion Calculator ".
// There are four number system formats i.e. Binary, Decimal, Octal, and Hexadecimal.
// For providing input ask user in which format he/she is going to provide input ,
// take the input , validate that is that in correct format or not
// and then ask in which format he/she wants the output,
// and provide the correct output in provided number system format.

import java.util.Scanner;

public class NumberSystemConversionCalculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Hello this is Number System Conversion Calculator.");
        showMenu();

    }
    public static void showMenu()
    {
        System.out.println( "\n-------------------Menu------------------- \n1.Binary\t2.Decimal\t3.Octal\t4.Hexadecimal" );
    }
}
