import java.util.Deque;
import java.util.ArrayDeque;

public class App {

    public static void main(String[] args) {

        String input = "madam";
        Deque<Character> deque = new ArrayDeque<>();

        // Insert characters into deque
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare front and rear elements
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input text: " + input);
        System.out.println("Is it a palindrome? : " + isPalindrome);
    }
}