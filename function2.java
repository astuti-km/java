import java.util.*;
class Main{
    public static boolean checkPrime(int n){
      if(n<=1){
          return false;
      }
      for(int i=2;i<=n/2;i++){
          if(n%i==0){
              return false;
          }
      }
      return true;}
     public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        if(checkPrime(n)) {
            System.out.println(+n+" is prime.");
        }
        else{
            System.out.println(+n+" is not prime.");
        }
    }
}
/*n=7
n<=1?=no;
i=2 so n%i means 7%2==1,7%3=1,7%4=1,7%5=1,7%6=1
return true */

output
7
7 is prime.

  import java.util.*;
public class Main{
    public static void  printTable(int n){
        for(int i=1;i<=10;i++)
            System.out.println(+n+ " * "+i+" = "+(n*i));
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        System.out.println("Table: ");
        printTable(n);
    }
}/*
 n=15 print 
 i=1 upto i=10 then increment (i++)
so in output(n*i=(n*i)) means 15*1=15,15*2=30
*/
output
  15
Table: 
15 * 1 = 15
15 * 2 = 30
15 * 3 = 45
15 * 4 = 60
15 * 5 = 75
15 * 6 = 90
15 * 7 = 105
15 * 8 = 120
15 * 9 = 135
15 * 10 = 150

  import java.util.*;
class Main{
    public static void printAvg(int a,int b,int c){
        int result=(a+b+c)/3;
        System.out.println(result);
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        System.out.println("The result is: ");
        printAvg(a,b,c);
    }
} 
output
  23
45
67
The result is: 
45

  
