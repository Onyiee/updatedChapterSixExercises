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
    public GuessNumber(){
        randomNumber= rand.nextInt(20);
        randomNumber += 1;
    }

    public int compareRandomNumber(int userGuess){
        if(userGuess < randomNumber){
            System.out.println("Number is too low, try again");
            return -1;
        }
        if(userGuess > randomNumber){
            System.out.println("Number is too high, try again");
            return 1;
        } else {
            System.out.println("Congratulations! Do you want to play again?");
            System.out.println("Exit");
            return 0;
        }

    }
    public void resetRandomNumber(){
        if (randomNumber <= 1 || randomNumber >= 20){
            randomNumber = rand.nextInt(20);
            randomNumber += 1;
        }

    }

    private void setRandomNumber(int randomNumber)
      {
            SecureRandom random = new SecureRandom();
            this.randomNumber = randomNumber;
    }

    private int getRandomNumber(){
        return randomNumber;
    }
}