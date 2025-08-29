class voting {
    public static String canVote(int age) {
        if(age >= 18) return "Eligible to Vote";
        else return "Not Eligible";
    }
    public static void main(String[] args) {
        System.out.println(canVote(20));
    }
}
output
Eligible to Vote

class loop {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.print("Infinite Loop");
        } while(i == 1);
    }
}
output 
Infinite LoopInfinite LoopInfinite LoopInfinite LoopInfinite LoopInfinite Loop

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pos=0, neg=0, zero=0;
        char ch;
        do {
            int n = sc.nextInt();
            if(n > 0) pos++;
            else if(n < 0) neg++;
            else zero++;
            System.out.println("Do you want to continue? (y/n)");
            ch = sc.next().charAt(0);
        } while(ch == 'y' || ch == 'Y');
        
        System.out.println("Positives = " + pos);
        System.out.println("Negatives = " + neg);
        System.out.println("Zeros = " + zero);
    }
output
56
Do you want to continue? (y/n)
y
-53
Do you want to continue? (y/n)
y
0
Do you want to continue? (y/n)
n
Positives = 1
Negatives = 1
Zeros = 1

class pow {
    public static int power(int m, int n) {
        int result = 1;
        for(int i=1; i<=n; i++) {
            result *= m;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("2^5 = " + power(2,5));
    }
}
output
2^5 = 32

  //not using do_while loop
import java.util.*;
class fibonacci {
    public static void printFibo(int n) {
        int a=0, b=1;
        System.out.print(a + " " + b + " ");
        for(int i=3; i<=n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFibo(n);
    }
}
output
5
0 1 1 2 3 
