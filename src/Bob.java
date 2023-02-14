import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        //TODO: Create a class named Bob with a main method for the following exercise.

        Scanner sc = new Scanner(System.in);
        System.out.println("Ask Bob a question:");
        String userInput = sc.nextLine();

        if(userInput.endsWith("?")){
            System.out.println("Sure");
        } else if (userInput.endsWith("!")) {
            System.out.println("Whoa, chill out!");
        } else if (userInput.equals("")) {
            System.out.println("Fine. Be that way!"); {
            }
        } else {
            System.out.println("Whatever");
        }

    }
}
