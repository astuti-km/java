//  FUNCTION /METHOD OF JAVA
import java.util.*;

public class Name {
    public static void printMyName(String n){
           System.out.println("Name: "+n);
        return ;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String n=in.nextLine();
        printMyName(n);

    }
}
output
  Astuti kunwar
Name: Astuti kunwar

  import java.util.*;
class Main{
    public static void sum(int a,int b){
        int result=a+b;
        System.out.println("The sum is: "+result);
    
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        sum(a,b);
    }
}

import java.util.*;
class Main{
    public static void product(int a,int b){
        int result=a*b;
        System.out.println("The product is: "+result);
    
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        product(a,b);
    }
}
output
  15
15
The product is: 225

import java.util.*;
public class factorial {
    public static  int printFactorial(int n){
        
        if(n==0||n==1){
            return 1;
        }
        else {
            return n*printFactorial(n-1);
        }
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
    System.out.println("The factorial of "+n+  " is: "+printFactorial(n));  
  }
}
output
  6
The factorial of 6 is: 720

  import java.util.*;
public class funcEven {
   public static void evenOdd(int n){
    if(n%2==0){
        System.out.println(+n+" is even.");
    }
    else {
        System.out.println(+n+" is odd.");
    }
   } 
   public static void main(String args[]){
    Scanner in =new Scanner(System.in);
    int n=in.nextInt();
    evenOdd(n);
   }
}
output
  64
64 is even.

  
  
