class Queue {
    int[] q;
    int front = 0, rear = 0, size;

    Queue(int n) {
        q = new int[n];
        size = n;
    }

    void enqueue(int x) {
        if (rear == size) return;
        q[rear++] = x;
    }

    int dequeue() {
        if (front == rear) return -1;
        return q[front++];
    }

    int peek() {
        if (front == rear) return -1;
        return q[front];
    }

    boolean isEmpty() {
        return front == rear;
    }
}


import java.util.*;

class Main {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println(q.remove());
        System.out.println(q.peek());
    }
}


class Solution {
    public ArrayList<int[]> mergeOverlap(int[][] arr) {
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]> res = new ArrayList<>();

        int start = arr[0][0];
        int end = arr[0][1];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i][0] <= end) {
                end = Math.max(end, arr[i][1]);
            } else {
                res.add(new int[]{start, end});
                start = arr[i][0];
                end = arr[i][1];
            }
        }

        res.add(new int[]{start, end});
        return res;
    }
}


class Stack {
    int[] arr;
    int top;

    Stack(int n) {
        arr = new int[n];
        top = -1;
    }

    void push(int x) {
        if (top == arr.length - 1) return;
        arr[++top] = x;
    }

    int pop() {
        if (top == -1) return -1;
        return arr[top--];
    }

    int peek() {
        if (top == -1) return -1;
        return arr[top];
    }

    boolean isEmpty() {
        return top == -1;
    }
}


class Queue {
    int[] arr;
    int front, rear;

    Queue(int n) {
        arr = new int[n];
        front = 0;
        rear = 0;
    }

    void enqueue(int x) {
        if (rear == arr.length) return;
        arr[rear++] = x;
    }

    int dequeue() {
        if (front == rear) return -1;
        return arr[front++];
    }

    boolean isEmpty() {
        return front == rear;
    }
}


class Node {
    int data;
    Node left, right;

    Node(int x) {
        data = x;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    void inorder(Node node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    void preorder(Node node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    void postorder(Node node) {
        if (node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }
}


