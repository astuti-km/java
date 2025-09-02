//Sum of Array Elements
import java.util.*;
public class SumArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = in.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements:");
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += arr[i];
        }
        System.out.println("Sum of array elements = " + sum);
    }
}
output
Enter size of array: 5
Enter 5 elements:
12
19
56
45
33
Sum of array elements = 165

//Average of Array Elements
import java.util.*;

public class AverageArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements:");
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += arr[i];
        }
        double avg = (double)sum / n;
        System.out.println("Average of array elements = " + avg);
    }
}
output
5
Enter 5 elements:
12
56
67
89
43
Average of array elements = 53.4

//Count Even and Odd Numbers
import java.util.*;
public class CountEvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = in.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements:");
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }
        int even = 0, odd = 0;
        for(int i=0; i<n; i++){
            if(arr[i] % 2 == 0)
            even++;
            else 
            odd++;
        }
        System.out.println("Even numbers count = " + even);
        System.out.println("Odd numbers count = " + odd);
    }
}
output
Enter size of array: 5
Enter 5 elements:
56
45
78
43
98
Even numbers count = 3
Odd numbers count = 2

//Reverse Array Print
import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = in.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements:");
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Array in reverse order:");
        for(int i=n-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}
output
Enter size of array: 5
Enter 5 elements:
56
44
67
90
31
Array in reverse order:
31 90 67 44 56 

//Search Element in Array
import java.util.*;
public class searchArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = in.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements:");
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }
        System.out.print("Enter element to search: ");
        int x = in.nextInt();
        boolean found = false;
        for(int i=0; i<n; i++){
            if(arr[i] == x){
                System.out.println(x + " found at index " + i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println(x + " not found in array.");
        }
    }
}
output
Enter size of array: 5
Enter 5 elements:
78
99
556
354
467
Enter element to search: 556
556 found at index 2

//secondLargest elements.
import java.util.*;
public class SecondLargest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = in.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements:");
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i] > largest){
                second = largest;
                largest = arr[i];
            } else if(arr[i] > second && arr[i] != largest){
                second = arr[i];
            }
        }
        if(second == Integer.MIN_VALUE){
            System.out.println("No second largest element (all elements same)");
        } else {
            System.out.println("Second largest element = " + second);
        }
    }
}
output
Enter size of array: 5
Enter 5 elements:
565
34
768
736
675
Second largest element = 736
