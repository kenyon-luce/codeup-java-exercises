package movies;

import util.Input;

import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        System.out.println(getMovie());
        System.out.println(
                "What would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the sci-fi category\n" +
                "\n" +
                "Enter your Choice:  "
        );
        int input = Input.getInt(0, 6);

        switch(input){
            case 0:
                System.out.println("See you next time");
                break;
            case 1:

        }

//        Movie[] movieList = MoviesArray.findAll();
//        for(Movie movie : movieList){
//            System.out.println(movie.getName() + " " + movie.getCat());
//        }
    }
}
