import java.util.*;
class Matrix{
    static boolean findMatrix(int[][] arr,int x){
        int n=arr.length;
        int p=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<p;j++){
                if(arr[i][j]==x){
                    return true;
                }
                else {
                    return false;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int p=in.nextInt();
        int[][] arr=new int[n][p];
        for(int i=0;i<n;i++){
            for(int j=0;j<p;j++){
                arr[i][j]=in.nextInt();}}
                int x=in.nextInt();
                System.out.println(findMatrix(arr,x));
        
    }
}
output
3 3
1 5 9 14 20 21 30 34 43
34
true

import java.util.*;
class Sum{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int p=in.nextInt();
        int sum=n+p;
        System.out.println("The sum is: "+sum);
    }
}
output
  567
35564
The sum is: 36131

import java.util.*;
class Check{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
       if(n%2==0){
           System.out.println("Even");
       }
       else {
           System.out.println("Odd");
       }
    }
}
output
  56
Even


  import java.util.*;
class Check{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
       int p=in.nextInt();
       int l=in.nextInt();
       if(n>p||n>l){
           System.out.println(n+" is largest.");
       }
       else if(p>n||p>l){
           System.out.println(p+" is largest.");
       }
       else if(l>n||l>p){
           System.out.println(l+" is largest.");
       }
    }
}
output
  56
44
23
56 is largest.


  import java.util.*;
class palindrome{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int same=n;
        int rev=0;
      while(n>0){
          int p=n%10;
          rev=rev*10+p;
          n/=10;
      }
      if(same==rev){
     System.out.println(rev+" is palindrome.");
      }
      else {
          System.out.println(rev+" is not palindrome");
      }
    }
}
output
  1234321
1234321 is palindrome.

import java.util.*;
class Reverse{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int cnt=0;
        while(n>0){
            int p=n%10;
            cnt++;
            n/=10;
        }
        System.out.println("The digits after cnt is: "+cnt);
    }
}
output
  5786895
The digits after cnt is: 7
  
  
  class Hello{
    public static void main(String args[]){
        System.out.println("Hello World");
    }
}
output
  Hello World

import java.util.*;
class Check{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
      if((n%4==0 && n%100!=0) || n%400==0){
          System.out.println(n+" is leap year.");
      }
      else {
          System.out.println(n+" is non-leap year.");
      }
    }
}
output
  1968
1968 is leap year.

  import java.util.*;
class Reverse{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int rev=0;
      while(n>0){
          int p=n%10;
          rev=rev*10+p;
          n/=10;
      }
     System.out.println("The reverse is: "+rev);
      }
    }
output
  5678
The reverse is: 8765

  
