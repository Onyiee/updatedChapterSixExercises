package NumberSixPointOneSeven;
//6.17 (Even or Odd) Write a method isEven that uses the remainder operator (%) to determine
//        whether an integer is even. The method should take an integer argument and return
//        true if the integer is even and false otherwise. Incorporate this method into an
//        application that inputs a sequence of integers (one at a time) and determines whether
//        each is even or odd.


import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = input.nextInt();

        System.out.printf("Is %d an even number? %b", number, isEven(number));
//        System.out.printf("number %d %s",number,isEven(number)? "
//        is an even number " : " is an odd number ");



    }
    public static boolean isEven(int number){
        boolean condition = false;
         if(number % 2 == 0){
             condition = true;
         }
        return condition;
    }
}
