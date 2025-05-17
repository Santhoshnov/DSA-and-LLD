class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MergeSortedLink {

    // Function to merge two sorted linked lists
    public static Node mergeTwoLists(Node head1, Node head2) 
    {
        // Create a dummy node to help build the result list
        Node dummy = new Node(0);
        Node tail = dummy;

        // Traverse both lists and compare nodes
        while (head1 != null && head2 != null) 
        {
            if (head1.data <= head2.data) 
            {
                tail.next = head1;
                head1 = head1.next;
            } 
            else 
            {
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;
        }

        // Attach the remaining nodes from either list
        if (head1 != null) 
        {
            tail.next = head1;
        } 
        else 
        {
            tail.next = head2;
        }

        // Return the merged list (excluding the dummy node)
        return dummy.next;
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
        // Create first linked list: 5 -> 10 -> 15 -> 40
        Node head1 = new Node(5);
        head1.next = new Node(10);
        head1.next.next = new Node(15);
        head1.next.next.next = new Node(40);

        // Create second linked list: 2 -> 3 -> 20
        Node head2 = new Node(2);
        head2.next = new Node(3);
        head2.next.next = new Node(20);

        // Merge the lists
        Node mergedHead = mergeTwoLists(head1, head2);

        // Print the merged linked list
        System.out.println("Merged Linked List:");
        printList(mergedHead);
    }
}

/*
Input:

head1 = 5 -> 10 -> 15 -> 40
head2 = 2 -> 3 -> 20

Steps:

Initialization:
A dummy node (dummy) with value 0 is created.
A tail pointer initially points to the dummy node.

dummy -> 0 -> null
tail -> 0 -> null

Iteration 1:
Compare head1.data (5) and head2.data (2).
Since 2 ≤ 5, add head2 node to the merged list.
Move head2 to the next node.
Move tail to the newly added node.
Merged List: 0 -> 2 -> null
tail -> 2 -> null
head2 -> 3 -> 20

Iteration 2:
Compare 5 and 3.
Since 3 ≤ 5, add head2 node to the merged list.
Move head2 to the next node.
Move tail to the newly added node.
Merged List: 0 -> 2 -> 3 -> null
tail -> 3 -> null
head2 -> 20

Iteration 3:
Compare 5 and 20.
Since 5 < 20, add head1 node to the merged list.
Move head1 to the next node.
Move tail to the newly added node.
Merged List: 0 -> 2 -> 3 -> 5 -> null
tail -> 5 -> null
head1 -> 10 -> 15 -> 40

Iteration 4:
Compare 10 and 20.
Since 10 < 20, add head1 node to the merged list.
Move head1 to the next node.
Move tail to the newly added node.
Merged List: 0 -> 2 -> 3 -> 5 -> 10 -> null
tail -> 10 -> null
head1 -> 15 -> 40

Iteration 5:
Compare 15 and 20.
Since 15 < 20, add head1 node to the merged list.
Move head1 to the next node.
Move tail to the newly added node.
Merged List: 0 -> 2 -> 3 -> 5 -> 10 -> 15 -> null
tail -> 15 -> null
head1 -> 40

Iteration 6:
Compare 40 and 20.
Since 20 < 40, add head2 node to the merged list.
Move head2 to the next node.
Move tail to the newly added node.
Merged List: 0 -> 2 -> 3 -> 5 -> 10 -> 15 -> 20 -> null
tail -> 20 -> null
head2 -> null
Attach Remaining Nodes:
Since head2 is null, append the remaining nodes from head1 (40).

Merged List: 0 -> 2 -> 3 -> 5 -> 10 -> 15 -> 20 -> 40 -> null
tail -> 40 -> null
head1 -> null