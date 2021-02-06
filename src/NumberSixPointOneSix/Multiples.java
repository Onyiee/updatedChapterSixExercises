package NumberSixPointOneSix;

import java.util.Scanner;

//6.16 (Multiples) Write a method isMultiple that determines, for a pair of integers, whether the
//        second integer is a multiple of the first. The method should take two integer arguments
//        and return true if the second is a multiple of the first and false otherwise. [Hint: Use the
//        remainder operator.]Incorporate this method into an application that inputs a series
//        of pairs of integers(one pair at a time) and determines whether the second value in each
//        pair is a multiple of the first.
//
public class Multiples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int firstNumber = scan.nextInt();

        System.out.println("Enter a second number: ");
        int secondNumber = scan.nextInt();

        System.out.printf("%d%s%d",secondNumber,
                (isMultiples(firstNumber, secondNumber)?" is a multiple of ":" is not a multiple of ")
                ,firstNumber);


    }
    public static boolean isMultiples(int number1, int number2){
        boolean condition=false;
     if (number2 % number1 == 0){
         condition=true;
     }
     return condition;
  }

}
