public class App {

    public static void main(String[] args) {

        String input = "madam";

        PalindromeChecker checker = new PalindromeChecker();
        boolean result = checker.checkPalindrome(input);

        System.out.println("Input text: " + input);
        System.out.println("Is it a palindrome? : " + result);
    }
}

// Service class that contains palindrome logic
class PalindromeChecker {

    public boolean checkPalindrome(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}