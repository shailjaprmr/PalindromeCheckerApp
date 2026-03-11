
public class PalindromeCheckerApp
{

    public static void main(String args[])
    {
        // Using a long string to make the performance difference noticeable
        String testInput = "A man a plan a canal Panama".repeat(100).toLowerCase().replaceAll("[^a-z0-9]", "");

        System.out.println("Benchmarking Palindrome Algorithms (Length: " + testInput.length() + " chars)\n");

        // 1. Measure String Reversal Approach (UC3 style)
        long start1 = System.nanoTime();
        boolean res1 = checkByReversal(testInput);
        long end1 = System.nanoTime();
        System.out.println("Approach: String Reversal | Time: " + (end1 - start1) + " ns | Result: " + res1);

        // 2. Measure Two-Pointer Approach (UC4 style)
        long start2 = System.nanoTime();
        boolean res2 = checkByTwoPointers(testInput);
        long end2 = System.nanoTime();
        System.out.println("Approach: Two-Pointer     | Time: " + (end2 - start2) + " ns | Result: " + res2);

        System.out.println("\nNote: Two-Pointer is usually faster because it stops at the first mismatch.");
    }

    // UC3 Logic: Full Reversal (Slower due to String immutability/memory)
    private static boolean checkByReversal(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return str.equals(reversed);
    }

    // UC4 Logic: Two-Pointer (Faster due to early exit and no extra memory)
    private static boolean checkByTwoPointers(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}