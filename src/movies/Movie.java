package movies;

import java.util.Arrays;

//    public static void main(String[] args){
//        //will be used in MoviesApplication.class
//    }
public class Movie {
    private String name;
    private String category;

    public Movie (String name, String category){
        this.name = name;
        this.category = category;
    }

//    public String setName(String name){
//        this.name = name;
//        return name;
//    }

    public String getName(){
        return name;
    }

    public String setCat(String category){
        this.name = name;
        return name;
    }

    public String getCat(){
        return category;
    }

    public static Movie[] addMovie(Movie[] movies, String name, String category){
        Movie [] newMovies = Arrays.copyOf(movies, movies.length + 1);
        newMovies[movies.length] = new Movie(name, category);

        return newMovies;
    }
}
