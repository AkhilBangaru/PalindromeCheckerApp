public class App {

    public static void main(String[] args) {

        String input = "madam";

        // Reverse string method
        long start1 = System.nanoTime();
        boolean reverseResult = reverseCheck(input);
        long end1 = System.nanoTime();

        // Two pointer method
        long start2 = System.nanoTime();
        boolean pointerResult = pointerCheck(input);
        long end2 = System.nanoTime();

        System.out.println("Input text: " + input);

        System.out.println("\nReverse Method Result: " + reverseResult);
        System.out.println("Execution Time: " + (end1 - start1) + " ns");

        System.out.println("\nTwo Pointer Method Result: " + pointerResult);
        System.out.println("Execution Time: " + (end2 - start2) + " ns");
    }

    // Method 1: Reverse string
    private static boolean reverseCheck(String input) {

        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        return input.equals(reversed);
    }

    // Method 2: Two pointer comparison
    private static boolean pointerCheck(String input) {

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