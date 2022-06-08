package Day08_08_06_2202;
//Q42. Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'.
// Return the resulting string. Note: input will never be an empty string.

import java.util.Scanner;

public class Q42_StringDigitsReplacement {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the string of digits: ");
        String str=scan.next();

        StringBuilder sb=new StringBuilder(str);
        for(int i=0; i<sb.length(); i++)
        {
            if(sb.charAt(i)>='0' && sb.charAt(i)<='4')
                sb.replace(i,i+1,"0");
            else
                sb.replace(i,i+1,"1");
        }
        System.out.print("The replaced string: "+sb);
    }
}
