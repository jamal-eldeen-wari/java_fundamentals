import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int dogCounter = 4;
        System.out.println("I own " + dogCounter + " " + pluralize("Dog", dogCounter) + ".");
        int catCounter = 1;
        System.out.println("I own " + catCounter + " " + pluralize("Cat", catCounter) + ".");
        int birdCount = 0;
        System.out.println("I own " + birdCount + " " + pluralize("Bird", birdCount) + ".");
        flipNHeads(8);
        clock();
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
        int counter = 0;
//        System.out.println(randomNumber);
        for(int i = 1; i<=numberOfFlips; i++){
            double randomNumber = random.nextDouble();
            System.out.println(randomNumber);
            if(randomNumber>=0.5){
//                heads
                System.out.println("heads");
                counter++;
                System.out.println(counter);
                if(counter==2){
//                    System.out.println("It took "+i+" flip to flip "+counter+" head in a row.");
                    numberOfFlips =i;
                    break;
                }

            }else{
//                tails
                counter = 0;
                System.out.println("tails");
            }
        }
        System.out.println("It took "+numberOfFlips+" flip to flip "+counter+" head in a row.");
    }
    public static void clock(){
        while (true){
            LocalDateTime localDateTime = LocalDateTime.now();
            int hour = localDateTime.getHour();
            int minute = localDateTime.getMinute();
            int second = localDateTime.getSecond();
            System.out.println(hour+" : "+minute+" : "+second);
            try{
//                Every one second to print a new line of the clock;
                Thread.sleep(1000);
            }catch (Exception e){

            }

        }



    }
}
