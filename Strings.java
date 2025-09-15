import java.util.*;
public class Strings {
   public static void main(String args[]) {
       Scanner in = new Scanner(System.in);
       String name1 = in.next();
       String name2 = in.next();


       if(name1.equals(name2)) {
           System.out.println("They are the same string");
       } else {
           System.out.println("They are different strings");
       }
       if(name1 == name2) {
           System.out.println("They are the same string");
       } else {
           System.out.println("They are different strings");
       }
       if(new String(name1) == new String(name2)) {
           System.out.println("They are the same string");
       } else {
           System.out.println("They are different strings");
       }
      
   }
}
output
Astuti
Jyoti
They are different strings
They are different strings
They are different strings

import java.util.*;
public class Strings {
   public static void main(String args[]) {
     Scanner sc = new Scanner (System.in);
     int size = sc.nextInt();
     String array[] = new String[size];
     int totLength = 0;

     for(int i=0; i<size; i++) {
       array[i] = sc.next();
       totLength += array[i].length();
     }
     System.out.println(totLength);
   }
}
output
1
abcdefghijklmnopqrstuvwxyz
26
