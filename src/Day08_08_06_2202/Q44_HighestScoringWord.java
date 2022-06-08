package Day08_08_06_2202;

//Given a string of words, you need to find the highest scoring word.
//        Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.
//        You need to return the highest scoring word as a string.
//        If two words score the same, return the word that appears earliest in the original string.
//        Provided : All letters will be lowercase and all inputs will be valid.

import java.util.Scanner;

public class Q44_HighestScoringWord {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter the line: ");
        String line=scan.nextLine();

        int maxSum=0;
        String highestScoringWord="";
        for(String str: line.split(" ") )
        {
            int sum=0;
            for(int i=0; i<str.length(); i++)
                sum+=str.charAt(i)-97+1;
            if(maxSum<sum)
            {
                maxSum=sum;
                highestScoringWord=str;
            }
        }

        System.out.print("The highest scoring word: "+highestScoringWord);



    }
}
