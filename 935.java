import java.util.*;
class Parent{
    private int x;
    void set(int x){
        this.x=x;
    }
    void showParent(){
        System.out.println("Parent x: "+x);
    }
}
class child extends Parent{
    void showchild(){
        System.out.println("Child cannot access private variable directly.");
    }
}
public class TestPrivate{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of x:");
        child obj=new child();
        int v=in.nextInt();
        obj.set(v);
        obj.showParent();
        obj.showchild();
    }
}
output
Enter the value of x:
11
Parent x: 11
Child cannot access private variable directly.


class Grandparent{
    void gp(){
        System.out.println("Grandparent class");
    }
}
class Parent extends Grandparent {
    void p(){
        System.out.println("Parent class ");
    }
}
class Child extends Parent{
    void c(){
        System.out.println("Child class");
    }
}
public class multilevel {
    public static void main(String[] args) {
        Child s=new Child();
        s.gp();
        s.p();
        s.c();
    }
}
output
Grandparent class
Parent class 
Child class



import java.util.*;
class Base{
    void b(String n){
        System.out.println("Base class: "+n);
    }
}
    class Derived extends Base{
        void d(String p){
            System.out.println("Derived class: "+p);
        }
    }
public class Constructor {
  public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      Derived obj=new Derived();
      String n=in.nextLine();
      String p=in.nextLine();
      obj.b(n);
      obj.d(p);
  }  
}
output
As
Astuti
Base class: As
Derived class: Astuti

class Person{
    String name;
    int age;
    Person(String n,int a){
        name=n;
        age=a;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
class Employee extends Person{
    double salary;
    Employee(String n,int a,double s){
        super(n,a);
        salary=s;
    }
    void display(){
        super.display();
        System.out.println("Salary: "+salary);
    }
}

public class TestPerson {
    public static void main(String[] args) {
        Person p=new Person("Rahul",20);
        System.out.println("Persons detail:");
        p.display();
        System.out.println();
        Employee e=new Employee("Aman",20,500);
        System.out.println("Employee dtails: ");
        e.display();
    }
}
output
Persons detail:
Name: Rahul
Age: 20

Employee dtails:
Name: Aman
Age: 20
Salary: 500.0


class Bank{
    int rateofinterest(){
        return 0;
    }}
    class SBI extends Bank{
        int rateofinterest(){
            return 9;
        }
    }
    class PNB extends Bank{
        int rateofinterest(){
            return 10;
        }
    }
    class BOB extends Bank{
        int rateofinterest(){
            return 11;
        }
    }

    public class Interest {
    public static void main(String[] args) {
        SBI s=new SBI();
        PNB p=new PNB();
        BOB b=new BOB();
        System.out.println("SBI rate: "+s.rateofinterest()+"%");
        System.out.println("PNB rate: "+p.rateofinterest()+"%");
        System.out.println("BOB rate: "+b.rateofinterest()+"%");
    }
}
output
SBI rate: 9%
PNB rate: 10%
BOB rate: 11%

import java.util.*;
class base{
    base(String name){
        System.out.println("Bse constructor class: "+name);
    }
}
class Derived extends base{
    Derived(String name,int age){
        super(name);
        System.out.println("Derived constructor class: "+age);
    }
}
public class construct {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);    
            String name=in.nextLine();
            int age=in.nextInt();
        Derived d=new Derived(name,age);
    }
}
output
Astuti
19
Bse constructor class: Astuti
Derived constructor class: 19


final class Vehicle{
    final void speed(){
        System.out.println("speed is fixed.");
    }
}
public class keyword {
    public static void main(String[] args) {
        Vehicle v= new Vehicle();
        v.speed();
    }
}
output
speed is fixed.


***with user input***
import java.util.*;

final class Vehicle {
    String name;
    int speed;

    // Constructor to take input
    Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    // Method to display
    final void display() {
        System.out.println("Vehicle name: " + name);
        System.out.println("Speed: " + speed + " km/h");
    }
}

public class Keyword {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter vehicle name: ");
        String vname = in.nextLine();

        System.out.print("Enter vehicle speed: ");
        int vspeed = in.nextInt();

        Vehicle v = new Vehicle(vname, vspeed);
        v.display();
    }
}


interface shape{
    void draw();
}
class Circle implements shape{
    public void draw(){
        System.out.println("Drawing circle");
    }
}
public class Method {
public static void main(String[] args) {
    Circle c=new Circle();
    c.draw();
}
}
    output
Drawing circle
**
take it as user input
import java.util.*;

interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Square implements Shape {
    public void draw() {
        System.out.println("Drawing Square");
    }
}

