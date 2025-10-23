import java.util.*;

class QueueExample {
    int front, rear, size;
    int capacity;
    int[] queue;

    QueueExample(int c) {
        capacity = c;
        front = size = 0;
        rear = capacity - 1;
        queue = new int[capacity];
    }
    void enqueue(int item) {
        if (size == capacity) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = item;
        size++;
        System.out.println(item + " enqueued to queue");
    }
    void display() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        QueueExample q = new QueueExample(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
    }
}
