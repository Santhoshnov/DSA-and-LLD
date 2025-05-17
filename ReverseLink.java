class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseLink {

    // Function to reverse the linked list and return new head
    public static Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;

        // Traverse through the list and reverse the links
        while (current != null) {
            next = current.next;  // store next node
            current.next = prev;  // reverse current node's pointer
            prev = current;       // move prev to current
            current = next;       // move to next node
        }

        // prev will be the new head after reversal
        return prev;
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
        // Example 1
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);

        System.out.println("Original Linked List 1:");
        printList(head1);

        Node reversed1 = reverseList(head1);
        System.out.println("Reversed Linked List 1:");
        printList(reversed1);

        // Example 2
        Node head2 = new Node(2);
        head2.next = new Node(7);
        head2.next.next = new Node(10);
        head2.next.next.next = new Node(9);
        head2.next.next.next.next = new Node(8);

        System.out.println("\nOriginal Linked List 2:");
        printList(head2);

        Node reversed2 = reverseList(head2);
        System.out.println("Reversed Linked List 2:");
        printList(reversed2);

        // Example 3: Single node list
        Node head3 = new Node(2);

        System.out.println("\nOriginal Linked List 3:");
        printList(head3);

        Node reversed3 = reverseList(head3);
        System.out.println("Reversed Linked List 3:");
        printList(reversed3);
    }
}

/*
Input:

Linked List 1: 1 -> 2 -> 3 -> 4 -> null
Linked List 2: 2 -> 7 -> 10 -> 9 -> 8 -> null
Linked List 3: 2 -> null

Steps (for Linked List 1):

- Initialize prev = null, current = head (1)
- Iteration 1:
  next = 2
  current.next = prev (null)
  prev = 1
  current = 2

- Iteration 2:
  next = 3
  current.next = prev (1)
  prev = 2
  current = 3

- Iteration 3:
  next = 4
  current.next = prev (2)
  prev = 3
  current = 4

- Iteration 4:
  next = null
  current.next = prev (3)
  prev = 4
  current = null (end)

- Return prev (4), which is new head

Output:

Reversed Linked List 1: 4 -> 3 -> 2 -> 1 -> null
Reversed Linked List 2: 8 -> 9 -> 10 -> 7 -> 2 -> null
Reversed Linked List 3: 2 -> null
*/
