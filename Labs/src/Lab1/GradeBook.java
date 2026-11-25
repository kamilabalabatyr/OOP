package Lab1;

import practise2.Student;
import java.util.*;

public class GradeBook {

    private Course course;
    private List<Student> students;
    private Map<Student, Integer> grades;

    public GradeBook(Course course) {
        this.course = course;
        this.students = new ArrayList<>();
        this.grades = new HashMap<>();
    }

    public GradeBook(Course course, List<Student> students) {
        this(course);
        for (Student s : students) {
            addStudent(s);
        }
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void setGrade(Student s, int grade) {
        grades.put(s, grade);
    }

    public void displayMessage() {
        System.out.println("Welcome to the grade book for " + course.getName() + "!");
    }

    public void displayGradeReport() {
        System.out.printf("Class average is %.2f.%n", determineClassAverage());

        Student minStudent = getMinStudent();
        Student maxStudent = getMaxStudent();

        System.out.println("Lowest grade is " + grades.getOrDefault(minStudent, 0) + " (" + minStudent + ").");
        System.out.println("Highest grade is " + grades.getOrDefault(maxStudent, 0) + " (" + maxStudent + ").");

        System.out.println();
        System.out.println("Grades distribution:");
        outputBarChart();
    }

    private double determineClassAverage() {
        if (students.isEmpty()) return 0;

        int sum = 0;
        for (Student s : students) {
            sum += grades.getOrDefault(s, 0);
        }
        return (double) sum / students.size();
    }

    private Student getMinStudent() {
        if (students.isEmpty()) return null;

        Student minS = students.get(0);
        int min = grades.getOrDefault(minS, 0);

        for (Student s : students) {
            int g = grades.getOrDefault(s, 0);
            if (g < min) {
                min = g;
                minS = s;
            }
        }
        return minS;
    }

    private Student getMaxStudent() {
        if (students.isEmpty()) return null;

        Student maxS = students.get(0);
        int max = grades.getOrDefault(maxS, 0);

        for (Student s : students) {
            int g = grades.getOrDefault(s, 0);
            if (g > max) {
                max = g;
                maxS = s;
            }
        }
        return maxS;
    }

    // 0-9, 10-19, ... 90-99, 100
    private void outputBarChart() {
        int[] freq = new int[11];

        for (Student s : students) {
            int g = grades.getOrDefault(s, 0);

            if (g < 0) g = 0;
            if (g > 100) g = 100;

            if (g == 100) freq[10]++;
            else freq[g / 10]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if (i == 10) System.out.printf("%5d: ", 100);
            else System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);

            for (int star = 0; star < freq[i]; star++) System.out.print("*");
            System.out.println();
        }
    }

    public List<Student> getStudents() {
        return new ArrayList<>(students);
    }

    @Override
    public String toString() {
        return "GradeBook{course=" + course + ", studentsCount=" + students.size() + "}";
    }
}
