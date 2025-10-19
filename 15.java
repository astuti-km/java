import java.util.*;
class Solution {
    public static void fizzBuzz(int number) {
        // Write your code here.
        if(number%3==0 &&number%5==0){
            System.out.println("FizzBuzz");
        }
        else if(number%3==0){
            System.out.println("Fizz");
        }
        else if(number%5==0) {
         System.out.println("Buzz");   
        }
        else{
            System.out.println(number);
        }
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int number=in.nextInt();
        fizzBuzz(number);
    }
}

class Solution {
    public  void calculate(int a, int b, int operator) {
        // code here
        if(operator==1){
            System.out.println(a+b);
        }
        else if(operator==2){
            System.out.println(b-a);
        }
        else if(operator==3){
            System.out.println(a*b);
        }
        else {
            System.out.println("Invalid Input");
        }
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int operator = in.nextInt();
        Solution obj=new Solution();
        obj.calculate(a,b,operator);
        
    }
}

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        // Typecast and print
        int b=(int)d;
        System.out.println(b);
    }
}
class Solution {
    public int[] computeOperations(int x, int y) {
        // code here
        int p=x+y;
        int q=x-y;
        int r=x*y;
        int s=x/y;
        int t=x%y;
        return new int[]{p,q,r,s,t};
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int x=in.nextInt();
        int y=in.nextInt();
        Solution obj=new Solution();
        int[] result=obj.computeOperations(x,y);
        System.out.println(Arrays.toString(result));
    }
}

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

import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(a+""+b);
    }
}

import java.util.*;

class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        // TypeCast to int double it and print
       int p=Integer.parseInt(num);
        int n=p*2;
        System.out.println(n);
    }
}

import java.util.*;
class Solution {
    public static int nSum(int n) {
        int sum=0;
        for(int i=1;i<=n;i++){
           sum+=i;}
           return sum;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(nSum(n));
    }
}

import java.util.*;

public class Solution {
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>100){
        System.out.println("Big");
        System.out.println("Number");
        }
        else{
        System.out.println("Number");
    }
    }
}

import java.util.*;

public class Solution {
    public static void solve() {
        // Your Code Here
            Scanner in = new Scanner(System.in);
            int a=in.nextInt();
            if(a>100){
                System.out.println("Big");
            }
            else if(a<10){
                System.out.println("Small");
            }
            else {
                System.out.println("Number");
            }
    }
}

import java.util.*;

public class Solution {
    public static void main(String args[]) {
        // Your Code Here
        Scanner in = new Scanner(System.in);
        int n1=in.nextInt();
        int n2=in.nextInt();
        for(int i=1;i<=10;i++){
            n1*=i;}
            for(int i=1;i<=10;i++){
                n2*=i;
            }
            System.out.println(n1-n2);
        }
    }
