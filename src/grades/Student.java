package grades;
import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<Integer>();
    }

    // Getter methods
    public String getName() {
        return this.name;
    }

    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    // Setter method for adding a grade
    public void addGrade(int grade) {
        this.grades.add(grade);
    }
}
//public class Student {
//
//    private String studentNames()
//
//    // returns the student's name
//    public String getName();
//
//    // adds the given grade to the grades property
//    public void addGrade(int grade);
//
//    // returns the average of the students grades
//    public double getGradeAverage();
//
//}
