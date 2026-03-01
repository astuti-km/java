import java.util.*;
public class LK {
    public static void main(String args[]){
        LinkedList<String>  list=new LinkedList<>();
        list.addFirst("a");
        list.addFirst("is");
        System.err.println(list);
        list.addFirst("This");
        list.add("List");
        System.err.println(list);
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            System.err.print(list.get(i)+" -> ");
        }
        System.err.println("Null");
        list.removeFirst();
        System.out.println(list);
        list.remove(2);
        System.err.println(list);
    }
}
output
[is, a]
[This, is, a, List]
4
This -> is -> a -> List -> Null
[is, a, List]
[is, a]



public class LL {
    Node head;
    private int size;
    LL(){
        this.size=0;
    }
    class Node
    {
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(String data){
         Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    public void printList(){
         if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+" -> ");
            currNode=currNode.next;
        }
        System.out.println("Null");
    }
    public void delFirst(){
        if(head==null){
            System.out.println("the list is empty");
            return;
        }
        size--;
        head=head.next;
    }
    public void delLast(){
         if(head==null){
            System.out.println("the list is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secLast=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secLast=secLast.next;
        }
        secLast.next=null;
    }
    public int getSize(){
        return size;
    }
    public static void main(String args[]){
        LL list=new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();
        list.addLast("List");
        list.printList();
        list.addFirst("This");
        list.printList();
        list.delLast();
        list.delFirst();
        list.printList();
        System.out.println(list.getSize());
    }
}
output
is -> a -> Null
is -> a -> List -> Null
This -> is -> a -> List -> Null
is -> a -> Null
2
