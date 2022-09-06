package hw2;

public class PhraseOMatic {
    public static void main(String[] args) {
        String[] describeKai = {"loving", "crazy", "curious", "trouble-maker", "fearless"};
        String[] describeMe = {"thoughtful", "caring", "positive", "weird", "bubbly"};
        String[] describeMakaila = {"scary", "cool", "PASSIONATE", "inspiring", "very helpful"};

        int totalForKai = describeKai.length;
        int totalForMe = describeMe.length;
        int totalForMakaila = describeMakaila.length;

        int randomKai = (int) (Math.random() * totalForKai);
        int randomMe = (int) (Math.random() * totalForMe);
        int randomMakaila = (int) (Math.random() * totalForMakaila);

        String statement = describeKai[randomKai] + " " + describeMe[randomMe] + " " + describeMakaila[randomMakaila];

        System.out.println("What we need is " + statement);
    }
}

//Question: explain the part where you use the Math.random method