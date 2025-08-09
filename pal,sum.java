import java.util.*;
class palindrome{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int palindrome=n;
        int rev=0;
        while(n>0){
            int p=n%10;
            rev=rev*10+p;
            n/=10;
        }
        if(palindrome==rev){
            System.out.println(+rev+" is palindrome.");
        }
        else {
            System.out.println(+rev+" is not palindrome." );
            
        }
    }
}
output
5335
5335 is palindrome.

import java.util.*;
public class sumOfDigit {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int sum=0;
        while(n>0){
            int p=n%10;
            sum+=p;
            n/=10;
        }
            System.out.println("The sum of digit is: "+sum);
        }
    }
output
  5678
The sum of digit is: 26

  
