/*Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
	1 : + (Addition) a + b
2 : - (Subtraction) a - b
3 : * (Multiplication) a * b
4 : / (Division) a / b
5 : % (Modulo or remainder) a % b
Calculate the result according to the operation given and display it to the user.*/

import java.util.*;
public class all{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int add=a+b;
        int sub=a-b;
        int pro=a*b;
        int div=a/b;
        int mod=a%b;
        System.out.println("Addition: "+add);
        System.out.println("Subtraction: " +sub);
        System.out.println("product: "+pro);
        System.out.println("divisor: "+div);
        System.out.println("Modulus: "+mod);
    }
}
output: 
54
5
Addition: 59
Subtraction: 49
product: 270
divisor: 10
Modulus: 4

 // Ask the user to enter the number of the month & print the name of the month. For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on.
  import java.util.*;
public class Month{
    static String getMonthName(int n){
        switch(n) {
            case 1: return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
            default: return "Invalid month";
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number from (1 to 12)");
        int n=in.nextInt();
        System.out.println(getMonthName(n));
    }
        
}
output 
Enter the number from (1 to 12)
9
September

  Print all even numbers till n.

  import java.util.*;
public class Even{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= in.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
output
  Enter the number: 
25
2
4
6
8
10
12
14
16
18
20
22
24

//Print if a number n is prime or not (Input n from the user). 
  import java.util.*;
public class prime{
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.print("Enter a number: ");
       int n= in.nextInt();
       boolean isPrime=true;
       for(int i=2;i<=n/2;i++){
        if(n%i==0){
            isPrime = false;
            break;
        }}
            if(isPrime){
                System.out.println(+n+" is prime");
            }
            else {
                System.out.println(+n+" is not prime");
            }
        }
    }
output
  Enter a number: 67
67 is prime

/*   Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
If they enter 0 then stop.
If he/ she scores :
Marks >=90 -> print “This is Good”
89 >= Marks >= 60 -> print “This is also Good”
59 >= Marks >= 0 -> print “This is Good as well”
	Because marks don’t matter but our effort does.*/
  import java.util.*;
public class Solution{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input;
        do { 
            int n=in.nextInt();
            if(n>=90 && n<=100){
                System.out.println("This is good. ");
            }
            else if (n>=60 && n<=89){
                System.out.println("Thsi is also good.");
            }
            else if (n>=0 && n<=59){
                System.out.println("This is good as well.");
            }
            else {
                System.out.println("Invalid input.");
            }
            System.out.println("Do you want to continue? yes(1) or No(0)");
            input=in.nextInt();
        }
        while(input==1);
    }
}
output
  77
Thsi is also good.
Do you want to continue? yes(1) or No(0)
0

  //pattern wise opposite
  import java.util.*;
public class p2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n= sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            System.out.println();
            
        }
    }
}
output
  Enter a number: 
5
     
    *
   **
  ***
 ****

  //pattern wise
  import java.util.*;
public class p3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
            
        }
    }
}
output
  Enter a number: 
5
1
12
123
1234
12345
  //pattern wise
   import java.util.*;
public class p4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n= sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
            
        }
    }
}
Enter a number: 
5
12345
1234
123
12
1
  //pattern wise
  import java.util.*;
public class p5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n= sc.nextInt();
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+ " ");
                num++;
            }
            System.out.println();
            
        }
    }
}
output
  Enter a number: 
5
1 
2 3
4 5 6
7 8 9 10
11 12 13 14 15

  //pattern wise 
  import java.util.Scanner;
public class p6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
               if ((i+j)%2==0){
                System.out.print("1");
               }
               else {
                System.out.print("0");
               }
    }
    System.out.println();
}
    }
}

output 
  Enter a number: 
5
1
01
101
0101
10101
  //patttern wise 
  


