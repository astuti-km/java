import java.util.*;
class Main{
    public static int multiply(int a,int b){
        return a*b;
    }
    public static void main(String args[]){
       Scanner in = new Scanner(System.in);
       int a=in.nextInt();
       int b=in.nextInt();
       int result=multiply(a,b);
       System.out.println("Result is: "+result);
    }
}
output: 
15
6
Result is: 90

import java.util.*;
class Main{
    public static int fact(int n){
        if(n==0||n==1){
            return 1;
        }
        else
    {
        return n*fact(n-1);
    }
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int result=fact(n);
        System.out.println("The result is: "+result);
    }
}  
output
  7
The result is: 5040

  //to print lage no.of factorial we have to use this code
import java.util.*;
class Main{
    public static int printfact(int n){
        if(n<0){
        System.out.println("Invalid number.");
        }
        int fact=1;
        for(int i=n;i>=1;i--){
            fact*=i;}
            System.out.println("Factorial is: "+fact);
            return 1;
        }
        public static void main(String args[]){
            Scanner in = new Scanner(System.in);
            int n=in.nextInt();
            printfact(n);
        }
}
output
  12
Factorial is: 479001600
  




