1.
class Solution {
    static void printHelloWorld() {
        System.out.println("Hello World");
    }
}

2.
import java.util.*;

class GFG {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        float b=in.nextFloat();
        long c=in.nextLong();
        byte d=in.nextByte();
        in.nextLine();
        String s=in.nextLine();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(s);
        
    }
}

3.
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Write Code to Swap
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a + " " + b);
    }
}

4.
class Solution {
    public static void utility(int number) {
        if(number>100){
            System.out.println("Big");
            System.out.println("Number");
        }
        else{
        System.out.println("Number");
    }
    }
    public static void main(String args[]) {
     utility(101);   
    }
}
5.
import java.util.*;
class Solution {
    public static void utility(int n) {
        int ans =Math.abs(n%10);
            System.out.println(ans);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        utility(n);
    }
}
6.
import java.util.*;

class GFG {
    public static void main(String args[]) {  
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        n=n+10;
        System.out.println(n);
    }
}
7.
class Solution {
    public static String utility(int n) {
        if(n%2==0)
           return "Friend";
        else
        return "You";
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(utility(n));
    }
}
8.
import java.util.*;
class Solution {
    static void printIntString(String S, int N) {
        System.out.println("The input string :"+S);
        System.out.println("The input integer :"+N);
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String S=in.next();
        int N=in.nextInt();
        printIntString(S,N);
    }
}
9.
import java.util.*;

public class Solution {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        if(a>100){
            System.out.println("Big");
        }
        else
        System.out.println("Number");
    }
}
10.
import java.util.*;

public class Solution {
    public static void solve() {
        Scanner in = new Scanner(System.in);
    int n=in.nextInt();
        for(int i=1;i<=10;i++){
           System.out.print(n*i+" ");
        }
    }
    public static void main(String[] args){
    
    solve();
}
}
