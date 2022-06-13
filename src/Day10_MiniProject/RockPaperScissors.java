package Day10_MiniProject;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    static int recentScore=0;
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String computerChoice;
        String userChoice;
        String userName;
        String result;


        System.out.println("Welcome to Rock Paper Scissors Game.");
        userName=getUserDetais();
        String wantToPlay="";
        do {
            showMenu();
            computerChoice = generateComputerChoice();
            userChoice = getUserChoice();
            result = chooseWinner( computerChoice, userChoice );

            System.out.println( "\nYou choose : " + userChoice + "\nComputer choose : " +computerChoice );
            System.out.println( result );

            System.out.print("\nDo you want to play again ( yes? ) : ");
            wantToPlay=scan.next();
        }while( wantToPlay.equalsIgnoreCase("yes") );

        System.out.println("Score of " +userName +" : " +recentScore);

    }
    public static String getUserDetais()
    {
        Scanner scan=new Scanner(System.in);
        String userName="";
        System.out.print("Enter your name: ");
        userName= scan.next();
        return userName;
    }
    public static void showMenu()
    {
        System.out.println( "\n------------Menu-------------- \n1.Rock\t2.Paper\t3.Scissors" );
    }
    public static String generateComputerChoice()
    {
        Random random=new Random();
        int randomNumber= random.nextInt(3) +1;
        String computerRecentChoice;

        if(randomNumber==1) {
            computerRecentChoice="Rock";
        } else if (randomNumber==2) {
            computerRecentChoice="Paper";
        } else {
            computerRecentChoice="Scissors";
        }

        System.out.println("\nComputer took its choice.");
        return computerRecentChoice;
    }
    public static String getUserChoice()
    {
        Scanner scan=new Scanner(System.in);
        int userRecentNumber;
        String userRecentChoice="";
        do{
            System.out.print( "Enter your choice ( 1/2/3? ) : " );
            userRecentNumber= scan.nextInt();

            if(userRecentNumber==1) {
                userRecentChoice="Rock";
            } else if (userRecentNumber==2) {
                userRecentChoice="Paper";
            } else if(userRecentNumber==3){
                userRecentChoice="Scissors";
            }

            if(userRecentNumber <1 || userRecentNumber >3)
                System.out.println("Invalid Input. Plz enter again.");
        }while(userRecentNumber <1 || userRecentNumber >3);

        return userRecentChoice;
    }
    public static String chooseWinner(String computerRecentChoice, String userRecentChoice )
    {
        String massage="";

        if(computerRecentChoice.equals(userRecentChoice)){
            massage="\nDraw. ( Both choose same )";
        }
        else if(computerRecentChoice.equals("Rock") && userRecentChoice.equals("Scissors")){
            massage="\nComputer Win. ( Rock smashes Scissors )";
            if(recentScore>0)
                recentScore--;
        }
        else if(computerRecentChoice.equals("Scissors") && userRecentChoice.equals("Rock")){
            massage="\nUser Win. ( Rock smashes Scissors )";
            recentScore++;
        }
        else if(computerRecentChoice.equals("Scissors") && userRecentChoice.equals("Paper")){
            massage="\nComputer Win. ( Scissors cuts Paper )";
            if(recentScore>0)
                recentScore--;
        }
        else if(computerRecentChoice.equals("Paper") && userRecentChoice.equals("Scissors")){
            massage="\nUser Win. ( Scissors cuts Paper )";
            recentScore++;
        }
        else if(computerRecentChoice.equals("Paper") && userRecentChoice.equals("Rock")){
            massage="\nComputer Win. ( Paper wraps Rock )";
            if(recentScore>0)
                recentScore--;
        }
        else if(computerRecentChoice.equals("Rock") && userRecentChoice.equals("Paper")){
            massage="\nUser Win. ( Paper wraps Rock )";
            recentScore++;
        }

        return massage;
    }
}
