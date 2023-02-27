package util;

public class InputTest {

    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("Enter a number!");
        double num = input.getDouble();
        System.out.println(num);
    }

//    public static void main(String[] args) {
//        Input i = new Input();
//        System.out.println("Do you like JAVA?");
//        System.out.println(i.getString());
//        System.out.println(i.yesNo());

//        i.getInt(1, 10);
//        i.getDouble(1,10);

    }
//}

//    Improve your Input class.
//
//        Your getInt and getDouble methods should make sure that the value returned from the method is actually an int or a double. You can do this by replacing the use of the Scanner nextInt() and nextDouble() methods with the existing getString() method you created in a previous exercise using the following methods to convert the returned String into the desired datatype:
//
//
//        Integer.valueOf(String s);
//        Double.valueOf(String s);
//        Note these methods will throw a NumberFormatException if the given input cannot be parsed as an int or double. Your methods on the Input class should handle these exceptions, you can use a try-catch for this.
