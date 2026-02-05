package practise1;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your data:");
        String s = sc.nextLine();
        s = s.toLowerCase();
        
        boolean isPalindrome = true;
        
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
