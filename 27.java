//marks
import java.util.*;
public class doWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do { 
            int n= sc.nextInt();
            if(n>=90){
                System.out.println("This is good.");}
                else if (n>=60 && n<=89) {
                    System.out.println("This is also good.");
                }
                else if(n>=0 && n<=59) {
                    System.out.println("This is good as well.");
                } else {
                    System.out.println("Invalid");
                }
                

           System.out.println("Want to continue ? (yes(1) or no(0))");
            num = sc.nextInt();

            }
            while(num==1);
        }}
output
55
This is good as well.
Want to continue ? (yes(1) or no(0))
1
67
This is also good.
Want to continue ? (yes(1) or no(0))
0

  //for loop
public class Main{
    public static void main(String args[]){
        int n=25;
        for(int i=0;i<n;i++){
            System.out.print(i+" ");
        }
    }
}
output
  0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 

 // while loop
  public class Main{
    public static void main(String args[]){
        int n=0;
        while(n<20){
            System.out.print(n+" ");
            n++;
        }
    }
}
output
  0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 

  //do while loop
  public class Main{
    public static void main(String args[]){
        int n=0;
        do{
            System.out.print(n+" ");
            n++;
        }
        while(n<=20);
}}
output
  0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 

  //sum upto n
  public class Main{
    public static void main(String args[]){
        int n=3;
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;}
            System.out.println(sum);
    }
        }
output
  6

