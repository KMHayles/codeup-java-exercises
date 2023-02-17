import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];
        people[0] = new Person("Steven", 25);
        people[1] = new Person("Ken", 36);
        people[2] = new Person("Larry", 39);

//        for (Person person: people) {
//            System.out.println(person.getName()); //getName pulls out the name of the people
//        }

        people = Person.addPerson(people, new Person("Jeff", 33));

        for (Person person: people) {
            System.out.println(person.getName()); //getName pulls out the name of the people
        }

        /*
        //JAVA built in method

        public static String toString(int[] a) {
            if (a == null)
                return "null";
            int iMax = a.length - 1;
            if (iMax == -1)
                return "[]";

            StringBuilder b = new StringBuilder();
            b.append('[');
            for (int i = 0; ; i++) {
                b.append(a[i]);
                if (i == iMax)
                    return b.append(']').toString();
                b.append(", ");
            }
        }
        */



    // TODO: Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.

        /*
        // Make an addPerson static method that takes in an array of Person objects and a single person object.

        // Add souts to the addPerson method to print out the contents of the array of people and the additional person object.

        // Call the addPerson method in a main method, passing in an array of person objects as the first argument and a second argument for another person argument to add. Verify that you can sout out the array of people and the person object to add.

        //Go back to the addPerson method and add the needed logic to add a person object to the array of people (the first parameter of the method). It will be helpful to use the Arrays.copyOf method to do this. Take a look at the lecture example code for how to use this method.
         */



    }




}
