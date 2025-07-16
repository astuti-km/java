//alphabet is vowel or constant: 
import java.util.*;
public class VowelConsonant {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        char ch = in.charAt();

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");

    }
}
output
p
p is consonant
------------------------------------------------------------------------------------------------------------------------------------------------
public class VowelConstant {

    public static void main(String[] args) {

        char ch = 'a';

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");
        }
    }
}
output
a is vowel
-----------------------------------------------------------------------------------------------------------------------------------------------------
//To print the largest
class Largest {

    public static void main(String[] args) {

        double n1 = -14.5, n2 = 123.9, n3 = 200.5;

        if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number.");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the largest number.");

        else
            System.out.println(n3 + " is the largest number.");
    }
}
output
200.5 is the largest number.
---------------------------------------------------------------------------------------------------------------------------------------------------
//to check leap year
class Main{
    public static void main(String args[]){
        int n=2012;
        if((n%4==0 && n%100!=0)||(n%400==0)){
            System.out.println(+n+" is leap year.");
        }
        else {
            System.out.println(+n+ " is not leap year");
        }
    }
}
output: 
2012 is leap year.
------------------------------------------------------------------------------------------------------------------------------------------------
import java.util.*;
class PositiveNegative {
public static void main(String args[]){
    Scanner in =  new Scanner(System.in);
    int n=in.nextInt();
    if(n<0){
        System.out.println(+n+" is negative.");
    }
    else if(n>=0) {
        System.out.println(+n+" is positive.");
    }
}
}    
output: 
-154
-154 is negative.
