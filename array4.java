// to print positve and negative no.
import java.util.*;
public class PositiveNegative {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = in.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements:");
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Positive numbers are: ");
        for(int i=0;i<n;i++){
            if(arr[i]>0){
    System.out.print(arr[i]+" \n");
            }
        }
        System.out.println("Negative numbers are: ");
        for(int i=0;i<n;i++){
            if(arr[i]<0){
    System.out.print(arr[i]+" ");
    }}
    }}
output
Enter size of array: 6
Enter 6 elements:
45
-56
54
-5
-34
765
Positive numbers are: 
45 
54 
765 
Negative numbers are: 
-56 -5 -34 

//copy one array to another
import java.util.*;
public class CopyonetoAno{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = in.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements:");
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }
       int arr2[]=new int[n];
       for(int i=0;i<n;i++){
           arr2[i]=arr[i];
       }
       
       System.out.println("After copy array to another is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr2[i]+" ");
        }
    }}
output
Enter size of array: 4
Enter 4 elements:
54
87
56
456
After copy array to another is: 
54 87 56 456 



