package NumberSixPointThreeZero;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        GuessNumber guessNumber = new GuessNumber();
        Scanner scan = new Scanner(System.in);
        int randomNumber;
        int sentinel = 1;
        while (sentinel != -1) {
            System.out.println("Enter a random number: ");
            randomNumber = scan.nextInt();
            int score = guessNumber.compareRandomNumber(randomNumber);
            if (score == -1) {
                System.out.println("Too low try again");
            } else if (score == 1) {
                System.out.println("Too high try again ");
            } else if (score == -1000) {
                System.out.println("Guess must be between 1 and 1000");
            } else {
                System.out.println("Congrats \nPress 1 to play again, 2 to exit ");
                int userChoice = scan.nextInt();
                if (userChoice == 1) {
                    guessNumber.resetRandomNumber();
                } else {
                    sentinel = -1;
                }
            }
        }
    }
}
