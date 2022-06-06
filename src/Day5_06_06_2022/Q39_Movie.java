

/*
The class Movie is started below. An instance of class Movie represents a film.

This class has the following three class variables:
title, which is a String representing the title of the movie
studio, which is an String representing the studio that made the movie
rating, which is a String representing the rating of the movie (i.e. PG-13, R, etc)

public class Movie {
private String title;
private String studio;
private String rating;
// your code goes here
}

Req 1: Write a constructor for the class Movie, which takes a String representing the title of the movie, a String representing the studio, and a String representing the rating as its arguments, and sets the respective class variables to these values.
Req 2: Write a second constructor for the class Movie, which takes a String representing the title of the movie and a String representing the studio as its arguments, and sets the respective class variables to these values, while the class variable rating is set to “PG”.
Req 3: Write a method getPg, which takes an array of base type Movie as its argument, and returns a new array of only those movies in the input array with a rating of “PG”. You may assume that the input array is full of Movie instances. The returned array need not be full.
Req 4: Write a piece of code that creates an instance of the class Movie with the title “Casino Royale”, the studio “Eon Productions”, and the rating “PG-13”.

 */
package Day5_06_06_2022;

import java.util.Arrays;
import java.util.Scanner;

class Movie
{
    private String title;
    private String studio;
    private String rating;

    Movie(String title, String studio, String rating)
    {
        this.title=title;
        this.studio=studio;
        this.rating=rating;
    }
    Movie(String title,String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }
    static public Movie[] getPG(Movie[] movies)
    {
        Movie[] ans = new Movie[0];
        for(int i=0; i< movies.length; i++)
        {
            if(movies[i].getRating().equals("PG"))
            {
                ans = Arrays.copyOf(ans, ans.length+1);
                ans[ans.length-1] = movies[i];
            }
        }
        return ans;
    }
    public void display()
    {
        System.out.println("Title is "+title);
        System.out.println("Studio is "+studio);
        System.out.println("Rating is "+rating);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
public class Q39_Movie {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the title: ");
        String title=scan.next();
        System.out.print("Enter the studio: ");
        String studio=scan.next();
        System.out.print("Enter the rating: ");
        String rating=scan.next();

        Movie m1=new Movie(title,studio,rating);
        m1.display();

        System.out.print("\nEnter the title: ");
        title=scan.next();
        System.out.print("Enter the studio: ");
        studio=scan.next();

        Movie m2=new Movie(title,studio);
        m2.display();


        System.out.println("Enter the size of Array of objects of type Movie: ");
        int arrayLength= scan.nextInt();
        Movie[] m3 = new Movie[arrayLength];
        for(int i=0; i<arrayLength; i++)
        {
            System.out.print("Enter the title: ");
            title=scan.next();
            System.out.print("Enter the studio: ");
            studio=scan.next();
            System.out.print("Enter the rating: ");
            rating=scan.next();

            m3[i] = new Movie(title,studio,rating);
        }
        Movie[] movies = Movie.getPG(m3);
        for (Movie temp: movies) {
            temp.display();
        }

        Movie m4=new Movie("Casino Royale","Eon Productions","PG-13");
        m4.display();
    }
}
