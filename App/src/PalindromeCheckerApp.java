/**
 * =====================================================
 * MAIN CLASS - PalindromeCheckerApp
 * =====================================================
 *
 * Use Case 2 : Hardcoded Palindrome Validation
 * Use Case 3 : Reverse String Palindrome Check
 *
 * Description:
 * This program checks whether a hardcoded string
 * is a palindrome using basic comparison logic, and
 * also checks using string reversal.
 *
 * Author: akhil
 * Version: 3.0
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("=====================================================");
        System.out.println(" Welcome to Palindrome Checker Application");
        System.out.println("=====================================================\n");

        // -----------------------------
        // USE CASE 2 : Hardcoded Palindrome Validation
        // -----------------------------
        System.out.println("--- USE CASE 2 : Hardcoded Validation ---");
        String input2 = "madam";
        boolean isPalindrome2 = true;

        for (int i = 0; i < input2.length() / 2; i++) {
            if (input2.charAt(i) != input2.charAt(input2.length() - 1 - i)) {
                isPalindrome2 = false;
                break;
            }
        }

        if (isPalindrome2) {
            System.out.println(input2 + " is a Palindrome.");
        } else {
            System.out.println(input2 + " is NOT a Palindrome.");
        }
        System.out.println();

        // -----------------------------
        // USE CASE 3 : Reverse Palindrome
        // -----------------------------
        System.out.println("--- USE CASE 3 : Reverse Palindrome ---");
        String input3 = "racecar";
        String reversed = "";

        for (int i = input3.length() - 1; i >= 0; i--) {
            reversed += input3.charAt(i);
        }

        if (input3.equals(reversed)) {
            System.out.println(input3 + " is a Palindrome (Reversed: " + reversed + ").");
        } else {
            System.out.println(input3 + " is NOT a Palindrome (Reversed: " + reversed + ").");
        }
    }
}