import java.util.*;

public class App {

    public static void main(String[] args) {

        String input = "madam";

        // Choose strategy (StackStrategy or DequeStrategy)
        PalindromeStrategy strategy = new StackStrategy();

        PalindromeService service = new PalindromeService(strategy);

        boolean result = service.checkPalindrome(input);

        System.out.println("Input text: " + input);
        System.out.println("Is it a palindrome? : " + result);
    }
}

// Strategy Interface
interface PalindromeStrategy {
    boolean check(String input);
}

// Stack based strategy
class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

// Deque based strategy
class DequeStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }

        return true;
    }
}

// Service class using strategy
class PalindromeService {

    private PalindromeStrategy strategy;

    public PalindromeService(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean checkPalindrome(String input) {
        return strategy.check(input);
    }
}