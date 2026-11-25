package pr4.interfaces.main;

import pr4.interfaces.model.*;
import pr4.interfaces.services.*;

public class Main {

    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant();

        Cat cat = new Cat("Koshka");
        Student student = new Student("Ali", 3.5);

        restaurant.servePizza(cat);
        restaurant.servePizza(student);
        
        int[] numbers = {4, 2, 7, 2, 1, 9, 0, 5, 13, 3};

        CountingSort.sort(numbers);
    }
}