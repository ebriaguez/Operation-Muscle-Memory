package hw4;

public class Movie {
    //instance variables
    String title;
    String genre;
    int rating;

    //Parameterized constructor
    Movie(String title, String genre, int rating){
        this.title = title;
        this.genre = genre;
        this.rating = rating;


    }

    void playIt(){
        System.out.println("Playing the movie");
    }
}
