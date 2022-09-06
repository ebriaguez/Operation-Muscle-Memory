package hw1;

public class BeerSong {
    public static void main(String[] args) {
        //declaring
        int beerNum = 99;
        String word = "bottles";

        while (beerNum > 0){ //this loop will run until a # is less than or equal to 0
            if (beerNum == 1){
                word = "bottle"; //singular, as in ONE bottle
            }

//            System.out.println(beerNum + " " + word + " of beer on the wall");
            System.out.println(beerNum + " " + word + " of beer.");
            System.out.println("Take one down");
            System.out.println("Pass it around.");
            beerNum--;

            if (beerNum >= 1){
                System.out.println(beerNum + " " + word + " of beer on the wall");
            }else{
                System.out.println("No more bottles of beer on the wall");
            }//end else
        }//end while loop
    }//end main method
}//end class

//My question is how do I remove the "s" in "1 bottles of beer on the wall"