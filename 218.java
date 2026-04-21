import java.util.*;
class W02_P1{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int len=in.nextInt();
        int wid=in.nextInt();
        int Area = len * wid;
        System.out.println("Area is: "+Area);
    }
}
output
7
3
Area is: 21


import java.util.*;
class W02_P1{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int len=in.nextInt();
        int wid=in.nextInt();
        int peri = 2*(len+wid);
        System.out.println("Perimeter is: "+peri);
    }
}
output
1
2
Perimeter is: 6

import java.util.*;
class Week_02_p1{
    public static int factorial(int x){
      if(x==0||x==1){
          return 1;
      }
      else {
          return x*factorial(x-1);
      }
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int x=in.nextInt();
        System.out.println(factorial(x));
    }
}
output
0
1


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
output

Enter the no. of terms: 
4
Enter values: 
12
Add 1(first) 2 (last)
1
Enter values: 
34
Add 1(first) 2 (last)
2
Enter values: 
56
Add 1(first) 2 (last)
1
Enter values: 
23
Add 1(first) 2 (last)
1
Linked list
23 -> 56 -> 12 -> 34 -> Null

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
