import java.util.ArrayDeque;
import java.util.Deque;
public class PalindromeCheckerApp
{

    public static void main(String args[])
    {
        String input = "racecar";

        // 1. Data Structure: Initialize a Deque
        // ArrayDeque is usually faster than LinkedList for Stack/Queue operations
        Deque<Character> deque = new ArrayDeque<>();

        // 2. Insert characters into the deque
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }



        boolean isPalindrome = true;

        // 3. Remove first & last characters and compare until empty or 1 remains
        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // 4. Print result
        if (isPalindrome) {
            System.out.println("The word \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + input + "\" is NOT a Palindrome.");
        }
    }
}