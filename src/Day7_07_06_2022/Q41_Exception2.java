package Day7_07_06_2022;
//Q41.Write a java program that let the user choose his/her username and password.
//The program verifies whether the chosen username and password are valid.
// If either one of them is invalid, it notifies the user by raising exception and explain the cause of invalidity.
// The rules for choosing valid usernames and passwords are:
//        a. A username must be of length 6-15 characters.
//        b. A username must start with an uppercase English alphabet A to Z.
//        c. A password must not be shorter than 8 characters but must not exceed 256.
//        d. There cannot be any types of parentheses or whitespaces in a valid username or password.
//        e. A password cannot contain or be the same as its associated username

import java.util.InputMismatchException;
import java.util.Scanner;
class InvalidTyping extends Exception{
    InvalidTyping(String error){
        super(error);
    }
}


public class Q41_Exception2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        try{
            System.out.print("Enter the User Name: ");
            String userName= scan.nextLine();
            if( userName.length()<6 || userName.length()>15)
                throw new InvalidTyping("Invalid User Name.\nUser Name must be of length 6-15 characters.");
            if( userName.charAt(0)<'A' || userName.charAt(0)>'Z')
                throw new InvalidTyping("Invalid User Name.\nUser Name must start with an uppercase English alphabet A to Z." );

            System.out.print("Enter the password: ");
            String passWord= scan.next();

            if(passWord.length()<8 || passWord.length()>256){
                throw new InvalidTyping("Invalid User Password.\n Password must be 8-256 in length");
            }
            if(passWord.contains("(")||passWord.contains(")")){
                throw new InvalidTyping("Invalid User Password.\n Password cannot contain parenthesis");
            }
            if(passWord.contains(" ")){
                throw new InvalidTyping("Invalid Password: Password cannot contain space");
            }

        }
       catch(InvalidTyping e)
        {
            System.out.println(e.getMessage());
        }

    }

}
