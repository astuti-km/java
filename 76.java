class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class LinkedList {
    Node head;

    Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        Node next;

        while (curr != null) {
            next = curr.next;   
            curr.next = prev;   
            prev = curr;        
            curr = next;       
        }
        return prev; 
    }
}



Node findFromLast(Node head, int n) {
    Node first = head;
    Node second = head;

   
    for (int i = 0; i < n; i++) {
        if (first == null) return null;
        first = first.next;
    }

    while (first != null) {
        first = first.next;
        second = second.next;
    }

    return second;
}


Node deleteNode(Node head, int key) {
    if (head != null && head.data == key) {
        return head.next;
    }

    Node curr = head;
    Node prev = null;

    while (curr != null && curr.data != key) {
        prev = curr;
        curr = curr.next;
    }

    if (curr == null) return head;
    prev.next = curr.next;

    return head;
}

void printList(Node head) {
    Node temp = head;
    while (temp != null) {
        System.out.print(temp.data + " -> ");
        temp = temp.next;
    }
    System.out.println("null");
}
