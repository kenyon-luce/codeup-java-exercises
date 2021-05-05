package movies;

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

//    public setMovie(String name, String category){
//
//    }

    public String setName(String name){
        this.name = name;
        return name;
    }

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
}
