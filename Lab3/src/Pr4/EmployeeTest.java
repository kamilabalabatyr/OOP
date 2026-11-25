package Pr4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class EmployeeTest {
public static void main(String[] args) {
        
        Employee e1 = new Employee("Kamila", 150000, new Date(), "INS-001");
        Employee e2 = new Employee("Karakat", 200000, new Date(), "INS-002");
        Employee e3 = new Employee("Amina", 100000, new Date(), "INS-003");
        
        Employee[] employees = {e1, e2, e3};
        
        // сортировка по зарплате Comparable
        Arrays.sort(employees, Comparator.reverseOrder());
        for (Employee e : employees) {
            System.out.println(e);
        }
        
        // сортировка по имени Comparator
        Arrays.sort(employees, new EmployeeNameComparator());
        for (Employee e : employees) {
            System.out.println(e);
        }
        
     // тест Employee shallow
        Employee emp1 = new Employee("Aisha", 150000, new Date(), "INS-001");
        Employee emp2 = emp1.clone();
        emp2.setName("Bekzat");

        System.out.println(emp1.getName()); 
        System.out.println(emp2.getName()); 

        // тест Manager deep
        Manager mgr1 = new Manager("Kamila", 300000, new Date(), "INS-010", 50000);
        mgr1.addEmployee(emp1);

        Manager mgr2 = mgr1.clone();
        mgr2.addEmployee(emp2); 

        System.out.println(mgr1.getTeam().size());
        System.out.println(mgr2.getTeam().size()); 
    }

}
