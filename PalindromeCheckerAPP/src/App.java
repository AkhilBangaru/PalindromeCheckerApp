public class App {

    // Application constants
    private static final String APP_NAME = "Palindrome Checker Management System";
    private static final String APP_VERSION = "1.0";

    public static void main(String[] args) {
        // UC1: Application Entry & Welcome Message
        displayWelcomeMessage();

        // UC2: Print a Hardcoded Palindrome Result
        checkHardcodedPalindrome();

        // Program continues to next use case or exits
        System.out.println("System initialized successfully.");
    }

    // Displays the welcome message with application name and version
    private static void displayWelcomeMessage() {
        System.out.println("Welcome to the " + APP_NAME);
        System.out.println("Version : " + APP_VERSION);
    }

    // UC2: Check and display result for a hardcoded palindrome string
    private static void checkHardcodedPalindrome() {
        String input = "madam";
        boolean result = isPalindrome(input);
        System.out.println("Input text: " + input);
        System.out.println("Is it a palindrome? : " + result);
    }

    // Checks if a given string is a palindrome
    private static boolean isPalindrome(String input) {
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}