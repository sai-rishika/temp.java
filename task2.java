import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
      
        Random random = new Random();
      
        int randomNumber = random.nextInt(100) + 1;
        
      
        Scanner scanner = new Scanner(System.in);
        
        int userGuess;
        boolean hasGuessedCorrectly = false;
        
        System.out.println("Welcome to the Guess the Number game!");
        System.out.println("I've picked a number between 1 and 100. Try to guess it.");
        
 
        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            
          
            if (userGuess < randomNumber) {
                System.out.println("Your guess is too low. Try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Your guess is too high. Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the correct number: " + randomNumber);
                hasGuessedCorrectly = true;
            }
        }
        
       
        scanner.close();
    }
}
