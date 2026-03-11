public class PalindromeCheckerApp
{

    public static void main(String args[])
    {
        // 1. String Literal: Defining the hardcoded string
        String original = "madam";

        // 2. Data Structure (String): Reversing the string using StringBuilder
        // We create a new StringBuilder, reverse the content, and convert back to String
        String reversed = new StringBuilder(original).reverse().toString();

        // 3. Conditional Statement (if-else): Checking the palindrome condition
        // .equalsIgnoreCase() is used to ensure "Madam" would still match "madam"
        if (original.equalsIgnoreCase(reversed)) {
            // 4. Console Output: Displaying the success result
            System.out.println("The string \"" + original + "\" is a Palindrome.");
        } else {
            // 4. Console Output: Displaying the failure result
            System.out.println("The string \"" + original + "\" is NOT a Palindrome.");
        }

        // Program exits automatically after the main method ends
    }
}