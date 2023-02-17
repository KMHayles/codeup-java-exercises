import java.util.Arrays;

public class ArraysExercises {

    public static void addPerson(Person[] people, Person person) {
        Person[] newPeople = new Person[people.length + 1];
        for (int i = 0; i < people.length; i++) {
            newPeople[i] = people[i];
        }
        newPeople[people.length] = person;
        people = newPeople;
    }


    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));

//        String[] people = new String[3];
//        people[0] = "Steven";
//        people[1] = "Ken";
//        people[2] = "Larry";
//
////        System.out.println(person[2]);
//
//        for (String person: people) {
//            System.out.println(person);
//        }

    // TODO: Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.

        /*
        // Make an addPerson static method that takes in an array of Person objects and a single person object.

        // Add souts to the addPerson method to print out the contents of the array of people and the additional person object.

        // Call the addPerson method in a main method, passing in an array of person objects as the first argument and a second argument for another person argument to add. Verify that you can sout out the array of people and the person object to add.

        //Go back to the addPerson method and add the needed logic to add a person object to the array of people (the first parameter of the method). It will be helpful to use the Arrays.copyOf method to do this. Take a look at the lecture example code for how to use this method.
         */



    }




}
