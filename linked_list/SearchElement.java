package linked_list;

public class SearchElement {
    public static int searchInLinkedList(Node head, int k) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == k) {
                return 1; // Found
            }
            temp = temp.next;
        }

        return 0; // Not found
    }

    public static void main(String[] args) {
        Node head = new Node(3);
        head.next = new Node(5);
        head.next.next = new Node(7);
        head.next.next.next = new Node(9);

        int k = 17;
        int result = searchInLinkedList(head, k);
        System.out.println("Element " + k + (result == 1 ? " found." : " not found."));
    }
}
