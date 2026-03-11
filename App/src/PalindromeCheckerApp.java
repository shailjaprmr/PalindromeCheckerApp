public class PalindromeCheckerApp
{

    public static void main(String args[])
    {
        String input = "radar";

        // 1. Data Structure: Initialize a Stack of Characters
        Stack<Character> stack = new Stack<>();

        // 2. Push Operation: Insert each character into the stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        //

        // 3. Reversal Logic: Pop characters to build the reversed string
        String reversed = "";
        while (!stack.isEmpty()) {
            // Pop removes the top element (the last character pushed)
            reversed += stack.pop();
        }

        // 4. Compare and Print Result
        if (input.equalsIgnoreCase(reversed)) {
            System.out.println("The string \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a Palindrome.");
        }
    }
}