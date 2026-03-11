public class PalindromeCheckerApp
{

    public static void main(String args[])
    {
        For UC3, the focus shifts to understanding how strings are manipulated at a character level. Instead of using built-in library functions like StringBuilder.reverse(), you will manually construct the reversed string using a for loop and string concatenation.

        Java Implementation: UseCase3PalindromeCheckerApp.java
            Java
/**
 * UC3: Palindrome Check Using String Reverse (Manual Loop)
 * This program demonstrates manual string reversal to check for a palindrome.
 */
        public class UseCase3PalindromeCheckerApp {

            public static void main(String[] args) {
                // 1. Define the input string
                String original = "level";
                String reversed = ""; // Initializing an empty string to hold the result

                // 2. Loop (for loop): Iterating backwards through the original string
                // We start from the last index (length - 1) and move to index 0
                for (int i = original.length() - 1; i >= 0; i--) {
                    // 3. String Concatenation (+): Building the reversed string
                    // Note: Because Strings are Immutable, each '+' creates a new object in memory
                    reversed = reversed + original.charAt(i);
                }

                // 4. equals() Method: Comparing content, not memory references
                if (original.equalsIgnoreCase(reversed)) {
                    System.out.println("Result: \"" + original + "\" is a Palindrome.");
                } else {
                    System.out.println("Result: \"" + original + "\" is NOT a Palindrome.");
                }
    }
}