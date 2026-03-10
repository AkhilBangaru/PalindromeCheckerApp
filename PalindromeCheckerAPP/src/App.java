public class App {

    public static void main(String[] args) {

        String input = "Madam In Eden Im Adam";

        // Normalize string: remove spaces and convert to lowercase
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        boolean result = isPalindrome(normalized);

        System.out.println("Original text: " + input);
        System.out.println("Normalized text: " + normalized);
        System.out.println("Is it a palindrome? : " + result);
    }

    // Palindrome check
    private static boolean isPalindrome(String str) {

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}