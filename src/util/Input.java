package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        return this.scanner.next();
    }

//    public boolean yesNo(){
//        if(this.scanner.nextLine() == toString() ) {
//            return true;
//        }
//        return false;
//    }

    public int getInt(int min, int max){
        System.out.println("On a scale of 1 - 10, how much do you hate JAVA?");
        int x = scanner.nextInt();
        System.out.println("");

        if(x >= min && x <= max){
            System.out.println(x);
            return x;
        }
        System.out.println(0);
        return 0;
    }
//    public int getInt(min){
//        if(this.scanner.nextInt() >= 1 && this.scanner.nextInt() <= 10){
//            return this.scanner.nextInt();
//        }
//        return 0;
//    }
//
//    double getDouble(double min, double max){
//        return
//    }
//
//    double getDouble(){
//        return
//    }

    public static void main(String[] args) {
        Input i = new Input();
//        System.out.println("Do you like JAVA?");
//        System.out.println(i.getString());
//        System.out.println(i.yesNo());

        i.getInt(1, 10);
    }

}
