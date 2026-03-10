public class App {

    public static void main(String[] args) {

        String input = "level";
        String reversed = "";

        // Reverse string using loop
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Compare original and reversed string
        if (input.equals(reversed)) {
            System.out.println("Input text: " + input);
            System.out.println("Reversed text: " + reversed);
            System.out.println("Result: It is a Palindrome");
        } else {
            System.out.println("Input text: " + input);
            System.out.println("Reversed text: " + reversed);
            System.out.println("Result: Not a Palindrome");
        }
    }
}