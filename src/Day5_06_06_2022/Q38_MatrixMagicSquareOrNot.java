package Day5_06_06_2022;/*
Q38
A magic square is an arrangement of numbers (usually integers) in a square grid,
where the numbers in each row, and in each column, and the numbers in the forward and backward main diagonals, all add up to the same number.

Write a program to find whether a given matrix is a magic square or not.
The first integer corresponds to the number of rows/columns in the matrix.
The remaining integers correspond to the elements in the matrix.
The elements are read in row-wise order, first row first, then second row and so on.
Print "yes" if it is a magic square. Print "no" if it is not a magic square.

Input
2
4 5
5 4

Output
no

 */
import java.sql.SQLOutput;
import java.util.Scanner;
public class Q38_MatrixMagicSquareOrNot {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=scan.nextInt();
        System.out.println("Enter the matrix.");
        int matrix[][]= new int[2][2];
        for(int row=0; row<num; row++)
            for(int col=0; col<num; col++)
                matrix[row][col]=scan.nextInt();

        boolean flag=true;
        int leftDiagonal=0, rightDiagonal=0;
        for(int row=0; row<num; row++)
        {
            leftDiagonal+=matrix[row][row];
            rightDiagonal+=matrix[row][num-1-row];
        }

        if(leftDiagonal!=rightDiagonal)
        {
            flag=false;
            System.out.print("No");
        }

        for(int row=0; row<num && flag; row++)
        {
            int rowSum=0,colSum=0;
            for(int col=0; col<num; col++)
            {
                rowSum+=matrix[row][col];
                colSum+=matrix[col][row];
            }
            if(rowSum!=leftDiagonal || colSum!=leftDiagonal)
            {
                flag=false;
                System.out.println("No");
                break;
            }
        }

        if(flag)
            System.out.println("Yes");

    }
}
