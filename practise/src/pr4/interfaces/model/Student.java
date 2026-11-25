package pr4.interfaces.model;

public class Student extends Person implements CanHavePizza, CanHaveRetake, Movable, Comparable<Student> {

    private double gpa;

    public Student(String name, double gpa) {
        super(name);
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public void eatPizza() {
        System.out.println(name + " is eating pizza");
    }

    @Override
    public void retakeExam() {
        System.out.println(name + " is retaking the exam");
    }

    @Override
    public void move() {
        System.out.println(name + " is moving");
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(this.gpa, o.gpa);
    }

    @Override
    public String toString() {
        return name + " GPA: " + gpa;
    }
}