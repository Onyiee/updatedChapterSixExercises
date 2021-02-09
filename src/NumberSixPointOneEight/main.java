package NumberSixPointOneEight;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        DisplayingASquareOfAsterisks displayingASquareOfAsterisks = new DisplayingASquareOfAsterisks();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of times you would like to print for: ");
        displayingASquareOfAsterisks.setNumberOfAsterisks(scan.nextInt());

        displayingASquareOfAsterisks.getSquareOfAsterisks();
    }
}
