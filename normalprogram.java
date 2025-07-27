//Program to Find ASCII Value of a character
import java.util.*;
public class Ascii{
    public static void main(String a[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char  ch =in.next().charAt(0);
        int ascii=(int) ch;
        System.out.println("The ASCII value of "+ch+" is: "+ascii);
    }
}
output 
Enter a character: A
The ASCII value of A is: 65

//to Compute Quotient and Remainder
import java.util.*;
public class QutRem {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter Dividend: ");
        int dividend = reader.nextInt();
        System.out.println("Enter divisor: ");
        int divisor = reader.nextInt();
        int quotient = dividend/divisor;
        int remainder = dividend%divisor;
        System.out.println("The quotient is: "+quotient);
        System.out.println("The remainder is: "+remainder);
    }
}
output 
Enter Dividend: 
55
Enter divisor: 
6
The quotient is: 9
The remainder is: 1

 // Program to Swap Two Number
  import java.util.*;
public class swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int x=in.nextInt();
        System.out.print("Enter 2nd number: ");
        int y=in.nextInt();
        System.out.println("--Before swap--");
        System.out.println("First number = " + x);
        System.out.println("Second number = " + y);
        int tem=x;
        x=y;
        y=tem;
        System.out.println("--After swap--");
        System.out.println("First number = " + x);
        System.out.println("Second number = " + y);
    }
}
output
  Enter 1st number: 55
Enter 2nd number: 77
--Before swap--
First number = 55
Second number = 77
--After swap--
First number = 77
Second number = 55

  //Check whether a number is even or odd using if...else statement
  import java.util.*;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner evenodd = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=evenodd.nextInt();
        if(num%2==0){
            System.out.println(+num+" is even.");
        }
        else {
            System.out.println(+num+" is odd.");
        }
    }
}
output 
  Enter a number: 
46
46 is even.

  //to Check Whether an Alphabet is Vowel or Consonant
  import java.util.*;
public class Vowel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch=in.next().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            System.out.println(" vowel is: "+ch);
        }
        else {
            System.out.println("Consonantis: "+ch);
        }
    }
}
output 
  Enter a character: 
w
Consonantis: w
