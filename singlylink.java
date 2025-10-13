public class SinglyLinkedList {
    
    static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; this.next = null; }
    }

    private Node head;
    
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) { head = newNode; return; }
        Node cur = head;
        while (cur.next != null) cur = cur.next;
        cur.next = newNode;
    }
    public void display() {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.data + " -> ");
            cur = cur.next;
        }
        System.out.println("null");
    }
    public void delete(int data) {
        if (head == null) return;
        if (head.data == data) { head = head.next; return; }
        Node cur = head;
        while (cur.next != null && cur.next.data != data) cur = cur.next;
        if (cur.next != null) cur.next = cur.next.next;
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.display();      

        list.delete(20);
        list.display();     
    }
}
output
10 -> 20 -> 30 -> null
10 -> 30 -> null
