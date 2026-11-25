package Lab2;

import java.util.HashSet;

public class TestProb1c {
    public static void main(String[] args) {
        HashSet<Employee> employees = new HashSet<>();

        Employee e1 = new Employee("Kamila", 19, "E001");
        Employee e2 = new Employee("Kamila", 19, "E001");
        Employee e3 = new Employee("Aruzhan", 20, "E002");

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);

        System.out.println("Number of employees in HashSet: " + employees.size());
        System.out.println("Employees:");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
