import java.util.*;
class Main{
    public static int GCM(int m,int n){
        while(n!=0){
            int temp=n;
       n=m%n;
       m=temp;
    }
        return m;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int m=in.nextInt();
        System.out.println("Enter 2nd number: ");
        int n=in.nextInt();
        int result=GCM(m,n);
        System.out.println("The greatest common divisor is: "+result);
    }
}
output
Enter 1st number: 
5
Enter 2nd number: 
9
The greatest common divisor is: 1
