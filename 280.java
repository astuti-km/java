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
        Node newNode =new Node(data);
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
            System.out.println("Enter the no. of terms: ");
            int n=in.nextInt();
            for(int i=0;i<n;i++){
            System.out.println("Enter values: ");
            int val=in.nextInt();
            
            System.out.println("Add 1(first) 2 (last)");
            int choice =in.nextInt();
            if(choice ==1){
                list.addFirst(val);}
                else {
                    list.addLast(val);
                }
                }
                System.out.println("Linked list");
                list.printList();
            }
        }


class RLL{
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
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
           currNode = currNode.next;
        }
        currNode.next=newNode;
    }
    public void reverse(){
        if(head==null||head.next==null){
            return;
        }
        Node prevNode=head;
        Node currNode=head.next;
        while(currNode!=null){
            Node nextNode = currNode.next;
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prevNode;
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
        RLL list=new RLL();
        
        list.addFirst(23);
        list.addLast(78);
           list.addFirst(7);
           list.addLast(76);
              list.addFirst(34);
              list.addLast(27);
                 list.addFirst(1);
                 list.printList();
                 System.out.println();
                 list.reverse();
                 list.printList();
    }
}


import java.util.*;
class List{
    public static void main(String args[]){
        LinkedList <Integer> list=new LinkedList<Integer>();
        list.addFirst(8);
        list.add(87);
        list.addLast(57);
        list.addFirst(45);
        list.addLast(53);
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.size());
        
    }
}

class LL{
    Node head;
    
    private int size;
    LL(){ 
    size=0;}
    
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
            size++;
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
            currNode=currNode.next;
        }
            currNode.next=newNode;
    }
     public void reverse(){
        if(head==null||head.next==null){
            return;
        }
        Node prevNode=head;
        Node currNode=head.next;
        while(currNode!=null){
            Node nextNode=currNode.next;
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prevNode;
    }
    public void printList(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+"-> ");
            currNode=currNode.next;
        }
        System.out.print("Null");
    }
    public void removeFirst(){
        if(head==null){
            System.out.println("Empty list,Nothing!");
            return;
        }
        size--;
        head=head.next;
        
    }
    public void removeLast(){
        if(head==null){
            System.out.println("Empty list,Nothing");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node currNode=head;
        Node nextNode=head.next;
        while(nextNode.next!=null){
            currNode=currNode.next;
            nextNode=nextNode.next;
        }
        currNode.next=null;
    }
    public int getSize(){
        return size;
    }
   
    public static void main(String args[]){
        LL list=new LL();
        list.addLast(67);
        list.addFirst(12);
       list.addLast(100);
       list.addFirst(123);
        list.addLast(90);
        list.addFirst(1);
        list.printList();
        System.out.println();
        list.reverse();
        list.printList();
        System.out.println();
        System.out.print(list.getSize());
        System.out.println();
        list.removeFirst();
        list.printList();
        System.out.println();
        list.removeLast();
        list.printList();
    }
}
