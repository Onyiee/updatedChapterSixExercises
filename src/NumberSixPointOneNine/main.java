package NumberSixPointOneNine;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        DisplayingTheSquareOfAnyCharacter displayingTheSquareOfAnyCharacter;
        displayingTheSquareOfAnyCharacter = new DisplayingTheSquareOfAnyCharacter();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of times a character should be displayed: ");
        displayingTheSquareOfAnyCharacter.setNumberOfTimesToDisplayCharacter(input.nextInt());

        System.out.println("Enter a character to display: ");
        char fill=input.next().charAt(0);
        displayingTheSquareOfAnyCharacter.setCharacterToDisplay(fill);

        displayingTheSquareOfAnyCharacter.SquareOfCharacter();

    }
}
