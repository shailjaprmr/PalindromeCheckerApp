public class PalindromeCheckerApp
{

    public static void main(String args[])
    {
        // 1. Define the input string
        String input = "radar";

        // 2. Data Structure: Convert string to a primitive Character Array (char[])
        char[] charArray = input.toCharArray();

        // 3. Two-Pointer Technique: Initialize pointers at start and end
        int left = 0;
        int right = charArray.length - 1;
        boolean isPalindrome = true;

        // 4. Compare start & end characters using a while loop
        while (left < right) {
            // Check if characters at the current pointers match
            if (charArray[left] != charArray[right]) {
                isPalindrome = false;
                break; // Stop immediately if a mismatch is found
            }
            // Move pointers toward the middle
            left++;
            right--;
        }

        // 5. Display the result
        if (isPalindrome) {
            System.out.println("The word \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + input + "\" is NOT a Palindrome.");
        }
    }
}