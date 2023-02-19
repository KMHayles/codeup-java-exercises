package shapes;

public class Square extends Rectangle {

//    CONSTRUCTOR    You need a constructor when extending (super). when taking in the parent you need to
    public Square(int side) {
        super(side, side);
    }

    @Override
    public int getArea(){
        System.out.println("happy path");
        return length * length;
    }

    @Override
    public int getParameter(){
        System.out.println("sad path");
        return 4 * length;
    }

}
