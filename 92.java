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

