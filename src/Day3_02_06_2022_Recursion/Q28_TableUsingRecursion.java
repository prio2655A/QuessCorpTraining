package Day3_02_06_2022_Recursion;//Q28. Write a Java program to find table of given number using recursion.
import java.util.Scanner;

public class Q28_TableUsingRecursion {
    static void  table(int n,int x)
    {
        System.out.println(n +"*" +x +" = "+ x*n );
        if(x<10)
            table(n,x+1);

    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=scan.nextInt();
        System.out.print("\n---The table of "+num+ " ---\n");
        table(num,1);

    }
}
