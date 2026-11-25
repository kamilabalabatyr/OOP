package pr4.interfaces.main;

import pr4.interfaces.model.Student;
import pr4.interfaces.services.NameComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main4 {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Ali", 3.5));
        students.add(new Student("Dana", 3.9));
        students.add(new Student("Arman", 2.8));

        Collections.sort(students); 

        Collections.sort(students, new NameComparator()); 

        for (Student s : students) {
            System.out.println(s);
        }
    }                                                 
}