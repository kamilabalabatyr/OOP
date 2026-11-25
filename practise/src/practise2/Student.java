package practise2;

public class Student {
    private String name;
    private int ID;
    private int YearOfStudy;

    public Student(String name, int ID) {
        this.name = name;
        this.ID = ID;
        this.YearOfStudy = 1;
    }
    public String getName() {
        return name;
    }
    public int getID() {
        return ID;
    }
    public int getYear() {
        return YearOfStudy;
    }
    public void incrementYear() {
        YearOfStudy++;
    }
    
    public static void main(String[] args) {
        Student s = new Student("Kamila", 7);

        System.out.println("Name: " + s.getName());
        System.out.println("ID: " + s.getID());
        System.out.println("Year: " + s.getYear());
        s.incrementYear();
        System.out.println("After increment: " + s.getYear());
    }
}
