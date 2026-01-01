class StackLL {
    private static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }
    private Node top;

    void push(int x) {
        Node n = new Node(x);
        n.next = top;
        top = n;
    }

    int pop() {
        if (top == null) return -1;
        int v = top.data;
        top = top.next;
        return v;
    }

    int peek() {
        if (top == null) return -1;
        return top.data;
    }

    boolean isEmpty() {
        return top == null;
    }
}




class QueueLL {
    private static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }
    private Node front, rear;

    void enqueue(int x) {
        Node n = new Node(x);
        if (rear == null) {
            front = rear = n;
            return;
        }
        rear.next = n;
        rear = n;
    }

    int dequeue() {
        if (front == null) return -1;
        int v = front.data;
        front = front.next;
        if (front == null) rear = null;
        return v;
    }

    int peek() {
        if (front == null) return -1;
        return front.data;
    }

    boolean isEmpty() {
        return front == null;
    }
}




class DequeLL {
    private static class Node {
        int data;
        Node prev, next;
        Node(int d) { data = d; }
    }
    private Node front, rear;

    void addFirst(int x) {
        Node n = new Node(x);
        if (front == null) {
            front = rear = n;
            return;
        }
        n.next = front;
        front.prev = n;
        front = n;
    }

    void addLast(int x) {
        Node n = new Node(x);
        if (rear == null) {
            front = rear = n;
            return;
        }
        rear.next = n;
        n.prev = rear;
        rear = n;
    }

    int removeFirst() {
        if (front == null) return -1;
        int v = front.data;
        front = front.next;
        if (front != null) front.prev = null;
        else rear = null;
        return v;
    }

    int removeLast() {
        if (rear == null) return -1;
        int v = rear.data;
        rear = rear.prev;
        if (rear != null) rear.next = null;
        else front = null;
        return v;
    }

    boolean isEmpty() {
        return front == null;
    }
}