class Triangle implements Shape {
    public void draw() {
        System.out.println("Drawing Triangle");
    }
}

public class Method {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Choose a shape to draw:");
        System.out.println("1 = Circle, 2 = Square, 3 = Triangle");
        int choice = in.nextInt();

        Shape s; // interface reference

        switch(choice) {
            case 1:
                s = new Circle();
                break;
            case 2:
                s = new Square();
                break;
            case 3:
                s = new Triangle();
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        s.draw(); // call draw() method
    }
}


abstract class Addition{
    abstract void add(int... num);
    }
class Demo extends Addition{
    void add(int... num){
        int sum=0;
        for(int n:num){
            sum+=n;
        }
        System.out.println("sum is: "+sum);
    }
}
public class Arguments {
    public static void main(String[] args) {
        Demo d=new Demo();
        d.add(10,20,30);
    }
}
output
sum is: 60
*********
take it as user input
import java.util.*;

abstract class Addition {
    abstract void add(int... nums); // abstract method with varargs
}

class Demo extends Addition {
    void add(int... nums) {
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        System.out.println("Sum is: " + sum);
    }
}

public class Arguments {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers do you want to add? ");
        int n = in.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = in.nextInt();
        }

        Demo d = new Demo();
        d.add(numbers); // pass the array to varargs
    }
}


import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int  n=in.nextInt();
        System.out.println("The number is:");
        do {
            System.out.print(n+" ");
            n++;
        }
        while(n<=15);
    }
}
output
1
The number is:
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 


import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        float a= in.nextFloat();
        float b= in.nextFloat();
        
        float sum = a+b;
        System.out.println(sum);
    }
}
output
89.75
45.67
135.42


import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int i=in.nextInt();
        while(i<=56){
            System.out.print(i+" ");
            i++;
        }
    }
}
output
35
35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 


import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
output
5
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 


import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String s=in.nextLine();
        System.out.println("Length: "+s.length());
        System.out.println("Uppercase: "+s.toUpperCase());
        System.out.println("Lowercase: "+s.toLowerCase());
        System.out.println("Substring(0,3): "+s.substring(0,3));
        System.out.println("CharAt(1): "+s.charAt(1));
        System.out.println("Index of t: "+s.indexOf('t'));
    }
}
output
Astuti
Length: 6
Uppercase: ASTUTI
Lowercase: astuti
Substring(0,3): Ast
CharAt(1): s
Index of t: 2


