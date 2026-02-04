class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}
class GfG {
    static Node rotate(Node head, int k) {
        if (k == 0 || head == null)
            return head;
        for (int i = 0; i < k; ++i) {
            Node curr = head;
            while (curr.next != null)
                curr = curr.next;
            curr.next = head;
            curr = curr.next;
            head = head.next;
            curr.next = null;
        }
        return head;
    }
    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data);
            if(node.next != null){
                System.out.print(" -> ");
            }
            node = node.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head = rotate(head, 6);
        printList(head);
    }
}

class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

class GfG {
    static Node rotate(Node head, int k) {
        if (k == 0 || head == null)
            return head;
        Node curr = head;
        int len = 1;
        while (curr.next != null) {
            curr = curr.next;
            len += 1;
        }
        k %= len;
        if (k == 0)
            return head;
        curr.next = head;
        curr = head;
        for (int i = 1; i < k; i++)
            curr = curr.next;
        head = curr.next;
        curr.next = null;
        return head;
    }

    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data);
            if(node.next != null){
                System.out.print(" -> ");
            }
            node = node.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
      
        head = rotate(head, 6);
        printList(head);
    }
}

import java.util.ArrayList; 
import java.util.Collections;

class Node {
    int data;
    Node next;

    Node(int x)
    {
        data = x;
        next = null;
    }
}

class GfG {

    static Node sortedMerge(Node head1,  Node head2) {
        ArrayList<Integer> arr = new ArrayList<>();
        while (head1 != null) {
            arr.add(head1.data);
            head1 = head1.next;
        }
        while (head2 != null) {
            arr.add(head2.data);
            head2 = head2.next;
        }
        Collections.sort(arr);
        Node dummy = new Node(-1);
        Node curr = dummy;

        for (int i = 0; i < arr.size(); i++) {
            curr.next = new Node(arr.get(i));
            curr = curr.next;
        }

        return dummy.next;
    }

    static void printList(Node curr) {
        while (curr != null) {
            System.out.print(curr.data);
            if (curr.next != null) {
                System.out.print(" -> ");
            }
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Node head1 = new Node(5);
        head1.next = new Node(10);
        head1.next.next = new Node(15);
        head1.next.next.next = new Node(40);

        Node head2 = new Node(2);
        head2.next = new Node(3);
        head2.next.next = new Node(20);

        Node res = sortedMerge(head1, head2);
        printList(res);
    }
}

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class GfG {
    static Node sortedMerge(Node head1, Node head2) {
        if (head1 == null)
            return head2;
        if (head2 == null)
            return head1;
        if (head1.data <= head2.data) {
            head1.next = sortedMerge(head1.next, head2);
            return head1;
        }
        else {
            head2.next = sortedMerge(head1, head2.next);
            return head2;
        }
    }

    static void printList(Node curr) {
        while (curr != null) {
            System.out.print(curr.data);
            if (curr.next != null)
                System.out.print(" -> ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Node head1 = new Node(5);
        head1.next = new Node(10);
        head1.next.next = new Node(15);
        head1.next.next.next = new Node(40);

        Node head2 = new Node(2);
        head2.next = new Node(3);
        head2.next.next = new Node(20);

        Node res = sortedMerge(head1, head2);
        printList(res);
    }
}
