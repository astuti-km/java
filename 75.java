import java.util.*;
public class W01_ass_1{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        if(n%2==0){
            System.out.println("Even");
        }
        else if(n%2!=0){
            System.out.println("Odd");
        }
        in.close();
    }
}

import java.util.*;
public class W01_ass_2{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        double length=in.nextDouble();
        double breadth=in.nextDouble();
        
        double area=length*breadth;
        double perimeter=2*(length+breadth);
       
        System.out.printf("Perimeter is 2*(%.1f+%.1f)=%.2f\n",length,breadth,perimeter);
        
         System.out.printf("Area is %.1f * %.1f = %.2f",length,breadth,area);
        in.close();
    }
}

import java.util.*;
public class W01_P3{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        double radius=in.nextDouble();
        double height=in.nextDouble();
        
        double volume=Math.PI*radius*radius*height;
        
        System.out.printf("Volume is %.2f",volume);
        in.close();
    }
}

import java.util.*;
public class W01_P4{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for(int i=1;i<=4;i++){
           System.out.println(+n+" * "+i+" = "+(n*i));
    }
    }
}

import java.util.*;
public class W01_P5{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        int x=in.nextInt();
        int y=in.nextInt();
        
        int quo=x/y;
        int rem=x%y;
        System.out.println("The quotient is "+quo);
        System.out.println("The remainder is "+rem);
        in.close();
    }
}


