import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter "+n+" elements: ");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();}
       System.out.println("Enter the elements to be found: ");
       int k=in.nextInt();
       for(int i=0;i<n;i++){
          if(arr[i]==k){
           System.out.println("Elements "+k+" is found at "+(i)+" position");
          }}
    }}
output
5
Enter 5 elements: 
1
3
5
6
8
Enter the elements to be found: 
1
Elements 1 is found at 0 position

import java.util.*;
public class ass1_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m=in.nextInt();
        int n=in.nextInt();
        int p=m/n;
        int r=m%n;
        System.out.println("The quotient is: "+p+"\n The remainder is: "+r);
    }
}
output
16
5
The quotient is: 3
 The remainder is: 1

import java.util.*;
public class ass1_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m=in.nextInt();
       // int n=in.nextInt();
        int p=m/10;
        int r=m%10;
        System.out.println("1st no.= "+p+"\n 2nd no. is "+r);
    }
}
output
764
1st no.= 76
 2nd no. is 4

import java.util.*;
public class ass1_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m=in.nextInt();
        int n=in.nextInt();
        int p=m*10+n;
        
        System.out.println("The value is: "+p);
}
output
689
4
The value is: 6894


}
