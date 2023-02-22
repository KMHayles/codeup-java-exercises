package shapes;

public class ShapesTest {

    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(5,4);
//        System.out.println(box1.getArea());
//        System.out.println(box1.getParameter());

//        Square s = new Square(5);
//        System.out.println(s.getArea());
//        System.out.println(s.getParameter());

//        Rectangle square = new Square(5);
//        System.out.println(square.getArea());
//        System.out.println(square.getParameter());

        Measurable myShape = new Square(5);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());

        myShape = new Rectangle(4, 5);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());

    }

}
