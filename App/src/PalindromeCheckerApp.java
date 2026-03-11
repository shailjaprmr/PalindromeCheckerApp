
public class PalindromeCheckerApp
{

    public static void main(String args[])
    {
        // Test with a phrase containing spaces and mixed casing
        String input = "A man a plan a canal Panama";

        // 1. String Preprocessing: Normalization
        // .toLowerCase() handles case-insensitivity
        // .replaceAll("[^a-zA-Z0-9]", "") removes spaces, commas, and special characters
        String normalized = input.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        // 2. Apply Palindrome Logic (Two-Pointer approach for efficiency)
        boolean isPalindrome = checkPalindrome(normalized);

        // 3. Display Result
        System.out.println("Original: \"" + input + "\"");
        System.out.println("Normalized: \"" + normalized + "\"");

        if (isPalindrome) {
            System.out.println("Result: It is a Palindrome!");
        } else {
            System.out.println("Result: It is NOT a Palindrome.");
        }
    }

    /**
     * Helper method using Two-Pointer technique
     */
    private static boolean checkPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}