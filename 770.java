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

import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int  n=in.nextInt();
        System.out.println("The number is:");
        do {
            System.out.print(n+" ");
            n++;
        }
        while(n<=15);
    }
}
output
1
The number is:
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 


import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        float a= in.nextFloat();
        float b= in.nextFloat();
        
        float sum = a+b;
        System.out.println(sum);
    }
}
output
89.75
45.67
135.42


import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int i=in.nextInt();
        while(i<=56){
            System.out.print(i+" ");
            i++;
        }
    }
}
output
35
35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 


import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
output
5
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 


import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String s=in.nextLine();
        System.out.println("Length: "+s.length());
        System.out.println("Uppercase: "+s.toUpperCase());
        System.out.println("Lowercase: "+s.toLowerCase());
        System.out.println("Substring(0,3): "+s.substring(0,3));
        System.out.println("CharAt(1): "+s.charAt(1));
        System.out.println("Index of t: "+s.indexOf('t'));
    }
}
output
Astuti
Length: 6
Uppercase: ASTUTI
Lowercase: astuti
Substring(0,3): Ast
CharAt(1): s
Index of t: 2


import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int[][][] arr={ {{1,2},{3,4}},{{5,6},{7,8}} };
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                for(int k=0;k<arr[i][j].length;k++){
                    System.out.print(arr[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
        
    }
}
output
1 2 
3 4 

5 6 
7 8 


import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no. of block: ");
        int n=in.nextInt();
        System.out.println("Enter no. of rows: ");
        int r=in.nextInt();
        System.out.println("Enter no. of columns: ");
        int c=in.nextInt();
        int arr[][][] = new int[n][r][c];
        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<r;j++){
                for(int k=0;k<c;k++){
                    arr[i][j][k]=in.nextInt();
                }
            }
        }
        System.out.println("3D array is: ");
        for(int i=0;i<n;i++){
            System.out.println("Block "+(i+1)+": ");
            for(int j=0;j<r;j++){
                for(int k=0;k<c;k++){
                    System.out.print(arr[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
output
Enter no. of block: 
3
Enter no. of rows: 
2
Enter no. of columns: 
2
Enter elements: 
1 2 3 5 6 7 9 80 21 34 56 67
3D array is: 
Block 1: 
1 2 
3 5 

Block 2: 
6 7 
9 80 

Block 3: 
21 34 
56 67 

class Main{
    public static void main(String args[]){
        int arr[][]=new int[3][3];
        arr[0]=new int[3];
        arr[1]=new int[2];
        arr[2]=new int[5];
        int count =1;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=count++;
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
output
1 2 3 
4 5 
6 7 8 9 10 

import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = in.nextInt();

        int arr[][] = new int[n][];

        for(int i = 0; i < n; i++) {
            System.out.print("Enter size of row " + i + ": ");
            int size = in.nextInt();
            arr[i] = new int[size];

            for(int j = 0; j < size; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        // Print
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
output
Enter number of rows: 3
Enter size of row 0: 3
1 2 3
Enter size of row 1: 2
2
56
Enter size of row 2: 5
12 45 78
7 8 
1 2 3 
2 56 
12 45 78 7 8 


import java.util.*;
class Main{
    public static void main(String args[]){
        String[] arr = {"Rohit","Anjali","Subham","Astuti"};
        Arrays.sort(arr);
        for(String s:arr){
            System.out.println(s);
        }
    }
}
output
Anjali
Astuti
Rohit
Subham


import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in  =new Scanner(System.in);
        System.out.println("Enter no. of names: ");
        int n=in.nextInt();
        in.nextLine();
        
        String arr[]=new String[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter names: "+(i+1)+": ");
            arr[i]=in.nextLine();
        }
        Arrays.sort(arr);
        System.out.println("Sorted string array is: ");
        for(String s:arr){
            System.out.println(s);
        }
    }
}
output
Enter no. of names: 
7
Enter names: 1: 
Rohit
Enter names: 2: 
Aritro
Enter names: 3: 
Spandan
Enter names: 4: 
Unmilan
Enter names: 5: 
Astuti
Enter names: 6: 
Anjali
Enter names: 7: 
Ayani
Sorted string array is: 
Anjali
Aritro
Astuti
Ayani
Rohit
Spandan
Unmilan


import java.util.*;
class Coordinate {
    int x,y;
    
    void display(){
        System.out.println("The value of x is:"+x+" and y is: "+y);
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        Coordinate c=new Coordinate();
        c.x=in.nextInt();
        c.y=in.nextInt();
        c.display();
    }
}
output
10
35
The value of x is:10 and y is: 35


import java.util.*;
class Student {
    String name;
    int roll;
    float marks;
    
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Roll: "+roll);
        System.out.println("Marks: "+marks);
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        Student s =new Student();
        s.name="Astuti";
        s.roll=15;
        s.marks=90.7f;
        
        s.display();
    }
}
output
Name: Astuti
Roll: 15
Marks: 90.7


import java.util.*;
class Coordinate{
    int x,y;
    void display(){
        System.out.println("x= "+x+" y "+y);
    }
    boolean isEqual(Coordinate c){
        return(this.x==c.x && this.y==c.y);
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        Coordinate c1=new Coordinate();
        c1.x=in.nextInt();
        c1.y=in.nextInt();
        Coordinate c2=new Coordinate();
        c2.x=in.nextInt();
        c2.y=in.nextInt();
        if(c1.isEqual(c2)){
            System.out.println("Coordinates are equal");
        }
        else 
        System.out.println("Coordinates are not equal");
    }
}
output
5
15
5
15
Coordinates are equal

import java.util.*;
class factorial{
    int fact(int n){
        if(n==0||n==1)
        return 1;
        else 
        return n*fact(n-1);
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        factorial f= new factorial();
        int n=in.nextInt();
        System.out.println("The factorial of "+n+" is: "+f.fact(n));
    }
}
output
5
The factorial of 5 is: 120

class Armstrong{
    public static void main(String args[]){
        for(int i=200;i<=400;i++){
            int n=i,sum=0;
            while(n!=0){
                int p=n%10;
                sum+=p*p*p;
                n/=10;
            }
            if(sum==i){
              System.out.println(i);  
            }
        }
    }
}
output
370
371


import java.util.*;
class ReverseArray{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n=in.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
        arr[i]=in.nextInt();
        }
        System.out.println("Reverse array is: ");
        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
output
Enter the size of an array: 
5
Enter the elements: 
1 48 5 8 45
Reverse array is: 
45 8 5 48 1 

import java.util.*;
class ReverseAndPalindrome{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String s=in.nextLine();
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        System.out.println("The reverse string is: "+rev);
        if(s.equals(rev)){
            System.out.println("Palindrome string.");
        }
        else {
            System.out.println("Not a Palindrome string.");
        }
    }
}
output
kanak
The reverse string is: kanak
Palindrome string.


import java.util.*;
class MaxAndMin{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n=in.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
        arr[i]=in.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }}
             for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Maximum is: "+max);
        System.out.println("Minimum is: "+min);
    }
}
output
Enter the size of an array: 
5
Enter the elements: 
12 34 56 8 5
Maximum is: 56
Minimum is: 5

import java.util.*;
public class characOccur {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a strings: ");
        String s=in.nextLine();
        System.out.println("Enter a character: ");
        char ch=in.next().charAt(0);
        int cnt=0;
        System.out.println("Character of index: ");
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==ch){
                System.out.print(i+" ");
                cnt++;
            }
        }
        System.out.println("\nOccurence of "+ch+" is: "+cnt);
    }
}
output
Enter a strings: 
Astuti
Enter a character: 
t
Character of index: 
2 4
Occurence of t is: 2


public class SwapString {
    public static void main(String[] args) {
        String a="Astuti";
        String b="Jyoti";
        a=a+b;
        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());
        System.out.println("a "+a);
        System.out.println("b: "+b);
        
    }
}
output
a Jyoti
b: Astuti



