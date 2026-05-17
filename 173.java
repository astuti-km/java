class Solution {
    public boolean canReach(int[] arr, int start) {
        boolean[] visited = new boolean[arr.length];
        return dfs(arr,start,visited);
    }
    public boolean dfs(int[] arr,int index,boolean[] visited){

        if(index < 0 || index >= arr.length){
            return false;
        }

        if(visited[index]){
            return false;
        }

        if(arr[index] == 0){
            return true;
        }

        visited[index]=true;

        int right = index+arr[index];

        int left = index-arr[index];

        return dfs(arr,right,visited) || dfs(arr,left,visited);
    }
}

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
