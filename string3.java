public class Stringbui {
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder("A");
        sb.append("s");
        sb.append("t");
        sb.append("u");
        sb.append("t");
        sb.append("i");
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
output
Astuti
6
import java.util.*;
public class revString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name=in.next();
        StringBuilder sb=new StringBuilder(name);
        for(int i=0;i<sb.length()/2;i++){
        int front =i;
        int back=sb.length()-i-1;
        char frontChar=sb.charAt(front);
        char backChar=sb.charAt(back);
        sb.setCharAt(front,backChar);
        sb.setCharAt(back,frontChar);
    }
    System.out.println(sb);
}
}
output
astuti
itutsa

public class Stringbui {
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder("Astuti");
        System.out.println(sb);
        System.out.println(sb.charAt(0));
        
        sb.insert(2,'h');
        System.out.println(sb);
       // sb.setCharAt(0,'p');
        //System.out.println(sb);
        sb.delete(3,4);
        System.out.println(sb);
        
    }
}
output
Astuti
A
Ashtuti
Ashuti

import java.util.*;
public class String1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name=in.nextLine();
            System.out.println("My name is: "+name);
            //Concatenation
            String name1=in.nextLine();
             String name2=in.nextLine();
             String concat=name1+"@"+name2;
             System.out.println(concat);
             //length
             System.out.println(concat.length());
             //charAt
             for(int i=0;i<concat.length();i++){
             System.out.println(concat.charAt(i));
         }
            String sent="My name is Astuti";
            String n=sent.substring(11,sent.length());
            System.out.println(n);
            String num="123";
            int number=Integer.parseInt(num);
            System.out.println(number);
            int p=456;
            String pri=Integer.toString(p);
            System.out.println(pri.length());
    }
}
output
Astuti kumari
My name is: Astuti kumari
ram
ram
ram@ram
7
r
a
m
@
r
a
m
Astuti
123
3

import java.util.*;
public class str1 {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       String name=in.nextLine();
       System.out.println("My name is: "+name);
   } 
}
output
Astuti kumari
My name is: Astuti kumari

import java.util.*;
public class str1 {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       String name=in.nextLine();
       char[] str=name.toCharArray();
       for(int i=0;i<name.length()/2;i++){
        int start =i;
        int end=name.length()-i-1;
        char temp=str[start];
        str[start]=str[end];
        str[end]=temp;}
        System.out.println(new String(str));
   }
}
        output
Arman
namrA

import java.util.*;
public class str1 {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       String name=in.nextLine();
       String org=name;
       char[] str=name.toCharArray();
       for(int i=0;i<name.length()/2;i++){
        int start =i;
        int end=name.length()-i-1;
        char temp=str[start];
        str[start]=str[end];
        str[end]=temp;}
       if(org.equalsIgnoreCase(new String(str))){
           System.out.println("Paindrome");
       }
       else {
           System.out.println("Not palindrome.");
       }
   }
}
        output
kanak
Paindrome

import java.util.*;
public class str1 {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       String name=in.nextLine();
     System.out.println("The length of the string is: "+name.length());
   }
}
        output
plaza
The length of the string is: 5

import java.util.*;
public class str4 {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       String name=in.nextLine();
     String copyName=name;
     System.out.println("After copying one string into another string is: "+copyName);
   }
}
output
paaro
After copying one string into another string is: paaro

import java.util.*;
public class str5 {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       String name=in.nextLine();
     String intro=in.nextLine();
     //to concatenate two string
     String concat=name+intro;
     System.out.println(concat);
     // to compare two string
     if(name.equals(intro)){
         System.out.println("These are same string");
     }
     else{
         System.out.println("These are not the same string.");
         
     }
   }
}
       output
Astu 
sawa
Astusawa
These are not the same string.

