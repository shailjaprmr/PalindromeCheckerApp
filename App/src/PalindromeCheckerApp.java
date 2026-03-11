import java.util.*;

/**
 * UC12: Strategy Pattern for Palindrome Algorithms
 * Demonstrates Polymorphism and Dynamic Strategy Injection.
 */

// 1. The Strategy Interface
interface PalindromeStrategy {
    boolean isValid(String input);
}

// 2. Concrete Strategy A: Stack-based (LIFO)
class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean isValid(String input) {
        String clean = input.toLowerCase().replaceAll("[^a-z0-9]", "");
        Stack<Character> stack = new Stack<>();
        for (char c : clean.toCharArray()) stack.push(c);

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) reversed.append(stack.pop());

        return clean.equals(reversed.toString());
    }
}

// 3. Concrete Strategy B: Deque-based (Front/Rear)
class DequeStrategy implements PalindromeStrategy {
    @Override
    public boolean isValid(String input) {
        String clean = input.toLowerCase().replaceAll("[^a-z0-9]", "");
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : clean.toCharArray()) deque.addLast(c);

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) return false;
        }
        return true;
    }
}

// 4. Context Class: The "Manager" that uses the strategy
class PalindromeContext {
    private PalindromeStrategy strategy;

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean executeStrategy(String input) {
        return strategy.isValid(input);
    }
}
public class PalindromeCheckerApp
{

    public static void main(String args[])
    {
        PalindromeContext context = new PalindromeContext();
        String testWord = "Racecar";

        // Injecting Stack Strategy at runtime
        context.setStrategy(new StackStrategy());
        System.out.println("Using Stack Strategy: " + context.executeStrategy(testWord));

        // Dynamically switching to Deque Strategy
        context.setStrategy(new DequeStrategy());
        System.out.println("Using Deque Strategy: " + context.executeStrategy(testWord));
    }
}