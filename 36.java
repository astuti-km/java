import java.util.*;
class gcd{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int m=in.nextInt();
        int n=in.nextInt();
        while(m!=n){
        if(m>n){
            m=m-n;
        }
        else {
            n=n-m;
        }}
        System.out.println("GCD is: "+n);
    }
}
output
6
4
GCD is: 2

import java.util.*;
public class Solutions {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
      
       int a = 0, b = 1;
          
       System.out.print(a+" ");
      
       if(n > 1) {
           //find nth term
           for(int i=2; i<=n; i++) {
               System.out.print(b+" ");
               //the concept below is called swapping
               int temp = b;
               b = a + b;
               a = temp;
           }
           System.out.println();
       }
   }   
}
output
5
0 1 1 2 3 

import java.util.*;
public class Solutions {
   public static void main(String args[]) {
       System.out.println("Enter x");
       Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();
       System.out.println("Enter n");
       int n = sc.nextInt();
       int result = 1;
       for(int i=0; i<n; i++) {
           result = result * x;
       }
       System.out.println("x to the power n is : "+ result);
   }   
}
output
Enter x
5
Enter n
3
x to the power n is : 125




