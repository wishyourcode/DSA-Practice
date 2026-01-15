package linked_list;

public class LL {
    Node head;
    private int size;

    LL() {
        size = 0;
    }

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addfirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addlast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }

    public void printlist() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public int getSize() {
        return size;
    }

    public void removefirst() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        head = this.head.next;
        size--;
    }

    public void removelast() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node currNode = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            currNode = currNode.next;
            lastNode = lastNode.next;
        }
        currNode.next = null;
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addfirst(0);
        list.addlast(1);
        list.addlast(2);
        list.addfirst(12);
        list.addfirst(20);
        list.printlist();
        System.out.println("Size of the linked list: " + list.getSize());
    }
}
