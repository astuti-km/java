import java.util.*;
class array{
    public static int arryPrint(int n,int arr[]){
        int result= 0;
        for(int i=0;i<n;i++){
           result +=arr[i];
        }
        return result;
    }
        public static void main(String args[]){
            Scanner in = new Scanner(System.in);
            int n=in.nextInt();
            int arr[]=new int[n];
                System.out.print("Enter "+n+" elements:");
                for(int i=0;i<n;i++){
                 arr[i]=in.nextInt();
                }
                  System.out.print("The sum of array is: "+arryPrint(n,arr));
        }}
               output
5
Enter 5 elements:11
15
18
20
25
The sum of array is: 89

  class array {
    public static void main(String args[]) {
        int arr[] = new int[6];
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 15;
        arr[3] = 20;
        arr[4] = 25;
        arr[5] = 30;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + " is: " + arr[i]);
        }
    }
}
output
  Element at index 0 is: 5
Element at index 1 is: 10
Element at index 2 is: 15
Element at index 3 is: 20
Element at index 4 is: 25
Element at index 5 is: 30

  import java.util.*;

class array {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter "+n+" elements:");
                for(int i=0;i<n;i++){
                 arr[i]=in.nextInt();
                }
        
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]-5;
        

        
        //for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + " is: " + arr[i]);
       // }
        }
    }
}
output
  5
Enter 5 elements:5
10
15
20
25
Element at index 0 is: 0
Element at index 1 is: 5
Element at index 2 is: 10
Element at index 3 is: 15
Element at index 4 is: 20

  import java.util.*;
public class array1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter "+n+" elements: ");
        for(int i=0;i<n;i++){
             arr[i]=in.nextInt();

        }
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]*arr[i];
    
        }
        for(int i=0;i<n;i++)
        System.out.println("The square of index "+i+" is: "+arr[i]);
    }}
output
  5
Enter 5 elements: 
10
20
30
40
50
The square of index 0 is: 100
The square of index 1 is: 400
The square of index 2 is: 900
The square of index 3 is: 1600
The square of index 4 is: 2500
  
