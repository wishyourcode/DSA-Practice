package queue;

/*
Design a data structure to implement deque of size ‘N’. It should support the following operations:

pushFront(X): Inserts an element X in the front of the deque. Returns true if the element is inserted, otherwise false.

pushRear(X): Inserts an element X in the back of the deque. Returns true if the element is inserted, otherwise false.

popFront(): Pops an element from the front of the deque. Returns -1 if the deque is empty, otherwise returns the popped element.

popRear(): Pops an element from the back of the deque. Returns -1 if the deque is empty, otherwise returns the popped element.

getFront(): Returns the first element of the deque. If the deque is empty, it returns -1.

getRear(): Returns the last element of the deque. If the deque is empty, it returns -1.

isEmpty(): Returns true if the deque is empty, otherwise false.

isFull(): Returns true if the deque is full, otherwise false.
Following types of queries denote these operations:

Type 1: for pushFront(X) operation.
Type 2: for pushRear(X) operation.
Type 3: for popFront() operation.
Type 4: for popRear() operation.
Type 5: for getFront() operation.
Type 6: for getRear() operation.
Type 7: for isEmpty() operation.
Type 8: for isFull() operation. */
public class All_Operation {
    private int[] arr;
    private int front, rear, size, capacity;

    // Initialize your data structure.
    public All_Operation(int n) {
        capacity = n;
        arr = new int[n];
        front = -1;
        rear = -1;
        size = 0;
    }

    // Pushes 'X' in the front of the deque.
    public boolean pushFront(int x) {
        if (isFull())
            return false;

        if (isEmpty()) {
            front = 0;
            rear = 0;
        } else {
            front = (front - 1 + capacity) % capacity;
        }

        arr[front] = x;
        size++;
        return true;
    }

    // Pushes 'X' in the back of the deque.
    public boolean pushRear(int x) {
        if (isFull())
            return false;

        if (isEmpty()) {
            front = 0;
            rear = 0;
        } else {
            rear = (rear + 1) % capacity;
        }

        arr[rear] = x;
        size++;
        return true;
    }

    // Pops an element from the front of the deque.
    public int popFront() {
        if (isEmpty())
            return -1;

        int val = arr[front];

        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % capacity;
        }

        size--;
        return val;
    }

    // Pops an element from the back of the deque.
    public int popRear() {
        if (isEmpty())
            return -1;

        int val = arr[rear];

        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            rear = (rear - 1 + capacity) % capacity;
        }

        size--;
        return val;
    }

    // Returns the first element of the deque.
    public int getFront() {
        if (isEmpty())
            return -1;
        return arr[front];
    }

    // Returns the last element of the deque.
    public int getRear() {
        if (isEmpty())
            return -1;
        return arr[rear];
    }

    // Returns true if the deque is empty.
    public boolean isEmpty() {
        return size == 0;
    }

    // Returns true if the deque is full.
    public boolean isFull() {
        return size == capacity;
    }

    public static void main(String[] args) {
        All_Operation deque = new All_Operation(5);
        System.out.println(deque.pushRear(10)); // true
        System.out.println(deque.pushFront(20)); // true
        System.out.println(deque.getFront()); // 20
        System.out.println(deque.getRear()); // 10
        System.out.println(deque.popFront()); // 20
        System.out.println(deque.popRear()); // 10
        System.out.println(deque.isEmpty()); // true
        System.out.println(deque.isFull()); // false

    }
}
