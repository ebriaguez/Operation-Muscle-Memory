package hw3;

public class Pokemon {

    String name;
    int level;

    //constructor uses class name
    Pokemon(){
        level = 1;
    }

    Pokemon(String pName, int pLevel){
        name = pName;
        level = pLevel;

    }

    void attack(){
        System.out.println(name + " attack!");
    }
}
