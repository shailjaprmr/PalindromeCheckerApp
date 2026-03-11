/**
 * UC11: Object-Oriented Palindrome Service
 * Demonstrates Encapsulation and the Single Responsibility Principle.
 */

// 1. Service Class: Encapsulates the Palindrome Logic
class PalindromeService {

    /**
     * Public method to expose the palindrome checking functionality.
     * This follows the principle of Encapsulation.
     */
    public boolean check(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }

        // Internal Data Structure: Using a simple char array approach
        String cleanInput = input.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        return isPalindromeLogic(cleanInput);
    }

    // Private helper method: Internal implementation hidden from the user
    private boolean isPalindromeLogic(String text) {
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
}
public class PalindromeCheckerApp
{

    public static void main(String args[])
    {
        // Creating an instance of the service class
        PalindromeService service = new PalindromeService();

        String testString = "No 'x' in Nixon";

        // Using the encapsulated method
        boolean result = service.check(testString);

        System.out.println("Testing Phrase: " + testString);
        if (result) {
            System.out.println("Verdict: Valid Palindrome.");
        } else {
            System.out.println("Verdict: Not a Palindrome.");
        }
    }
}