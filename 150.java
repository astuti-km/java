class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i:a)
        arr.add(i);
        
        for(int i:b)
        arr.add(i);
        
        Collections.sort(arr);
        return arr.get(k-1);
    }
}


class Solution {
    public int kthMissing(int[] arr, int k) {
        // code here
        Set<Integer> set=new HashSet<>();
        for(int num:arr){
        set.add(num);
        }
        int count =0,curr=0;
        while(count<k){
            curr++;
            
            if(!set.contains(curr)){
                count++;
            }
        }
        return curr;
    }
}


class Solution {
    public int peakElement(int[] arr) {
        // code here
        int n=arr.length;
        for(int i=0;i<n;i++){
            boolean left=true;
            boolean right=true;
            
            if(i>0 && arr[i]<=arr[i-1])
            left=false;
            
            if(i<n-1 && arr[i]<=arr[i+1])
            right=false;
            
            if(left && right){
                return i;
            }
        }
        return 0;
    }
}


class SinglyLinkedList {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    void insertAtBeginning(int data) {
        Node n = new Node(data);
        n.next = head;
        head = n;
    }

    void insertAtEnd(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
            return;
        }
        Node t = head;
        while (t.next != null) {
            t = t.next;
        }
        t.next = n;
    }

    void insertAtPosition(int data, int pos) {
        if (pos == 0) {
            insertAtBeginning(data);
            return;
        }
        Node t = head;
        for (int i = 0; i < pos - 1 && t != null; i++) {
            t = t.next;
        }
        if (t == null) return;
        Node n = new Node(data);
        n.next = t.next;
        t.next = n;
    }

    void deleteAtBeginning() {
        if (head != null) {
            head = head.next;
        }
    }

    void deleteAtEnd() {
        if (head == null) return;
        if (head.next == null) {
            head = null;
            return;
        }
        Node t = head;
        while (t.next.next != null) {
            t = t.next;
        }
        t.next = null;
    }

    void deleteAtPosition(int pos) {
        if (head == null) return;
        if (pos == 0) {
            head = head.next;
            return;
        }
        Node t = head;
        for (int i = 0; i < pos - 1 && t.next != null; i++) {
            t = t.next;
        }
        if (t.next != null) {
            t.next = t.next.next;
        }
    }

    boolean search(int key) {
        Node t = head;
        while (t != null) {
            if (t.data == key) return true;
            t = t.next;
        }
        return false;
    }

    int length() {
        int c = 0;
        Node t = head;
        while (t != null) {
            c++;
            t = t.next;
        }
        return c;
    }

    void reverse() {
        Node prev = null, curr = head, next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    void display() {
        Node t = head;
        while (t != null) {
            System.out.print(t.data + " ");
            t = t.next;
        }
        System.out.println();
    }
}
