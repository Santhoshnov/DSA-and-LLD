class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MiddleLink{

    // Function to find the middle of the linked list
    // If even number of nodes, returns the second middle node
    public static int findMiddle(Node head) {
        Node slow = head;
        Node fast = head;

        // Move fast by 2 steps and slow by 1 step until fast reaches end
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // slow is now pointing to the middle node
        return slow.data;
    }

    // Utility function to print the linked list
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Example 1: Odd number of nodes
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);

        System.out.println("Linked List 1:");
        printList(head1);
        System.out.println("Middle element: " + findMiddle(head1)); // Output: 3

        // Example 2: Even number of nodes
        Node head2 = new Node(2);
        head2.next = new Node(4);
        head2.next.next = new Node(6);
        head2.next.next.next = new Node(7);
        head2.next.next.next.next = new Node(5);
        head2.next.next.next.next.next = new Node(1);

        System.out.println("\nLinked List 2:");
        printList(head2);
        System.out.println("Middle element: " + findMiddle(head2)); // Output: 7
    }
}

/*
Input:

Linked List 1: 1 -> 2 -> 3 -> 4 -> 5 -> null
Linked List 2: 2 -> 4 -> 6 -> 7 -> 5 -> 1 -> null

Steps (for Linked List 1):

- Initialize slow and fast at head (1)
- Iteration 1: slow = 2, fast = 3
- Iteration 2: slow = 3, fast = 5
- Iteration 3: fast.next is null, stop.
- slow points to 3, which is the middle element.

Steps (for Linked List 2):

- Initialize slow and fast at head (2)
- Iteration 1: slow = 4, fast = 6
- Iteration 2: slow = 6, fast = 5
- Iteration 3: slow = 7, fast = null (end reached)
- slow points to 7, which is the second middle in even-length list.

Output:
Middle element: 3
Middle element: 7
*/
