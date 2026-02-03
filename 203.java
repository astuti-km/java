class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}


class Solution {
    Node reverseList(Node head) {
       Node curr=head,prev=null,next;
       while(curr!=null){
           next=curr.next;
           curr.next=prev;
           prev=curr;
           curr=next;
       }
       return prev;
    }
       static void printList(Node node){
           while(node!=null){
               System.out.print(node.data);
               if(node.next!=null)
               System.out.print(" -> ");
               node=node.next;
           }
       }
        
    }

import java.util.*;

class srt {
    static void sort(int[] arr) {
        Arrays.sort(arr);
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int[] arr = new int[num];  

        for (int i = 0; i < num; i++) {
            arr[i] = in.nextInt();
        }

        sort(arr);

        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


import java.util.*;
class search{
    static int findNum(int[] arr,int num){
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int num=in.nextInt();
        System.out.print(findNum(arr,num));
    }
}


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
