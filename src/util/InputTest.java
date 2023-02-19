package util;

public class InputTest {
    public static void main(String[] args) {
        Input i = new Input();
        System.out.println("Do you like JAVA?");
        System.out.println(i.getString());
//        System.out.println(i.yesNo());

        i.getInt(1, 10);
    }
}
