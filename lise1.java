public class linkedL {
    Node head;
    private int size;
    linkedL(){
        this.size=0;
    }
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return; 
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }
public void deleteFirst(){
    if(head==null){
        System.out.println("The list is empty.");
        return;
        
    }
    size--;
    head=head.next;
}
public void deleteLast(){
    if(head==null){
        System.out.println("The list is empty.");
        return;
    }
    size--;
    if(head.next==null){
        head=null;
        return;
    }
    
        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
}
public int getSize(){
    return size;
}
    public static void main(String args[]) {
        linkedL list = new linkedL(); 
        list.addFirst("is");         
        list.addFirst("This");

        list.addLast("yours.");
        list.printList();
        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();
        System.out.println(list.getSize());
        list.addFirst("this");
        list.printList();
        System.out.println(list.getSize());
    }
}
