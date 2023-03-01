package shapes;

public class Square extends Quadrilateral {


    public Square(int side) {
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        return length * 4;
    }

    @Override
    public double getArea() {
        return length * length;
    }

    @Override
    public void setLength(int length) {
        this.length = length;
        setWidth(length);
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
        setLength(width);
    }
}


////    CONSTRUCTOR    You need a constructor when extending (super). when taking in the parent you need to
//    public Square(int side) {
//        super(side, side);
//    }
//
//    @Override
//    public int getArea(){
//        System.out.println("happy path");
//        return length * length;
//    }
//
//    @Override
//    public int getParameter(){
//        System.out.println("sad path");
//        return 4 * length;
//    }


