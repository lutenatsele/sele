import java.util.Random;

public class RandomNumberGenerator {

    public static void main(String[] args) {

        // Create a new instance of the Random class
        Random random = new Random();

        // Generate a random integer
        int randomNumber = random.nextInt();

        // Print the random number to the console
        System.out.println("Random Number: " + randomNumber);
    }
}
