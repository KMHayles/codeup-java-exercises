package shapes;

//import java.awt.*;

public class Rectangle {

    //------protected means it can only be accessed by inherited by their children etc...
    protected  int length;
    protected int width;

    //getters
    public int getArea() {
        return length * width;
    }

    public int getParameter() {
        return 2 * length + 2 * width;
    }

    //constructor
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

}
