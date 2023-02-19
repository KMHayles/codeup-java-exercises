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

    public boolean yesNo(){
        System.out.println("Entering y/yes or n/no returns Boolean value: \n");
        String bool = (System.console().readLine());
        if(bool.matches("(?i)y|yes|true")) {
            bool = String.valueOf(true);
        } else if (bool.matches("(?i)n|no|false")) {
            bool = String.valueOf(false);
        } else {
            bool = null;
        }
        System.out.println("\nBoolean is " + bool + "\n=============");
        return false;
    }


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
    public int getInt(){
        if(this.scanner.nextInt() >= 1 && this.scanner.nextInt() <= 10){
            return this.scanner.nextInt();
        }
        return 0;
    }

//    double getDouble(double min, double max){
//        return
//    }
//
//    double getDouble(){
//        return
//    }

}
