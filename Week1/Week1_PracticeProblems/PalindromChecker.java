public class PalindromeChecker {

    // 1. Iterative approach
    static boolean isPalindromeIterative(String text) {

        int left = 0;
        int right = text.length() - 1;

        while (left < right) {

            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    // 2. Recursive approach
    static boolean isPalindromeRecursive(String text) {

        if (text.length() <= 1) {
            return true;
        }

        if (text.charAt(0) != text.charAt(text.length() - 1)) {
            return false;
        }

        return isPalindromeRecursive(text.substring(1, text.length() - 1));
    }

    // 3. Array reversal approach
    static boolean isPalindromeArrayReversal(String text) {

        char[] original = text.toCharArray();
        char[] reversed = new char[original.length];

        for (int i = 0; i < original.length; i++) {
            reversed[i] = original[original.length - 1 - i];
        }

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String text = "madam";

        boolean iterative = isPalindromeIterative(text);
        boolean recursive = isPalindromeRecursive(text);
        boolean arrayReversal = isPalindromeArrayReversal(text);

        System.out.println(
            "Iterative: " + (iterative ? "Palindrome" : "Not Palindrome") +
            " | Recursive: " + (recursive ? "Palindrome" : "Not Palindrome") +
            " | Array Reversal: " +
            (arrayReversal ? "Palindrome" : "Not Palindrome")
        );
    }
}