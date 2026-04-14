import java.util.*;
class LL{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;}
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
        System.out.print("Null");
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        LL list=new LL();
        list.addFirst(88);
        list.addLast(78);
        list.addFirst(55);
        list.addLast(99);
        list.printList();
    }
}
output
55 -> 88 -> 78 -> 99 -> Null

import java.util.*;
class LL{
    Node head;
    
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;}
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
        System.out.print("Null");
    }
    public void reverse(){
        if(head==null||head.next==null){
            return;
        }
        Node prevNode =head;
        Node currNode=head.next;
        while(currNode!=null){
            Node nextNode=currNode.next;
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=nextNode;
        }
        head.next= null;
        head=prevNode;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        LL list=new LL();
        list.addFirst(88);
        list.addLast(78);
        list.addFirst(55);
        list.addLast(99);
        list.printList();
        System.out.println();
        list.reverse();
        list.printList();
    }
}
output
55 -> 88 -> 78 -> 99 -> Null
99 -> 78 -> 88 -> 55 -> Null

public class StackClass {
      static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Stack{
        static Node head;
        public static boolean isEmpty(){
            return head==null;
        }
        public static  void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head=newNode;
                return;
            }
            else { 
            newNode.next=head;
            head=newNode;
        }
        System.out.println(data+" pushed");
    }

        public  int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=head.data;
            head=head.next;
            System.out.println(top+" poped");
            return top;
        }
        public int peek(){
            if(isEmpty()){
                return -1;
            }
            System.out.println("Top element is: "+head.data);
            return head.data;
        }
    
    public void printStack(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+" -> ");
            currNode=currNode.next;
        }
        System.out.print("Null");
    
    System.out.println();
    }
}
    public static void main(String args[]){
       Stack s=new Stack();
       s.push(1);
        s.push(2);
       s.push(3);
       s.printStack();
       s.pop();
       s.printStack();
      s.peek();
    }
    }
output
2 pushed
3 pushed
3 -> 2 -> 1 -> Null
3 poped
2 -> 1 -> Null
Top element is: 2
