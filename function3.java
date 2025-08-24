//Write a function which takes in 2 numbers and returns the greater of those two.
import java.util.*;
class Main{
    public static int checkGreater(int a,int b){
        if(a>b){
            
            return a;
        }
        else {
           
            return b;
        }
    }
    public static void main(String args[]){
        Scanner in =new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
     int result= checkGreater(a,b);
     System.out.println("The greater number is: "+result);
    }
}
output
  65
34
The greater number is: 65
  
//Write a function to print the sum of all odd numbers from 1 to n.
  import java.util.*;
class Mian{
    public static int sumOdd(int n ){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum+=i;}}
                return sum;
        }
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            int result =sumOdd(n);
            System.out.println("The sum of odd number is: "+result);
            
        }
    }
output
  13
The sum of odd number is: 49

  
