package NumberSixPointTwoZero;

public class AreaOfACircle {
    private double pi = 3.142;
    private double radius;


    public void setPi(double pi) {
        this.pi = pi;
    }

    public double getPi() {
        return pi;
    }

    public void setRadius(double r) {
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public double circleArea(double pi, double radius) {
        double areaOfCircle = pi * (radius * radius);
        return areaOfCircle;
    }
}
