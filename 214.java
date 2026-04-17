class Solution {
    public int minMirrorPairDistance(int[] nums) {
    int n=nums.length;
    int mindist=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<n;j++){
                int rev=reverse(nums[i]);
                if(rev==nums[j]){ 
                mindist=Math.min(mindist,j-i);
            }
        }
    }
    return mindist == Integer.MAX_VALUE ? -1 : mindist;
    }
    public int reverse(int x){
        int rev=0;
        while(x>0){
            int p=x%10;
            rev=rev*10+p;
            x/=10;}
            return rev;
        }
    }
import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int org=n;
        int sum=0;
        while(n>0){
            int m=n%10;
            sum+=m*m*m;
            n/=10;
        }
        if(org==sum){
            System.out.println(+org+" is Armstrong.");
        }
        else {
            System.out.println(+org+" is not Armstrong");
        }
    }
}
output
153
153 is Armstrong.


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
