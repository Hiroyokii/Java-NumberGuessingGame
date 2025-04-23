import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        int guess = 0;

        System.out.println("Guess a number between 1 - 100: ");

        Random randomIndex = new Random();
        int random = randomIndex.nextInt(100) + 1;
        
        while (guess != random) {
            System.out.print("Your guess: ");
            guess = input.nextInt();

            if (guess < random){
                System.out.println("Higher!");
            } else if (guess > random) {
                System.out.println("Lower!");
            } else {
                System.out.println("You Win!");
            }   
        }
        input.close();
    }
}
