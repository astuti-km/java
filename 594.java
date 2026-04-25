import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        if(n%2==0){
            System.out.println(+n+" is even.");
        }
        else if(n%2!=0){
            System.out.println(+n+" is odd.");
        }
    }
}
output
15
15 is odd.


import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int len=in.nextInt();
        int wid=in.nextInt();
        
        int area=len*wid;
        System.out.println("Area of rectangle is: "+area);
        
        int perim=2*(len+wid);
        System.out.println("Perimeter of rectangle is: "+perim);
    }
}
output
5
7
Area of rectangle is: 35
Perimeter of rectangle is: 24


import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int r=in.nextInt();
        int h=in.nextInt();
        
        double volume=Math.PI*r*r*h;
        System.out.println("Volume is: "+volume);
    }
}
output
1
1
Volume is: 3.141592653589793

import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
       int n=in.nextInt();
       for(int i=1;i<=4;i++){
           int result=n*i;
           System.out.println(+n+" * "+i+" = "+result);
       }
    }
}
output
10
10 * 1 = 10
10 * 2 = 20
10 * 3 = 30
10 * 4 = 40


import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
       int n=in.nextInt();
       int p=in.nextInt();
       int quot = n/p;
       int rem=n%p;
       System.out.println("Quotient is: "+quot);
       System.out.println("Remainder is: "+rem);
    }
}
output
14
3
Quotient is: 4
Remainder is: 2


import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
       int l=in.nextInt();
       int b=in.nextInt();
       
       int area=l*b;
       System.out.println("Area is: "+area);
    }
}
output
4
3
Area is: 12


import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
       int l=in.nextInt();
       int b=in.nextInt();
       
       int perim=2*(l+b);
       System.out.println("Perimeter is: "+perim);
    }
}
output
4
3
Perimeter is: 14


import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int max=0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum is: "+max);
    }
}
output
5
12 7 68 5 3
Maximum is: 68


import java.util.*;
class Main{
    static class rectangle{
        int length;
        int breadth;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int l=in.nextInt();
        int b=in.nextInt();
        rectangle r=new rectangle();
        r.length=l;
        r.breadth=b;
        System.out.println("Sum is: "+(r.length+r.breadth));
    }
}
output
4
5
Sum is: 9

import java.util.*;
class Main{
    static class Circle{
        int radius;
    Circle(int radius){
        this.radius=radius;
    }
    }
        public static void main(String args[]){
            Scanner in  = new Scanner(System.in);
            int r=in.nextInt();
            Circle c=new Circle(r);
            System.out.println("Radius of the circle is: "+c.radius);
    
}
}
output
5
Radius of the circle is: 5

import java.util.*;
class Main{
    public static int factorial(int n){
        if(n==0||n==1){
        return 1;}
        else 
        return n*factorial(n-1);
    }
        public static void main(String args[]){
            Scanner in  = new Scanner(System.in);
            int n=in.nextInt();
            System.out.println("The factorial is: "+factorial(n));
}
}
output
5
The factorial is: 120

import java.util.*;
class cls1{
    void add(int a,int b){
        System.out.println(a+b);
    }
}
 class cls2 extends cls1{
    void mul(int a,int b){
        System.out.println(a*b);
    }
        void sumSqr(int a,int b){
            System.out.println((a*a)+(b*b));
    }
}
class Mp{
    public static void main(String args[]){
     Scanner in  = new Scanner(System.in);
       cls2 ob=new cls2();
    int a=in.nextInt();
    int b=in.nextInt();
  
    ob.add(a,b);
    ob.mul(a,b);
    ob.sumSqr(a,b);
}
}
output
2
4
6
8
20

import java.util.*;

class Main{
    public static void main(String args[]){
     Scanner in  = new Scanner(System.in);
       int n=in.nextInt();
       int cnt=0;
       while(n>0){
           int p=n%10;
           cnt++;
           n/=10;
       }
       System.out.println(cnt);
}
}
output
12457
5


import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for(int i=1;i<=n;i++){
        if(n%i==0)
        System.out.print(i+" ");
        }
    }
}
output
60
1 2 3 4 5 6 10 12 15 20 30 60 


import java.util.*;
class Student{
    private String name;
    private int age;
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String name=in.next();
        int age=in.nextInt();
        
        Student stu=new Student(name,age);
        System.out.print("Name: "+stu.getName()+" Age: "+stu.getAge());
    }
}
output
Astuti
20
Name: Astuti Age: 20

