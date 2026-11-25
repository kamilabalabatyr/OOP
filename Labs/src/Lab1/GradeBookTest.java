package Lab1;

import practise2.Student;
import java.util.*;

public class GradeBookTest {
    public static void main(String[] args) {

        Course course = new Course(
                "CS101 Object-oriented Programming and Design",
                "Intro to OOP concepts",
                5
        );

        GradeBook gb = new GradeBook(course);

        Student s1 = new Student("Kamila", 1);
        Student s2 = new Student("Amina", 2);
        Student s3 = new Student("Dias", 3);
        Student s4 = new Student("Alina", 4);

        gb.addStudent(s1);
        gb.addStudent(s2);
        gb.addStudent(s3);
        gb.addStudent(s4);

        gb.displayMessage();
        System.out.println("\nPlease, input grades:");

        Scanner sc = new Scanner(System.in);

        for (Student s : gb.getStudents()) {
            while (true) {
                System.out.print(s + ": ");
                String input = sc.nextLine();
                try {
                    int grade = Integer.parseInt(input);
                    if (grade < 0 || grade > 100) {
                        System.out.println("Grade must be between 0 and 100.");
                        continue;
                    }
                    gb.setGrade(s, grade);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Enter number 0-100.");
                }
            }
        }

        System.out.println();
        gb.displayGradeReport();

        sc.close();
    }
}
