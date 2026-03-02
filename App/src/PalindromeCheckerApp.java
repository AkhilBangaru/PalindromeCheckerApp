/**
 * =====================================================
 * MAIN CLASS - UseCase2PalindromeCheckerApp
 * =====================================================
 *
 * Use Case 2 : Hardcoded Palindrome Validation
 *
 * Description:
 * This program checks whether a hardcoded string
 * is a palindrome using basic comparison logic.
 *
 * At this stage, the application:
 * - Stores a predefined string
 * - Compares characters from both ends
 * - Determines whether the string is a palindrome
 * - Displays the result on the console
 *
 * Author: akhil
 * Version: 2.0
 */

public class UseCase2PalindromeCheckerApp {

    /**
     * Application entry point for UC2
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Hardcoded string
        String input = "madam";

        boolean isPalindrome = true;

        // Loop only till half of string length
        for (int i = 0; i < input.length() / 2; i++) {

            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }
    }
}