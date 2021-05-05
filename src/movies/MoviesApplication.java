package movies;

import util.Input;

import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args) {
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

        //return movies based on input
        Movie[] movies = MoviesArray.findAll();
            switch (input) {
                case 0:
                    System.out.println("See you next time");
                    break;

                case 1:
                    for (Movie movie : movies) { //iterates through the movies array (line 26)
                        System.out.println(movie.getName() + " -- " + movie.getCat());
                    }
                    break;

                case 2:
                    for (Movie movie : movies) {
                        if (movie.getCat().equalsIgnoreCase("animated")) {
                            System.out.println(movie.getName() + " -- " + movie.getCat());
                        }
                    }
                    break;

                case 3:
                    for (Movie movie : movies) {
                        if (movie.getCat().equalsIgnoreCase("drama")) {
                            System.out.println(movie.getName() + " -- " + movie.getCat());
                        }
                    }

                    break;
                case 4:
                    for (Movie movie : movies) {
                        if (movie.getCat().equalsIgnoreCase("horror")) {
                            System.out.println(movie.getName() + " -- " + movie.getCat());
                        }
                    }
                    break;

                case 5:
                    for (Movie movie : movies) {
                        if (movie.getCat().equalsIgnoreCase("scifi")) {
                            System.out.println(movie.getName() + " -- " + movie.getCat());
                        }
                    }
                    break;
                case 6:
                    System.out.println(
                            "Add a movie: \n" +
                                    "What name?"
                    );
                    String movieName = sc.nextLine();

                    System.out.println(
                            "What category?"
                    );
                    String movieCat = sc.next();

                    Movie newMovie = new Movie(movieName, movieCat);
                    System.out.println(newMovie.toString());
                    //cant get it to display it as string, also need it to add to the array
            }

//        Movie[] movies = MoviesArray.findAll();
//        for(Movie movie : movies){
//            System.out.println(movie.getName() + " " + movie.getCat());
//        }
    }
}