import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int[][][] arr={ {{1,2},{3,4}},{{5,6},{7,8}} };
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                for(int k=0;k<arr[i][j].length;k++){
                    System.out.print(arr[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
        
    }
}
output
1 2 
3 4 

5 6 
7 8 


import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no. of block: ");
        int n=in.nextInt();
        System.out.println("Enter no. of rows: ");
        int r=in.nextInt();
        System.out.println("Enter no. of columns: ");
        int c=in.nextInt();
        int arr[][][] = new int[n][r][c];
        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<r;j++){
                for(int k=0;k<c;k++){
                    arr[i][j][k]=in.nextInt();
                }
            }
        }
        System.out.println("3D array is: ");
        for(int i=0;i<n;i++){
            System.out.println("Block "+(i+1)+": ");
            for(int j=0;j<r;j++){
                for(int k=0;k<c;k++){
                    System.out.print(arr[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
output
Enter no. of block: 
3
Enter no. of rows: 
2
Enter no. of columns: 
2
Enter elements: 
1 2 3 5 6 7 9 80 21 34 56 67
3D array is: 
Block 1: 
1 2 
3 5 

Block 2: 
6 7 
9 80 

Block 3: 
21 34 
56 67 

class Main{
    public static void main(String args[]){
        int arr[][]=new int[3][3];
        arr[0]=new int[3];
        arr[1]=new int[2];
        arr[2]=new int[5];
        int count =1;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=count++;
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
output
1 2 3 
4 5 
6 7 8 9 10 

import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = in.nextInt();

        int arr[][] = new int[n][];

        for(int i = 0; i < n; i++) {
            System.out.print("Enter size of row " + i + ": ");
            int size = in.nextInt();
            arr[i] = new int[size];

            for(int j = 0; j < size; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        // Print
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
output
Enter number of rows: 3
Enter size of row 0: 3
1 2 3
Enter size of row 1: 2
2
56
Enter size of row 2: 5
12 45 78
7 8 
1 2 3 
2 56 
12 45 78 7 8 


import java.util.*;
class Main{
    public static void main(String args[]){
        String[] arr = {"Rohit","Anjali","Subham","Astuti"};
        Arrays.sort(arr);
        for(String s:arr){
            System.out.println(s);
        }
    }
}
output
Anjali
Astuti
Rohit
Subham


import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in  =new Scanner(System.in);
        System.out.println("Enter no. of names: ");
        int n=in.nextInt();
        in.nextLine();
        
        String arr[]=new String[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter names: "+(i+1)+": ");
            arr[i]=in.nextLine();
        }
        Arrays.sort(arr);
        System.out.println("Sorted string array is: ");
        for(String s:arr){
            System.out.println(s);
        }
    }
}
output
Enter no. of names: 
7
Enter names: 1: 
Rohit
Enter names: 2: 
Aritro
Enter names: 3: 
Spandan
Enter names: 4: 
Unmilan
Enter names: 5: 
Astuti
Enter names: 6: 
Anjali
Enter names: 7: 
Ayani
Sorted string array is: 
Anjali
Aritro
Astuti
Ayani
Rohit
Spandan
Unmilan


import java.util.*;
class Coordinate {
    int x,y;
    
    void display(){
        System.out.println("The value of x is:"+x+" and y is: "+y);
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        Coordinate c=new Coordinate();
        c.x=in.nextInt();
        c.y=in.nextInt();
        c.display();
    }
}
output
10
35
The value of x is:10 and y is: 35


import java.util.*;
class Student {
    String name;
    int roll;
    float marks;
    
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Roll: "+roll);
        System.out.println("Marks: "+marks);
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        Student s =new Student();
        s.name="Astuti";
        s.roll=15;
        s.marks=90.7f;
        
        s.display();
    }
}
output
Name: Astuti
Roll: 15
Marks: 90.7


import java.util.*;
class Coordinate{
    int x,y;
    void display(){
        System.out.println("x= "+x+" y "+y);
    }
    boolean isEqual(Coordinate c){
        return(this.x==c.x && this.y==c.y);
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        Coordinate c1=new Coordinate();
        c1.x=in.nextInt();
        c1.y=in.nextInt();
        Coordinate c2=new Coordinate();
        c2.x=in.nextInt();
        c2.y=in.nextInt();
        if(c1.isEqual(c2)){
            System.out.println("Coordinates are equal");
        }
        else 
        System.out.println("Coordinates are not equal");
    }
}
output
5
15
5
15
Coordinates are equal

import java.util.*;
class factorial{
    int fact(int n){
        if(n==0||n==1)
        return 1;
        else 
        return n*fact(n-1);
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        factorial f= new factorial();
        int n=in.nextInt();
        System.out.println("The factorial of "+n+" is: "+f.fact(n));
    }
}
output
5
The factorial of 5 is: 120

class Armstrong{
    public static void main(String args[]){
        for(int i=200;i<=400;i++){
            int n=i,sum=0;
            while(n!=0){
                int p=n%10;
                sum+=p*p*p;
                n/=10;
            }
            if(sum==i){
              System.out.println(i);  
            }
        }
    }
}
output
370
371


import java.util.*;
class ReverseArray{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n=in.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
        arr[i]=in.nextInt();
        }
        System.out.println("Reverse array is: ");
        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
output
Enter the size of an array: 
5
Enter the elements: 
1 48 5 8 45
Reverse array is: 
45 8 5 48 1 

import java.util.*;
class ReverseAndPalindrome{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String s=in.nextLine();
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        System.out.println("The reverse string is: "+rev);
        if(s.equals(rev)){
            System.out.println("Palindrome string.");
        }
        else {
            System.out.println("Not a Palindrome string.");
        }
    }
}
output
kanak
The reverse string is: kanak
Palindrome string.


import java.util.*;
class MaxAndMin{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n=in.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
        arr[i]=in.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }}
             for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Maximum is: "+max);
        System.out.println("Minimum is: "+min);
    }
}
output
Enter the size of an array: 
5
Enter the elements: 
12 34 56 8 5
Maximum is: 56
Minimum is: 5

import java.util.*;
public class characOccur {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a strings: ");
        String s=in.nextLine();
        System.out.println("Enter a character: ");
        char ch=in.next().charAt(0);
        int cnt=0;
        System.out.println("Character of index: ");
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==ch){
                System.out.print(i+" ");
                cnt++;
            }
        }
        System.out.println("\nOccurence of "+ch+" is: "+cnt);
    }
}
output
Enter a strings: 
Astuti
Enter a character: 
t
Character of index: 
2 4
Occurence of t is: 2


public class SwapString {
    public static void main(String[] args) {
        String a="Astuti";
        String b="Jyoti";
        a=a+b;
        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());
        System.out.println("a "+a);
        System.out.println("b: "+b);
        
    }
}
output
a Jyoti
b: Astuti
