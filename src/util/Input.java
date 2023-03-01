//package util;
//
//import java.util.Scanner;
//
//public class Input {

//    private Scanner scanner;

//    public Input() {
//        this.scanner = new Scanner(System.in);
//    }


//    public String getString(){
//        return this.scanner.next();
//    }

//    public boolean yesNo(){
//        System.out.println("Entering y/yes or n/no returns Boolean value: \n");
//        String bool = (System.console().readLine());
//        if(bool.matches("(?i)y|yes|true")) {
//            bool = String.valueOf(true);
//        } else if (bool.matches("(?i)n|no|false")) {
//            bool = String.valueOf(false);
//        } else {
//            bool = null;
//        }
//        System.out.println("\nBoolean is " + bool + "\n=============");
//        return false;
//    }


//    public int getInt(int min, int max){
//        System.out.println("On a scale of 1 - 10, how much do you hate JAVA?");
//        int x = scanner.nextInt();
//        System.out.println("");
//
//        if(x >= min && x <= max){
//            System.out.println(x);
//            return x;
//        }
//        System.out.println(0);
//        return 0;
//    }

//    public int getInt(){
//        if(this.scanner.nextInt() >= 1 && this.scanner.nextInt() <= 10){
//            return this.scanner.nextInt();
//        }
//        return 0;
//    }

//    double getDouble(double min, double max){
//        System.out.println("On a scale of 1 - 10, how much do you love JAVA?");
//        int x = scanner.nextInt();
//        System.out.println("");
//
//        if(x >= min && x <= max){
//            System.out.println("You said:" + x);
//            return x;
//        }
//        return 0;
//    }

//    public double getDouble(String s) {
//        return 0;
//    }
//
//    double getDouble(){
//        return
//    }

package util;

import java.util.Scanner;

    public class Input {

        private final Scanner scanner;

        public Input() {
            this.scanner = new Scanner(System.in);
        }

        public String getString(){
            System.out.println("Enter your input:");
            return scanner.nextLine();
        }

        public String getString(String prompt){
            System.out.println(prompt);
            return scanner.nextLine();
        }

        // Solution: David Lara and John Pedrotti - Dr. Javier lesson
        public boolean yesNo(){
            System.out.println("Yes or no?");
            String userInput = scanner.nextLine();
            return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
        }

        /*
            TODO: refactor this method to use Integer.valueOf(getString()) and surround it with a try-catch block to
             to catch the NumberFormatException. If the exception is caught, call the getInt() method again.
         */
        public int getInt(){
            String userInput = getString();
            try {
                return Integer.parseInt(userInput);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input type. Enter a number!");
                return getInt();
            }
        }

//    public static void main(String[] args) {
//        Input input = new Input();
//        System.out.println("Enter a number!");
//        int num = input.getInt();
//        System.out.println(num);
//    }

        public int getInt(String prompt){
            System.out.println(prompt);
            return scanner.nextInt();
        }

        public int getInt(int min, int max){
            String prompt = "Enter an integer between " + min + " and " + max + ":";
            System.out.println(prompt);
            int userInput = getInt();
            while (userInput < min || userInput > max){
                System.out.println(prompt);
                userInput = scanner.nextInt();
            }
            return userInput;
        }

        /*
            TODO: refactor this method to use Double.valueOf(getString()) and surround it with a try-catch block to
             to catch the NumberFormatException. If the exception is caught, call the getDouble() method again.
         */
        public double getDouble(){
            String userInput = getString();
            try {
                return Double.valueOf(userInput);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input type. Enter a number!");
                return getInt();
            }
        }

        public double getDouble(String prompt){
            System.out.println(prompt);
            return scanner.nextDouble();
        }

        public double getDouble(double min, double max){
            String prompt = "Enter an number between " + min + " and " + max + ":";
            System.out.println(prompt);
            double userInput = getDouble();
            while (userInput < min || userInput > max){
                System.out.println(prompt);
                userInput = scanner.nextDouble();
            }
            return userInput;
        }
    }






//}
