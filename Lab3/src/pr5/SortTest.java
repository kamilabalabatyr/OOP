package pr5;

import java.util.Date;

import Pr4.Employee;

public class SortTest {
    public static void main(String[] args) {
        
        // тест с Chocolate
        Chocolate[] chocolates = {
            new Chocolate("Twix", 58.0),
            new Chocolate("KitKat", 45.0),
            new Chocolate("Snickers", 62.0)
        };
        
        Sort.bubbleSort(chocolates);
        for (Chocolate c : chocolates) {
            System.out.println(c);
        }
        
        // тест с Employee
        Employee[] employees = {
            new Employee("Aisha", 150000, new Date(), "INS-001"),
            new Employee("Bekzat", 200000, new Date(), "INS-002")
        };
        
        Sort.selectionSort(employees);
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
