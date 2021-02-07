package NumberSixPointThreeZero;

import java.security.SecureRandom;
import java.util.Random;

//(Guess the Number) Write an application that plays “guess the number” as follows: Your
//program chooses the number to be guessed by selecting a random integer in the range 1 to 1000.
//The application displays the prompt Guess a number between 1 and 1000. The player inputs a first
//guess. If the player's guess is incorrect, your program should display Too high. Try again. or Too
//low. Try again. to help the player “zero in” on the correct answer. The program should prompt the
//user for the next guess. When the user enters the correct answer, display Congratulations. You
//guessed the number!, and allow the user to choose whether to play again. [Note: The guessing technique
//employed in this problem is similar to a binary search, which is discussed in Chapter 19,
//Searching, Sorting and Big O.]
public class GuessNumber {

    SecureRandom rand = new SecureRandom();
    int randomNumber;

    public GuessNumber() {
        randomNumber = 1 + rand.nextInt(1000);

    }

    public int compareRandomNumber(int userGuess) {
        if (userGuess >0 && userGuess <= 1000) {
            if (userGuess < randomNumber) {
                return -1;
            }
            if (userGuess > randomNumber) {
                return 1;
            } else {
                return 0;
            }
        } else {
            return -1000;
        }


    }

    public void resetRandomNumber() {
            randomNumber = 1 + rand.nextInt(1000);
    }

}