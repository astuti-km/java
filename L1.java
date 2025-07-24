import java.util.Scanner;

public class Pas{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
output
5
* * * * *
* * * *
* * * 
* *
*

import java.util.Scanner;
public class Sum{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
   int n = in.nextInt();
    int p=in.nextInt();
    int sum=n+p;
    System.out.println(sum);

    }
  }
output
5
7
12

import java.util.*;
public class Type{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r=in.nextInt();
        float circle = 3.14f*r*r;
        System.out.println("The area of circle is: "+circle);
    }
}
output
5
The area of circle is: 78.5

import java.util.Scanner;
public class pa{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
output
5
* 
* * 
* * * 
* * * * 
* * * * * 
