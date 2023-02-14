import java.util.Scanner;

public class MethodsExercises {

//TODO: 1 Basic Arithmetic

//    A. Create four separate methods. Each will perform an arithmetic operation:

//    *Addition
//    public static int addTwo(int num1, int num2){
//        return num1+num2;
//    }

//    *Subtraction
//    public static int subtracTwo(int num1, int num2){
//        return num1-num2;
//    }

//    *Multiplication
//    public static int multiplyTwo(int num1, int num2){
//        return num1*num2;
//    }

//    *Division
//    public static int dividTwo(int num1, int num2){
//        return num1 / num2;
//    }

//    D. Add a modulus method that finds the modulus of two numbers.
//    public static int modulus (int num1, int num2){ //modulus displays the remaining int from the divided numbers.
//        return num1 % num2;
//    }


//    Food for thought: What happens if we try to divide by zero? What should happen?

//********************Bonus

//    A. Create your multiplication method without the * operator (Hint: a loop might be helpful).
//    B. Do the above with recursion.

    //TODO: 2 Create a method that validates that user input is in a certain range and returns that input as an integer if it is within the given range. If not, prompt the user to input their number again until the input is within range.


//    public static int getInteger(int min, int max) {
//        Scanner sc = new Scanner(System.in);
//        int userInput = sc.nextInt();
//
//        if(userInput >= min && userInput <= max){
//            return 666;
//        } else {
//            return 0;
//        }
//    }

//    recursion
    public static boolean getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");

        int userInput = sc.nextInt();
        if (userInput >= min && userInput <= max){
            return true;
        } else {
            System.out.println(getInteger(min,max));
            return false;
        }

    }


    //TODO: 3 Calculate the factorial of a number.

//    * Prompt the user to enter an integer from 1 to 10.
//    * Display the factorial of the number entered by the user.
//    * Ask if the user wants to continue.
//    * Use a for loop to calculate the factorial.
//    * Assume that the user will enter an integer, but verify it’s between 1 and 10.
//    * Use the long type to store the factorial.
//    * Continue only if the user agrees to.
//    * A factorial is a number multiplied by each of the numbers before it.
//    * Factorials are denoted by the exclamation point (n!). Ex:
//
//
//    1! = 1               = 1
//    2! = 1 x 2           = 2
//    3! = 1 x 2 x 3       = 6
//    4! = 1 x 2 x 3 x 4   = 24

//********************Bonus

//    * Test the application and find the integer for the highest factorial that can be accurately calculated by this application, then modify the prompt so that it prompts the user for a number "from 1 to {the highest integer that returns accurate factorial calculation}". Don’t forget to change your verification too!

//    * Use recursion to implement the factorial.

    // TODO: 4 Create an application that simulates dice rolling.


    public static void main(String[] args) {

//        System.out.println(addTwo(2,2));
//        System.out.println(subtracTwo(2, 2));
//        System.out.println(multiplyTwo(2,2));
//        System.out.println(dividTwo(2,2));
//        System.out.println(modulus(10,4));

        System.out.println(getInteger(1,10));


//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = getInteger(1, 10);

    }
}
