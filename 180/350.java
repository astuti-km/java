class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList {
    Node head;

    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        System.out.print("Singly Linked List: ");
        list.display();
    }
}


class Node {
    int data;
    DNode prev, next;

    DNode(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DoublyLinkedList {
    DNode head;
    void insert(int data) {
        DNode newNode = new DNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        DNode temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
    }
    void displayForward() {
        DNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    void displayBackward() {
        DNode temp = head;
        while (temp.next != null)
            temp = temp.next;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        System.out.print("Forward: ");
        list.displayForward();
        System.out.print("\nBackward: ");
        list.displayBackward();
    }
}



class LinkedList {
    Node head;

    
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

   
    void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
        System.out.println(new_data + " pushed to the list");
    }

   
    void pop() {
        if (head == null) {
            System.out.println("List is empty! Nothing to pop.");
            return;
        }
        System.out.println(head.data + " popped from the list");
        head = head.next;
    }

  
    void insert(int new_data) {
        Node new_node = new Node(new_data);

        if (head == null) {
            head = new_node;
            System.out.println(new_data + " inserted as the first element");
            return;
        }

        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = new_node;
        System.out.println(new_data + " inserted at the end");
    }

    
    void delete(int key) {
        Node temp = head, prev = null;

        
        if (temp != null && temp.data == key) {
            head = temp.next;
            System.out.println(key + " deleted from the list");
            return;
        }

      
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        
        if (temp == null) {
            System.out.println(key + " not found in the list");
            return;
        }

        prev.next = temp.next;
        System.out.println(key + " deleted from the list");
    }

    
    void search(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                System.out.println(key + " found in the list!");
                return;
            }
            temp = temp.next;
        }
        System.out.println(key + " not found in the list.");
    }

    
    void display() {
        Node temp = head;
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.push(10);
        list.push(20);
        list.insert(30);
        list.insert(40);
        list.display();

        list.search(30);
        list.delete(20);
        list.display();

        list.pop();
        list.display();
    }
}



public class BubbleSort {
    static void bubbleSort(int[] arr, int n) {
        if(n==1){
            return;
        }
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        bubbleSort(arr, n - 1);
    }
    static void printedArray(int[] arr,int n){
       // System.out.println("Printed array: ");
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void main(String[] args) {
     int arr[] = {64, 34, 25, 12, 22, 11, 90};
     int n=arr.length;
        System.out.print("Printed array: ");
        printedArray(arr,n);
        bubbleSort(arr,n);
        System.out.println("Sorted array: ");
        printedArray(arr,n);
    }
}
output
  Printed array: 64 34 25 12 22 11 90 
Sorted array: 
11 12 22 25 34 64 90 

  public class InsertionSort {
    static void insertionSort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }}
    static void printedArray(int[] arr,int n){
       // System.out.println("Printed array: ");
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void main(String[] args) {
     int arr[] = {64, 34, 25, 12, 22, 11, 90};
     int n=arr.length;
        System.out.println("Printed array: ");
        printedArray(arr,n);
        insertionSort(arr,n);
        System.out.println("Sorted array: ");
        printedArray(arr,n);
    }
}

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        // Selection Sort
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // Update minIndex if smaller element found
                }
            }
            // Swap the found minimum with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        // Print sorted array
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

public class Main{
    public static void main(String args[]){
        String name="Astuti kumari";
        String course ="BTECH";
        String stream="CST";
        String college= "UEM";
        long enroll = 12024002022061L;
        long regis = 304202400900621L;
        int year = 2;
        String sec="2A";
        int roll = 15;
        
        System.out.println("Name: "+name +"\nCourse: "+course+"\nStream: "+stream+"\nCollege: "+college+"\nEnrollment number: "+enroll+"\n Registrattion numer: "+regis+"\nYear:"+year+"\nSection: "+sec+"\nClass Roll no.: "+roll);
    }
}

import java.util.*;
 public class TwoDArray{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int m=in.nextInt();
        int n=in.nextInt();
        int[][] matrix=new int[m][n];
       System.out.println("Enter row: "+m+" columns: "+n+":");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    System.out.println("Enter the elements to be found: ");
     int num=in.nextInt();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               if (matrix[i][j]==num){
                   System.out.print("Elements "+num+ " found at position ("+i+","+j+")");}}}
               }
    }
