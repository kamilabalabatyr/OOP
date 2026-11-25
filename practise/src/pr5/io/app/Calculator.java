package pr5.io.app;

import java.io.*;
import java.util.Scanner;

public class Calculator {
    private static final String RESULTS_FILE = "results.txt";
    private static final String ERROR_LOG = "log.txt";
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter expression or 'quit' to exit: ");
            String input = scanner.nextLine();
            
            if (input.equalsIgnoreCase("quit")) {
                break;
            }
            
            try {
                double result = evaluateExpression(input);
                logResult(input, result);
                System.out.println("Result: " + result);
            } catch (Exception e) {
                logError(input, e);
                System.err.println("Error: " + e.getMessage());
            }
        }
        
        scanner.close();
    }
    
    private static double evaluateExpression(String expression) throws Exception {
        String[] parts = expression.trim().split("\\s+");
        
        if (parts.length != 3) {
            throw new IllegalArgumentException("Invalid format. Use number operator number");
        }
        
        double num1, num2;
        
        try {
            num1 = Double.parseDouble(parts[0]);
            num2 = Double.parseDouble(parts[2]);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Invalid number format: " + e.getMessage());
        }
        
        String operator = parts[1];
        
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return num1 / num2;
            default:
                throw new UnsupportedOperationException("Unsupported operator: " + operator);
        }
    }
    
    private static void logResult(String expression, double result) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(RESULTS_FILE, true))) {
            writer.printf("%s = %.2f%n", expression, result);
        } catch (IOException e) {
            System.err.println("Failed to log result: " + e.getMessage());
        }
    }
    
    private static void logError(String expression, Exception e) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(ERROR_LOG, true))) {
            writer.printf("Expression: %s - Error: %s%n", expression, e.getMessage());
        } catch (IOException ex) {
            System.err.println("Failed to log error: " + ex.getMessage());
        }
    }
}