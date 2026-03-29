import java.util.*;
class Mian{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no. of terms: ");
        int n=in.nextInt();
        int coin[]=new int[n];
        int d[]=new int[n];
        System.out.println("Enter the coins: ");
        for(int i=0;i<n;i++){
            coin[i]=in.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int temp=coin[i];
                coin[i]=coin[j];
                coin[j]=temp;
            }
        }
        System.out.println("Coins in descending order ");
        for(int i=0;i<n;i++){
            System.out.print(coin[i]+" ");
        }
        System.out.println("\nEnter the amount: ");
        int c=in.nextInt();
        System.out.println("No. of coins used for each denominatio: ");
        for(int i=0;i<n;i++){
          d[i]=c/coin[i];
          c=c%coin[i];
          System.out.print(d[i]+" ");
        }
    }
}
output
Enter the no. of terms: 
4
Enter the coins: 
12 43 65 78
Coins in descending order 
78 65 43 12 
Enter the amount: 
6598
No. of coins used for each denominatio: 
84 0 1 0 



import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        LinkedList <Integer> list=new LinkedList<>();
        list.add(67);
        list.add(56);
        list.addLast(22);
        list.addFirst(60);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(2));
        System.out.println(list.remove(0));
        System.out.println(list);
    }
}
output
[60, 67, 56, 22]
4
56
60
[67, 56, 22]

import java.util.*;
class Main{
    public static void merge(int arr[],int l,int m,int r){
        int i=l,j=m+1,k=0;
        int temp[]=new int[100];
        while(i<=m &&j<=r){
            if(arr[i]<=arr[j]){
                temp[k++]=arr[i++];
            }
            else {
                temp[k++]=arr[j++];
            }}
            while(i<=m){
                temp[k++]=arr[i++];
            }
            while(j<=r){
                temp[k++]=arr[j++];
            }
        
        for(i=l,k=0;i<=r;i++,k++){
            arr[i]=temp[k];
        }   
    }
    public  static void mergeSort(int arr[],int l,int r){
        if(l<r){
            int m=(l+r)/2;
            mergeSort(arr,l,m);
            mergeSort(arr,m+1,r);
            merge(arr,l,m,r);
        }
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no. of terms: ");
        int n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array: ");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("The unsorted array is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        mergeSort(arr,0,n-1);
        System.out.println("\nThe sorted array is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
output
Enter the no. of terms: 
5
Enter the array: 
6 3 9 2 5 
The unsorted array is: 
6 3 9 2 5 
The sorted array is: 
2 3 5 6 9 


class LL{
    Node head;
    private int size;
    LL(){
        this.size=0;
    }
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
        
        public static void main(String args[]){
            
        }
        
    }
package pack1;
public class Demo{
    public void show(){
        System.out.println("From package 1");
    }
}
package pack2;
public class Demo{
    public void show(){
        System.out.println("From package 2");
    }
}
public class Test {
    public static void main(String[] args) {
        pack1.Demo obj1 = new pack1.Demo();
        pack2.Demo obj2 = new pack2.Demo();
        obj1.show();
        obj2.show();
    }
}


interface A {
void show();
}
interface B extends A {
    void display();
}
class Test1 implements B{
    public void show(){
        System.out.println("Show method");
    }
    public void display(){
        System.out.println("Dispaly method");
    }
 
        public static void main(String[] args) {
            Test1 obj = new Test1();
            obj.show();
            obj.display();
        }

    }

