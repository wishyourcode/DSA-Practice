package linked_list;

public class deletemid {
    /*
     * Given a singly linked list of 'N' nodes.
     * Your task is to delete the middle node of this list
     * and return the head of the modified list.
     * However, if the list has an even number of nodes,
     * we delete the second middle node
     * Example:
     * If given linked list is 1->2->3->4 then
     * it should be modified to 1->2->4.
     */
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node deleteMiddle(Node head) {
        if (head == null || head.next == null) {
            return null; // If 0 or 1 node, return null
        }

        Node slow = head;
        Node fast = head;
        Node prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // slow is at middle (or second middle in even case)
        prev.next = slow.next;

        return head;
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original List:");
        printList(head);
        head = deleteMiddle(head);
        System.out.println("List after deleting middle node:");
        printList(head);
    }
}
