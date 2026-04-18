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
output
[45, 8, 87, 57, 53]
45
5

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
output
1-> 123-> 12-> 67-> 100-> 90-> Null
90-> 100-> 67-> 12-> 123-> 1-> Null
6
100-> 67-> 12-> 123-> 1-> Null
100-> 67-> 12-> 123-> Null

import java.util.*;
public class W01_ass_1{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        if(n%2==0){
            System.out.println("Even");
        }
        else if(n%2!=0){
            System.out.println("Odd");
        }
        in.close();
    }
}
output
3
Odd


import java.util.*;
public class W01_ass_2{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        double length=in.nextDouble();
        double breadth=in.nextDouble();
        
        double area=length*breadth;
        double perimeter=2*(length+breadth);
       
        System.out.printf("Perimeter is 2*(%.1f+%.1f)=%.2f\n",length,breadth,perimeter);
        
         System.out.printf("Area is %.1f * %.1f = %.2f",length,breadth,area);
        in.close();
    }
}
output
2.5
6.8
Perimeter is 2*(2.5+6.8)=18.60
Area is 2.5 * 6.8 = 17.00


import java.util.*;
public class W01_P3{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        double radius=in.nextDouble();
        double height=in.nextDouble();
        
        double volume=Math.PI*radius*radius*height;
        
        System.out.printf("Volume is %.2f",volume);
        in.close();
    }
}
output
1
1
Volume is 3.14


import java.util.*;
public class W01_P4{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for(int i=1;i<=4;i++){
           System.out.println(+n+" * "+i+" = "+(n*i));
    }
    }
}
output
10
10 * 1 = 10
10 * 2 = 20
10 * 3 = 30
10 * 4 = 40


import java.util.*;
public class W01_P5{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        int x=in.nextInt();
        int y=in.nextInt();
        
        int quo=x/y;
        int rem=x%y;
        System.out.println("The quotient is "+quo);
        System.out.println("The remainder is "+rem);
        in.close();
    }
}
output
-756
8
The quotient is -94
The remainder is -4



    class Queue{
        static int arr[];
        static int size;
        static int rear=-1;
        Queue(int n){
            arr=new int[n];
            this.size=n;
        }
        public static boolean isEmpty(){
            return rear==-1;
        }
        public static void enqueue(int data){
            if(rear==size-1){
                System.out.println("Full enqueue");
                return;
            }
            rear++;
            arr[rear]=data;
        }
        public static int dequeue(){
            if(isEmpty()){
                System.out.println("Empty queue");
                 return -1;
            }
            int front=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            return arr[0];
        }
    
    public static void main(String args[]){
        Queue q=new Queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.dequeue();
        }
    }
    }
output
1
2
3
