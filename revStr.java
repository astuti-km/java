//Reversed string_________
import java.util.*;
 class Main{
     static String reverse(String str){
         String rev="";
         for(int i=str.length()-1;i>=0;i--){
             rev+=str.charAt(i);
         }
         return rev;
     }
     public static void main(String args[]){
         Scanner in = new Scanner(System.in);
         String name=in.nextLine();
         System.out.println("Reversed string is: "+reverse(name));
     }
 }
output
Astuti
Reversed string is: itutsA
______________________________________________________________________________________________________________________________________________________________
