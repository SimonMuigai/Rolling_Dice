import java.util.Random;

public class Dice {
    public static void main(String[] args){

        Random numberGenerated = new Random();
        int x = numberGenerated.nextInt(6);
        System.out.println("You rolled a " + x);
    }
}
