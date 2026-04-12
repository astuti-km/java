class LL{
    Node head;
    
    class Node{
        int data;
        Node next;
        Node (int data){
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
        Node newNode = new Node(data);
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
        Node currNode =head;
        while(currNode!=null){
            System.out.print(currNode.data+" -> ");
            currNode=currNode.next;
        }
        System.out.print("Null");
    }
    public static void main(String args[]){
        LL list = new LL();
        list.addFirst(38);
        list.addLast(57);
        list.addFirst(19);
        list.addLast(76);
        list.printList();
    }
}
output
19 -> 38 -> 57 -> 76 -> Null

// by user input

import java.util.*;
class LL{
    Node head;
    
    class Node{
        int data;
        Node next;
        Node (int data){
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
        Node newNode = new Node(data);
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
        Node currNode =head;
        while(currNode!=null){
            System.out.print(currNode.data+" -> ");
            currNode=currNode.next;
        }
        System.out.print("Null");
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        LL list = new LL();
        System.out.println("Enter no. of list: ");
        int n=in.nextInt();
        
        for(int i=0;i<n;i++){
            System.out.println("Enter values: ");
            int val=in.nextInt();
            
            System.out.println("Add at( 1=first,2=last)");
            int choice =in.nextInt();
            
            if(choice==1){
                list.addFirst(val);
            }
            else {
                list.addLast(val);
            }
        }
        System.out.println("Linked list: ");
        list.printList();
    }
}
output
Enter no. of list: 
5
Enter values: 
23
Add at( 1=first,2=last)
1
Enter values: 
78
Add at( 1=first,2=last)
2
Enter values: 
67
Add at( 1=first,2=last)
2
Enter values: 
70
Add at( 1=first,2=last)
1
Enter values: 
45
Add at( 1=first,2=last)
2
Linked list: 
70 -> 23 -> 78 -> 67 -> 45 -> Null
