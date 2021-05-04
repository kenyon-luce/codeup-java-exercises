package movies;

//    public static void main(String[] args){
//        //will be used in MoviesApplication.class
//    }
public class Movie {
    private String name;
    private String category;

    //using constructors (getters and setters)
    //getters
    public static String getName(Movie movie){ //grabs name (from Movie class)
        return movie.name;
    }
    public static String getCat(Movie movie){ //grabs category
        return movie.category;
    }

    //setter
    public void setName(String name){ //changes name info
        this.name = name;
    }
    public void setCat(String category){ //changes category info
        this.category = category;
    }

    //putting it all together
    public void getMovie(String name, String category){
        setName(name);
        setCat(category);
    }

}
