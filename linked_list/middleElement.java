package linked_list;

/*
Given a singly linked list of 'N' nodes. The objective is to determine 
the middle node of a singly linked list. However,
if the list has an even number of nodes, we return the second middle node.
Note:
1. If the list is empty, the function immediately returns
 None because there is no middle node to find.
2. If the list has only one node, then the only node 
in the list is trivially the middle node, and 
the function returns that node. */
class Node {
    public int data;
    public Node next;

    Node() {
        this.data = 0;
        this.next = null;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

public class middleElement {
    public static Node findMiddle(Node head) {
        if (head == null)
            return null;

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow; // middle node
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(5);

        Node middleNode = findMiddle(head);
        if (middleNode != null) {
            System.out.println("Middle node data: " + middleNode.data); // Output: 3
        } else {
            System.out.println("The list is empty.");
        }
    }
}
