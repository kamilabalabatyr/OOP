package practise1;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = scan.nextDouble();

        System.out.print("Enter b: ");
        double b = scan.nextDouble();

        System.out.print("Enter c: ");
        double c = scan.nextDouble();

        if (a == 0) {
            System.out.println("a cannot be 0");
            return;
        }

        double D = (b * b) - (4 * a * c);

        if (D < 0) {
            System.out.println("Error Discriminant is negative. No roots.");
            return;
        }

        double sqrtD = Math.sqrt(D);      

        double x1 = (-b + sqrtD) / 2*a;
        double x2 = (-b - sqrtD) / 2*a;

        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }
}
