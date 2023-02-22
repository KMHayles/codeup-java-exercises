package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        double radius = input.getDouble("Enter the radius of the circle: ");

        Circle circle = new Circle(radius);

        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);

        System.out.printf("The circumference of the circle is: %.2f%n", circumference);
        System.out.printf("The area of the circle is: %.2f%n", area);
    }
}
