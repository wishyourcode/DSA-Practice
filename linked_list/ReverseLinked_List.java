package linked_list;

/*
You are given a Singly Linked List of integers.
 You need to reverse the Linked List by changing the links
  between nodes.
Note :
You do not need to print anything, just return the head of 
the reversed linked list. */

public class ReverseLinked_List {
    public static Node reverseLinkedList(Node head) {
        Node prev = null;
        Node curr = head;
        Node next = null;

        while (curr != null) {
            next = curr.next; // store next node
            curr.next = prev; // reverse the link
            prev = curr; // move prev forward
            curr = next; // move curr forward
        }

        return prev; // new head
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node reversedHead = reverseLinkedList(head);

        // Print reversed list
        Node curr = reversedHead;
        while (curr != null) {
            System.out.print(curr.data + " "); // Output: 5 4 3 2 1
            curr = curr.next;
        }
    }
}
