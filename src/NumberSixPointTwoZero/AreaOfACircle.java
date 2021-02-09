package NumberSixPointTwoZero;

public class AreaOfACircle {
    private static final double pi = 3.142;
    private double radius;



    public double getRadius() {
        return radius;
    }

    public double circleArea( double radius) {
        return pi * (radius * radius);
    }

}
