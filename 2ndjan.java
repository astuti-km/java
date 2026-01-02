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
