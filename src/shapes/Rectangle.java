package shapes;

//import java.awt.*;

public class Rectangle {

    private static double length;
    private static double width;

    //getters
    public double getArea() {
        return length * width;
    }

    public double getParameter() {
        return 2 * length + 2 * width;
    }

    //constructor
    public Rectangle(double length, double width) {
        Rectangle.length = length;
        Rectangle.width = width;
    }

}
