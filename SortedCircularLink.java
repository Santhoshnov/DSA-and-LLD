class Node
{
    int data;
    Node next;

    public Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}

class SortedCircularLink
{
    public static Node sortedInsert(Node head, int data)
    {
        Node newNode = new Node(data);  

        // Case 1: The list is empty, so create a circular list with a single node
        if (head == null)
        {
            newNode.next = newNode;  // Point the new node to itself to form a circle
            return newNode;  // Return the new node as the head
        }

        Node current = head;

        // Case 2: Insert before the head (new node becomes the smallest)
        if (data <= head.data)
        {
            // Traverse to the last node to maintain the circular nature
            while (current.next != head)
            {
                current = current.next;
            }
            // Insert the new node before the current head
            newNode.next = head;
            current.next = newNode;
            return newNode;  // New node becomes the new head
        }

        // Case 3: General case - find the correct position to insert
        Node prev = null;
        current = head;

        do
        {
            prev = current;  // Move previous pointer to current
            current = current.next;  // Move current pointer to next node

            // Check if the new node should be inserted between prev and current
            if (data >= prev.data && data <= current.data)
            {
                break;  // Position found
            }

            // Case 4: Insert at the end when the list wraps around
            if (prev.data > current.data)  // Indicates the end of sorted list
            {
                // Insert either before the smallest or after the largest
                if (data > prev.data || data < current.data)
                {
                    break;
                }
            }
        } while (current != head);  // Loop until the entire list is traversed

        // Insert the new node between prev and current
        prev.next = newNode;
        newNode.next = current;

        return head;
    }

    // Utility function to print the circular linked list
    public static void printList(Node head)
    {
        if (head == null)
        {
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        do
        {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }

    public static void main(String args[])
    {
        // Creating a sorted circular linked list: 1 -> 2 -> 4 -> 1
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(4);
        head.next.next.next = head;  // Circular link

        System.out.println("Original list:");
        printList(head);

        // Example 1: Inserting a duplicate element (2)
        head = sortedInsert(head, 2);
        System.out.println("After inserting 2:");
        printList(head);

        // Example 2: Inserting a new smallest element (0)
        head = sortedInsert(head, 0);
        System.out.println("After inserting 0:");
        printList(head);

        // Example 3: Inserting a new largest element (5)
        head = sortedInsert(head, 5);
        System.out.println("After inserting 5:");
        printList(head);

        // Example 4: Inserting a new intermediate element (3)
        head = sortedInsert(head, 3);
        System.out.println("After inserting 3:");
        printList(head);
    }
}
