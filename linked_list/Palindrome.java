package linked_list;

/*
You are given a singly Linked List of integers. Your task is to return true if the given singly linked list is a palindrome otherwise returns false.
For example:
The given linked list is 1 -> 2 -> 3 -> 2-> 1-> NULL.
It is a palindrome linked list because the given linked list has the same order of elements when traversed forwards and backward​.
Follow Up:
Can you solve the problem in O(N) time complexity and O(1) space complexity iteratively? */
class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}

public class Palindrome {
    public static boolean isPalindrome(LinkedListNode<Integer> head) {
        if (head == null || head.next == null) {
            return true;
        }

        // Step 1: Find middle
        LinkedListNode<Integer> slow = head;
        LinkedListNode<Integer> fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse second half
        LinkedListNode<Integer> secondHalf = reverse(slow);
        LinkedListNode<Integer> firstHalf = head;

        // Step 3: Compare
        while (secondHalf != null) {
            if (!firstHalf.data.equals(secondHalf.data)) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    private static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> prev = null;
        LinkedListNode<Integer> curr = head;

        while (curr != null) {
            LinkedListNode<Integer> nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        return prev;
    }

    public static void main(String[] args) {
        LinkedListNode<Integer> head = new LinkedListNode<>(1);
        head.next = new LinkedListNode<>(2);
        head.next.next = new LinkedListNode<>(3);
        head.next.next.next = new LinkedListNode<>(2);
        head.next.next.next.next = new LinkedListNode<>(1);

        boolean result = isPalindrome(head);
        System.out.println("Is Palindrome: " + result); // Output: true
    }
}
