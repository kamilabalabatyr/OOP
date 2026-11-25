package Lab1;

import java.util.Scanner;

public class Analyzer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        Data data = new Data();

        while (true) {
            System.out.print("Enter number (Q to quit): ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("Q")) {
                break;
            }

            try {
                double value = Double.parseDouble(input);
                data.addValue(value);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or Q.");
            }
        }


        System.out.println("Average: " + data.getAvg());
        System.out.println("Max: " + data.getMax());
        
        sc.close();
    }
}
