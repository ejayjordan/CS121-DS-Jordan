import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String guess;
        int tries = 0;
        int correct = 50;
        int variableguess = 0;

        while (true) {
            System.out.println("Guess a number between 1 and 100, enter 'q' to give up.");
            guess = input.nextLine();
            tries++;

            if (guess.contentEquals("q")) {
                System.out.println("Quitter! The number was: " + correct);
                break;
            }else {
                variableguess = parseInt(guess);
            }
            if (variableguess < 1 || variableguess > 100) {
                System.out.println("Invalid input");
            }else if (variableguess == correct) {
                System.out.println("Correct! Number of guesses: " + tries);
                break;
            }else if (variableguess < correct) {
                System.out.println("Too low! Try again.");
            }else if (variableguess > correct) {
                System.out.println("Too high! Try again.");
            }else{
                System.out.println("Invalid input. Try again.");
            }
        }

        }
    }