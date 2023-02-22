import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

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

    }

}
