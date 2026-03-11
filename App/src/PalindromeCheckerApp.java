
public class PalindromeCheckerApp
{

    public static void main(String args[])
    {
        String input = "malayalam";

        // Initial call to the recursive function
        // We pass the string, the start index (0), and the end index (length - 1)
        boolean result = isPalindrome(input, 0, input.length() - 1);

        if (result) {
            System.out.println("The string \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a Palindrome.");
        }
    }

    /**
     * Recursive method to check palindrome
     */
    public static boolean isPalindrome(String str, int start, int end) {
        // 1. Base Condition: If pointers cross or meet, all checks passed
        if (start >= end) {
            return true;
        }

        // 2. Comparison: Check if characters at current boundaries match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // 3. Recursive Call: Move inward and solve the smaller sub-problem
        // This pushes a new frame onto the Call Stack
        return isPalindrome(str, start + 1, end - 1);
    }
}