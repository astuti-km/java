// write a program to insert a new elements in an arrayat a given location k
import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n+1];
        System.out.println("Enter "+n+ " elements: ");
        for(int i=0;i<5;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("Enter elements to insert:");
        int p=in.nextInt();
        System.out.println("Enter 0 to "+n+ ":" );
        int k=in.nextInt();
        if(k<0||k>n){
            System.out.println("Invalid input.");
            return;
        }
        for(int i=n;i>k;i--){
            arr[i]=arr[i-1];
        }
        arr[k]=p;
        System.out.println("New array: ");
        for(int i=0;i<=n;i++){
            System.out.println(arr[i]+ " ");
        }
    }
}
output: 
5
Enter 5 elements: 
10
20
40
50
60
Enter elements to insert:
30
Enter 0 to 5:
2
New array: 
10 
20 
30 
40 
50 
60 

  //program to implements linear search
import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+ " elements:");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("Enter the elements to be found: ");
        int key=in.nextInt();
        int found=1;
        for(int i=0;i<n;i++){
        if(arr[i]==key){
            System.out.println("Elements found at index: "+i);
            found=1;
            break;
        }}
        if(found==0){
            System.out.println("Elements not found in any array.");
        }
    }
}
output: 
5
Enter 5 elements:
10
0
30
40
50
Enter the elements to be found: 
30
Elements found at index: 2
// implements to an binary search
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print("Enter element to search: ");
        int key = in.nextInt();
        int low = 0, high = n - 1;
        int found = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
             if (arr[mid] == key) {
            System.out.println("Element found at index: "+mid);
                found = 1;
                break;}
             else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }}
        if (found == 0) {
            System.out.println("Element not found in the array.");
        }}}
output 
  Enter size of array: 5
Enter 5 elements:
10
20
30
40
50
Enter element to search: 20
Element found at index: 1
  //search and after that delete this elements:
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print("Enter element to search and delete: ");
        int key = in.nextInt();
        int index = -1;
        for(int i = 0; i < n; i++) {
            if(arr[i] == key) {
                index = i;
                break;
            }}
        if(index != -1) {
            System.out.println("Element found at index: " + index);
            for(int i = index; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--;
            System.out.print("After deleting array: ");
            for(int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }}
            else {
            System.out.println("Element not found in the array.");
        }}}
    output
      Enter size of array: 5
Enter 5 elements:
10
0
20
30
40
Enter element to search and delete: 0
Element found at index: 1
After deleting array: 10 20 30 40 
