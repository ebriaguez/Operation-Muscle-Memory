package hw4;

public class MovieTestDrive {
    public static void main(String[] args) {
        Movie one = new Movie("Gone with the Stock", "Tragic", -2);
//        one.title = "Gone with the Stock";
//        one.genre = "Tragic";
//        one.rating = -2;
        System.out.println("This is " + one.title + " " + "with the genre of " + one.genre + " and the rating of " + one.rating);

        Movie two = new Movie("Lost in Cubicle Space", "Comedy", 5);
//        two.title = "Lost in Cubicle Space";
//        two.genre = "Comedy";
//        two.rating = 5;
        System.out.println("This is " + two.title + " " + "with the genre of " + two.genre + " and the rating of " + two.rating);

        //invoke or call
        two.playIt();

        Movie three = new Movie("Byte Club", "Tragic but ultimately uplifting", 127);
//        three.title = "Byte Club";
//        three.genre = "Tragic but ultimately uplifting";
//        three.rating = 127;
        System.out.println("This is " + three.title + " " + "with the genre of " + three.genre + " and the rating of " + three.rating);

    }
}
