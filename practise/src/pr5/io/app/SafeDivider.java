package pr5.io.app;

import java.util.Scanner;

public class SafeDivider {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean success = false;
        
        while (!success) {
            try {
                System.out.print("Enter first integer: ");
                int x1 = Integer.parseInt(scan.nextLine());
                
                System.out.print("Enter second integer: ");
                int x2 = Integer.parseInt(scan.nextLine());
                
                int result = x1 / x2;
                System.out.println("Result: " + x1 + " / " + x2 + " = " + result);
                success = true;
                
            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter valid integers only! Try again.");
            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero is not allowed! Try again.");
            }
        }
        
        scan.close();
    }
}