import java.util.*;
class Main{
static class Student {
    int rollNo;
    Student(int r){
        rollNo=r;
    }
}
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int r=in.nextInt();
        Student s=new Student(r);
        System.out.println("Rollno. is: "+s.rollNo);
       
    }
}
output
5
Rollno. is: 5

import java.util.*;
class Main{
static class car {
   public int speed;
}
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int s=in.nextInt();
        car c=new car();
        c.speed=s;
       System.out.println("The spped is: "+c.speed);
    }
}
output
12
The spped is: 12


import java.util.*;
class Main{
static class Account {
   private int balance;
   public void setBalance(int b){
       balance =b;
   }
   public int getBalance(){
       return balance;
   }
}
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int b=in.nextInt();
        Account ac=new Account();
        ac.setBalance(b);
        System.out.println("Account balance is: "+ac.getBalance());
    }
}
output 
12670
Account balance is: 12670


import java.util.*;
class Main{
static class Employee{
    protected int salary;
}
static class Manager extends Employee{
}
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        Manager m=new Manager();
        m.salary=n;
        System.out.println("The salary is: "+m.salary);
    }
}
output
1000000
The salary is: 1000000


import java.util.*;
class Main{
static class Calculator{
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public void printThreeSum(int x,int y,int z){
        int sum=add(x,y,z);
        System.out.println("The sum of three num is: "+sum);
    }
}
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int x=in.nextInt();
         int y=in.nextInt();
          int z=in.nextInt();
          Calculator c=new Calculator();
          System.out.println("The sum of two no. is: "+c.add(a,b));
          c.printThreeSum(x,y,z);
    }
}
output
5
10
2
3
4
The sum of two no. is: 15
The sum of three num is: 9

import java.util.*;
interface Number{
    int findSqr(int n);
}
class A implements Number{
    int n,sqr;
    public int findSqr(int n){
        sqr=n*n;
        return sqr;
    }
}
  public class Mm{
      public static void main(String args[]){
          Scanner in = new Scanner(System.in);
          int n=in.nextInt();
          A a=new A();
          System.out.println("The square is: "+a.findSqr(n));
      }
  }  


import java.util.*;
interface GCD{
    public int findGCD(int n1,int n2);
}
class A implements GCD{
    int n1,n2;
    public int findGCD(int n1,int n2){
        if(n1==0&&n2==0){
            return -1;
        }
        else if(n2==0){
            return n1;
        }
        else {
            return findGCD(n2,n1%n2);
        }
    }
}
class Ms{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n1=in.nextInt();
        int n2=in.nextInt();
        A a=new A();
        System.out.println(a.findGCD(n1,n2));
    }
}

import java.util.*;

class Ms{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int p=in.nextInt();
       
        try{
             int res=n/p;
             System.out.println(res);
        }
        catch(ArithmeticException e){
            System.out.println("Exception caught");
        }
    }
}
output
12
5
2


import java.util.*;
import java.util.InputMismatchException;
class Ms{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int len=in.nextInt();
       int name[]=new int[len];
       int sum=0;
       try{
           for(int i=0;i<len;i++){
               int u=in.nextInt();
               name[i]=u;
               sum+=name[i];
           }
           System.out.println(sum);
       }
       catch(InputMismatchException e){
           System.out.println("You entered bad data");
       }
    }
}
output
2
3
2
5

import java.util.*;
class Ms{
    public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int i=in.nextInt();
    int j;
    try{
        switch(i){
            case 0: 
                j=92/0;
                break;
        case 1:
            int b[]=null;
            j=b[0];
            break;
            default:
            System.out.println("No exception");
    }
    }
    catch(Exception e){
        System.out.println(e);
    }
    }
}
output
0
java.lang.ArithmeticException: / by zero


class Main extends Thread{
    public void run(){
        System.out.println("Hellofrom Thread");
    }
    public static void main(String args[]){
        Main m=new Main();
        m.start();
    }
}

class myRunnable implements Runnable{
    public void run(){
        System.out.println("Runnable thread executed");
    }
}
    class Ma{
    public static void main(String args[]){
    myRunnable m=new myRunnable();
    Thread t=new Thread(m);
        t.start();
    }
}

interface Task{
    void run();
}
class BaseClass implements Task{
    public void run(){
        
    }
}
class MyThreads extends BaseClass{
    public void run(){
        System.out.println("Java Threads");
    }
}
public class mc{
    public static void main(String args[]){
        MyThreads m=new MyThreads();
        m.run();
    }
}


