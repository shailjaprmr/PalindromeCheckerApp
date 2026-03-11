class Node {
    char data;
    Node next;
    Node(char data) { this.data = data; }
}
public class PalindromeCheckerApp
{

    public static void main(String args[])
    {
        String input = "rotator";
        Node head = createLinkedList(input);

        if (isPalindrome(head)) {
            System.out.println("The string \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a Palindrome.");
        }
    }

    // Function to check if Linked List is palindrome
    public static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) return true;

        // 1. Find the middle using Fast and Slow pointers
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 2. Reverse the second half of the list in-place
        Node secondHalf = reverseList(slow);
        Node firstHalf = head;

        // 3. Compare the two halves
        Node temp = secondHalf; // To restore later if needed
        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) return false;
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }

    // Helper to reverse a linked list
    private static Node reverseList(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }

    // Helper to convert String to Linked List
    private static Node createLinkedList(String s) {
        if (s.isEmpty()) return null;
        Node head = new Node(s.charAt(0));
        Node current = head;
        for (int i = 1; i < s.length(); i++) {
            current.next = new Node(s.charAt(i));
            current = current.next;
        }
        return head;
    }
}