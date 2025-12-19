import java.util.*;
public class NestedSwitch {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int empID=in.nextInt();
      String dept=in.nextLine();
      switch(empID){
        case 1: System.out.println("Astuti kumari"); break;
        case 2: System.out.println("Rajeet ash"); break;
        case 3: System.out.println("Emply number=3");
    switch(dept){
        case "IT":
            System.out.println("IT Department");
            break;
            case "Management":
                System.out.println("Management Department");
                break;
                default:
                    System.out.println("No department entered");
    }
    break;
    default:
        System.out.println("Enter correct empId");

        }

      }

    }



import java.util.*;
public class Switchstatement {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String fruit=in.next();
        switch(fruit){
            case "Apple"->System.out.println("sweet red "); 
            case "Mango"-> System.out.println("king of the fruits.");
            case "Grapes"->System.out.println("small fruit.");
            case "Oranges"-> System.out.println("Round fruit.");
            default-> System.out.println("please enter a valid fruits name.");
        }
    }
}


import java.util.*;
public class Calculator {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int ans=0;
       while (true) { 
           System.out.print("Enter the operator ");
           char op=in.next().trim().charAt(0);
            System.out.println();
            if(op=='+' || op=='-' || op=='*' || op=='/'  || op=='%'){
                System.out.println("Enter two numbers: ");
                int a=in.nextInt();
                int b=in.nextInt();
                if(op=='+'){
                    ans=a+b;
                }
                if(op=='-'){
                    ans=a-b;
                }
                if(op=='*'){
                    ans=a*b;
                }
                if(op=='/'){
                    if(b!=0)
                    ans=a/b;
                }
                if(op=='%'){
                    ans=a%b;
                }
            }
            else if(op=='x'||op=='X'){
                break;
            }
            else {
                System.out.println("Invalid operator");
            }
       
    System.out.println(ans);
        }
    }
   } 



public class reversing {
    public static void main(String[] args) {
        int n=23597;
        int rev=0;
        while(n>0){
            int p=n%10;
            rev=rev*10+p;
            n=n/10;
        }
        System.out.println("Reverse: " +rev);
    }
}



public class count {
    public static void main(String[] args) {
        int n=1385757879;
        int cnt=0;
        while(n>0){
            int rem=n%10;
            if(rem==7){
                cnt++;
            }
            n=n/10;
        }
        System.out.println(cnt);
    }
}


import java.util.*;
public class fibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int a=0;
        int b=1;
        int count=2;
        while(count<=7){
            int temp=b;
            b=b+a;
            a=temp;
            count++;
        }
        System.out.print(b);
    }
}


import java.util.*;
public class loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for(int num=1;num<=n;num++){
            System.out.println(num);
        }

    }
}
