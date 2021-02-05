package NumberSixPointThreeZero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GuessNumber guessNumber = new GuessNumber();
         int randomNumber;

        System.out.println("Enter a random number: ");
        Scanner scan = new Scanner(System.in);
         randomNumber = scan.nextInt();
        guessNumber.compareRandomNumber(randomNumber);

        for (int i = 0; i < 5; i++) {
             scan = new Scanner(System.in);
            System.out.println("Enter a random number: ");
            randomNumber = scan.nextInt();

            guessNumber.compareRandomNumber(randomNumber);
        }
        guessNumber.resetRandomNumber();
    }
}
