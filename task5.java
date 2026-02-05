package practise1;

import java.util.Scanner;

public class task5 {
	public static void main(String[] args){
	 Scanner scan = new Scanner(System.in);
		 System.out.println("Your current balance:");
		 double n = scan.nextDouble();
		 System.out.println("Interest in %:");
		 double m = scan.nextDouble();
		 
		 double d= n+((n*m)/100);
		 System.out.println("You will have: " + Math.round(d));
		 
	 }
	}

