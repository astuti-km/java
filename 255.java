import java.util.*;
class Main{
    public static void main(String args[]){
        LinkedList <String> list = new LinkedList <String>();
        list.add("Doyel");
        list.add("Maumita");
        list.addLast("is ");
        list.addLast("best");
        list.addLast("Friend.");
        list.addFirst("Sudipta");
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.size());
        list.remove(3);
         System.out.println(list);
        list.removeFirst();
         System.out.println(list);
         list.removeLast();
          System.out.println(list);
    }
}
output
[Sudipta, Doyel, Maumita, is , best, Friend.]
Sudipta
6
[Sudipta, Doyel, Maumita, best, Friend.]
[Doyel, Maumita, best, Friend.]
[Doyel, Maumita, best]


import java.util.*;
class Main{
    public static void merge(int arr[],int l,int m,int r){
        int i=l,j=m+1,k=0;
        int temp[]=new int[100];
        while(i<=m && j<=r){
            if(arr[i]<=arr[j]){
                temp[k++]=arr[i++];
            }
            else {
                temp[k++]=arr[j++];
            }
        }
        while(i<=m){
            temp[k++]=arr[i++];
        }
        while(j<=r){
            temp[k++]=arr[j++];
        }
        for( i=l,k=0;i<=r;i++,k++){
            arr[i]=temp[k];
        }
        
    }
    public static void mergeSort(int arr[],int l,int r){
        if(l<r){
            int m=(l+r)/2;
            mergeSort(arr,l,m);
            mergeSort(arr,m+1,r);
            merge(arr,l,m,r);
        }
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no. of terms: ");
        int n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array: ");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();}
        mergeSort(arr,0,n-1);
        System.out.println("After sorting the Merge sort: ");
        for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
    }
}

output
Enter no. of terms: 
7
Enter the array: 
90 56 34 87 23 12
0
After sorting the Merge sort: 
0 12 23 34 56 87 90 



public class RLL {
    Node head;
    private int size;
    RLL(){
        this.size=0;
    }
    class Node
    {
        int data;
        Node next;
        Node(int data){ 
            this.data=data;
            this.next=null;
            size++;
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
    public int getSize(){
        return size;
    }
    public void reverse(){
        if(head==null || head.next==null){
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
    public static void main(String args[]){
        RLL list=new RLL();
        list.addLast(1);
         list.addLast(2);
          list.addLast(3);
           list.addLast(4);
           list.printList();

           list.reverse();
           list.printList();

    }
}


public class RLL {
    Node head;
    private int size;
    RLL(){
        this.size=0;
    }
    class Node
    {
        int data;
        Node next;
        Node(int data){ 
            this.data=data;
            this.next=null;
            size++;
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
    public int getSize(){
        return size;
    }
    public void reverse(){
        if(head==null || head.next==null){
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
    public static void main(String args[]){
        RLL list=new RLL();
        list.addLast(1);
         list.addLast(2);
          list.addLast(3);
           list.addLast(4);
           list.printList();

           list.reverse();
           list.printList();

    }
}
output
1 -> 2 -> 3 -> 4 -> Null
4 -> 3 -> 2 -> 1 -> Null




