package NumberSixPointTwoZero;

import java.util.Scanner;

public class main {

    public static final Scanner SCAN = new Scanner(System.in);

    public static void main(String[] args) {
        AreaOfACircle areaOfACircle = new AreaOfACircle();

        Scanner SCAN = new Scanner(System.in);
        System.out.println("Enter a value for radius: ");
        double radius = SCAN.nextDouble();

        System.out.println("the Area of the circle is " + areaOfACircle.circleArea(radius));




    }
}
