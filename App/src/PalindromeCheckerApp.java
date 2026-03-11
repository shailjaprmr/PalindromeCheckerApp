public class PalindromeCheckerApp
{

    public static void main(String args[])
    {
        String input = "deified";

        // 1. Data Structures: Initialize Stack (LIFO) and Queue (FIFO)
        // Note: Queue is an interface in Java, so we use LinkedList as the implementation
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // 2. Enqueue and Push Operations: Insert each character into both structures
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            stack.push(ch);   // Adds to top
            queue.add(ch);    // Adds to end (Enqueue)
        }



        boolean isPalindrome = true;

        // 3. Logical Comparison: Dequeue from Queue and Pop from Stack
        // If the word is a palindrome, the first-in (Queue) will match the last-in (Stack)
        while (!stack.isEmpty()) {
            char fromStack = stack.pop();    // Returns characters in Reverse order
            char fromQueue = queue.remove(); // Returns characters in Original order (Dequeue)

            if (fromStack != fromQueue) {
                isPalindrome = false;
                break;
            }
        }

        // 4. Print Result
        if (isPalindrome) {
            System.out.println("The string \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a Palindrome.");
        }

    }
}