import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class HelloWorld {
    public static void main (String[] args){
//        System.out.println("Hello again");
//        int myFavoriteNumber = 7;
////        String myString = "3.14159";
////        float myNumber = 3.14F;
////
////
////        System.out.println(myFavoriteNumber);
////        System.out.println(myString);
////        System.out.println(myNumber);

//            int x = 5;
//            System.out.println(x++);
//            System.out.println(x);


//            int x = 5;
//            System.out.println(++x);
//            System.out.println(x);

//

//        System.out.printf("The value of pi is approximately " + pi);

        //.2 is for two decimal points
//        System.out.printf("The value of pi is approximately %.2f.", pi);

//    Scanner sc = new Scanner(System.in);
//        System.out.println("enter integer");
//        int userInt = sc.nextInt();
//        System.out.println(userInt);



//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter 3 words");

//        String word1 = sc.nextLine();
//        String word2 = sc.nextLine();
//        String word3 = sc.nextLine();

//        String word1 = sc.next();
//        String word2 = sc.next();
//        String word3 = sc.next();

//        System.out.print(word1 + "\n" + word2 + "\n" + word3);
            //same
//        System.out.printf("%s\n%s\n%s", word1, word2, word3);


//justin's code
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter the length of the classroom: ");
//        double length = Double.parseDouble(sc.nextLine());
//
//        System.out.println("Enter the width of the classroom: ");
//        double width = Double.parseDouble(sc.nextLine());
//
//        double permieter = (length + width)*2;
//        double area = length * width;
//
//        System.out.println("The parimeter is: " + permieter);
//        System.out.println("The area is: " + area );


//Loop Basics

//While

//TODO: Create an integer variable i with a value of 5

//        int i = 5;

//TODO: Create a while loop that runs so long as i is less than or equal to 15

//        while (i <= 15) {
//            System.out.print("i is " + i);
//            i++;
//            System.out.println("This while loop is true");
//        }

//TODO: Each loop iteration, output the current value of i, then increment i by one
        //done


//Do While

//TODO: Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.

//    int i = 0;
//    do {
//        System.out.println("count by 2's:" + i); i+=2;
//    } while (i <= 100);



//TODO: Alter your loop to count backwards by 5's from 100 to -10.

//        int i = 100;
//        do {
//            System.out.println("count by down by 5's:" + i); i-=5;
//        } while (i >= -10);


//TODO: Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:

        //long has enough space for the problem to run, using an "int" doesn't allow for the amount of data.
//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i < 1000000);


//        2
//        4
//        16
//        256
//        65536


//For

//TODO: Refactor the previous two exercises to use a for loop instead.



//Fizzbuzz

//TODO: One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
        //done

//TODO: Write a program that prints the numbers from 1 to 100.

//        for(int i = 1; i <= 100; i += 1) {
//            System.out.println("i is " + i);
//        }


//TODO: For multiples of three: print “Fizz” instead of the number.

//    for(int i = 1; i <= 100; i++) {
//        if (i % 3 == 0) {
//            System.out.println("Fizz: " + i);
//        }
//    }

//TODO: For the multiples of five: print “Buzz”.

//    for(int i = 1; i <= 100; i++) {
//        if (i % 5 == 0) {
//            System.out.println("Buzz: " + i);
//        }
//    }

//TODO: For numbers which are multiples of both three and five: print “FizzBuzz”.

//    for(int i = 1; i <= 100; i++) {
//        if (i % 3 == 0 || i % 5 == 0) {
//            System.out.println("FizzBuzz: " + i);
//        }
//    }



//Display a table of powers.

//TODO: Prompt the user to enter an integer.
//TODO: Display a table of squares and cubes from 1 to the value entered.

//        Scanner sc = new Scanner(System.in);
//        System.out.println("What number would you like to go up to? ");
//        int userInt = sc.nextInt();

//TODO: Ask if the user wants to continue.

//        Scanner sc2 = new Scanner(System.in);
//        System.out.println("Do you want to continue? (yes or no)");
//
//        String userResponse = sc2.nextLine();
//
//        if(userResponse.equalsIgnoreCase("yes")){
//            System.out.println("here is your table");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//
//            for(int i = 1; i <= userInt; i += 1) {
//                System.out.println(i + "      |" + (i * i) + "       |" + (i*i*i));
//            }
//        } else {
//            System.out.println("fine by me, quitter...");
//        }


//TODO: Assume that the user will enter valid data.
//done


//TODO: Only continue if the user agrees to.
//justins example

        Scanner sc = new Scanner(System.in);
        boolean anotherGrade = true;

        do {
            System.out.println("Please enter a numerical grade from 0 to 100");

            int numbericGrade = sc.nextInt();

            if(numbericGrade >= 88) {
                System.out.println("A");
            } else if (numbericGrade >= 80) {
                System.out.println("B");
            } else if (numbericGrade >= 70) {
                System.out.println("C");
            } else if (numbericGrade >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
            System.out.print("Do you wish to continue? (yes of no)");

            String userResponse = sc.next();

            if (!userResponse.equalsIgnoreCase("yes")){
                anotherGrade = false;
            }
        } while (anotherGrade);


/*Example Output
        What number would you like to go up to? 5

        Here is your table!

                number | squared | cubed
                ------ | ------- | -----
                1      | 1       | 1
        2      | 4       | 8
        3      | 9       | 27
        4      | 16      | 64
        5      | 25      | 125


 */

//TODO: Convert given number grades into letter grades.


//TODO: Prompt the user for a numerical grade from 0 to 100.

//TODO: Display the corresponding letter grade.

//TODO: Prompt the user to continue.

//TODO: Assume that the user will enter valid integers for the grades.

//TODO: The application should only continue if the user agrees to.

/*        Grade Ranges:

        A : 100 - 88
        B : 87 - 80
        C : 79 - 67
        D : 66 - 60
        F : 59 - 0
*/

//TODO: Bonus

//Edit your grade ranges to include pluses and minuses (ex: 99-100 = A+).


    }

}
