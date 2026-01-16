package linked_list;

/*You are given the head of a linked list containing integers,
 You need to find out whether the given linked list is circular or not.
Note :
1. A linked list is said to be circular if it has no node 
having its next pointer equal to NULL and all the nodes form a 
circle i.e. the next pointer of last node points to the first node.
2. An empty linked will also be considered as circular.
3. All the integers in the linked list are unique.
4. In the input, the next pointer of a node with i’th integer 
is linked to the node with data (i+1)’th integer (If (i+1)’th node 
exists). If there is no such (i+1)’th integer then the next
 pointer of such node is set to NULL. */
public class check_circularlist {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static boolean isCircular(Node<Integer> head) {
        if (head == null) {
            return true;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // 1 step
            fast = fast.next.next; // 2 steps

            if (slow == fast) {
                return true; // Cycle detected
            }
        }

        return false; // No cycle
    }
    public static void main(String[] args) {
        // Example usage:
        check_circularlist list = new check_circularlist();
        Node head = list.new Node(1);
        head.next = list.new Node(2);
        head.next.next = list.new Node(3);
        head.next.next.next = head; // Making the list circular

        System.out.println(isCircular(head)); // Output: true
    }
}
