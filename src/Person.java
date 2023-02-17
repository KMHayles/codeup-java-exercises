import java.util.Arrays;

public class Person {
    private final int age;
    private String name;

    public static Person[] addPerson(Person[] people, Person person) {
        Person[] newPeopleArray = Arrays.copyOf(people, people.length +1);
        newPeopleArray[people.length] = person;
        return newPeopleArray;
    }


    //Ricardo's code
//    public static Person[] addPerson(Person[] people, Person newPerson) {
//        people = Arrays.copyOf(people, people.length + 1);
//        people[people.length - 1] = newPerson;
//        return people;
//    }


    public String getName(){
        return name;
    }

    public void setName(String name){

        this.name = name;
    }

    public void sayHello(){
        System.out.println("hello" + name);
    }

    //constructor
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    //converts @place data marker into a string to be displayed
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
//        Person person1 = new Person("Kenneth");
//        System.out.println(person1.getName());


//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);
//
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());


    }

}
