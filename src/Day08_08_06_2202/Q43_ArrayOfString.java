
//Implement the function which takes an array containing the names of people that like an item.
// It must return the display text as shown in the examples:
//        []                                -->  "no one likes this"
//        ["Peter"]                         -->  "Peter likes this"
//        ["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
//        ["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
//        ["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"
//        Note: For 4 or more names, the number in "and 2 others" simply increases.
package Day08_08_06_2202;
import java.util.Scanner;

public class Q43_ArrayOfString {
    static void checckLikes(String[] names)
    {
        if(names.length>3)
            System.out.print(names[0]+", "+names[1]+" and"+ (names.length -2) +" others like this.");
        else if(names.length==3)
            System.out.print(names[0]+", "+names[1]+" and "+names[2]+" like this.");
        else if(names.length==2)
            System.out.print(names[0]+" and "+names[1]+" like this.");
        else if(names.length==1)
            System.out.print(names[0]+" like this.");
        else
            System.out.print("no one likes this.");

    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter how many names: ");
        int totalName=scan.nextInt();
        String[] names=new String[totalName];
        for(int i=0; i<totalName; i++)
        {
            System.out.print("Enter the Name "+(i+1)+": ");
            names[i]=scan.next();
        }

        checckLikes(names);

    }
}
