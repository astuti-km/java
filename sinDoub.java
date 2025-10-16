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
