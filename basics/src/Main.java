import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int dogCounter = 4;
        System.out.println("I own " + dogCounter + " " + pluralize("Dog", dogCounter) + ".");
        int catCounter = 1;
        System.out.println("I own " + catCounter + " " + pluralize("Cat", catCounter) + ".");
        int birdCount = 0;
        System.out.println("I own " + birdCount + " " + pluralize("Bird", birdCount) + ".");
        flipNHeads(0);
    }

    public static String pluralize(String word, int count){

        if(count==0 || count >1){
            return word+'s';
        }else{
            return word;
        }

    }

    public static void flipNHeads(int numberOfFlips){
        Random random = new Random();
        double randomNumber = random.nextDouble();
        System.out.println(randomNumber);
    }
}
