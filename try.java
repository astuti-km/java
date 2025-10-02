public class Array1{
    public static void main(String args[]){
      int  arr[]={1,2,3,4,5};
      System.out.println("The array is:" );
      for(int i=0;i<arr.length;i++){
          System.out.print(arr[i]+" ");}
          System.out.println();
      
      int max=arr[0];
      System.out.println("The max. element is: ");
      for(int i=0;i<arr.length;i++){
          if(arr[i]>max)
          max=arr[i];
      }
      System.out.println(max);
      int min=arr[0];
      for(int i=0;i<arr.length;i++){
          if(arr[i]<min)
          min=arr[i];
      }
      System.out.println("The min. elements is: " +min);
      int sum=0;
      for(int i=0;i<arr.length;i++){
          sum+=arr[i];
      }
      System.out.println("The sum of the array is: "+sum);
      double avg=(double)sum/arr.length;
      System.out.println("The avg of the array is: "+avg);
      int key=3,found=0;
      for(int i=0;i<arr.length;i++){
         if(key==arr[i])
         found=i;}
      System.out.println("Elements found at position: "+found);

    }
}
output
The array is:
1 2 3 4 5 
The max. element is: 
5
The min. elements is: 1
The sum of the array is: 15
The avg of the array is: 3.0
Elements found at position: 2

import java.util.*;
public class sam1{
    public static void main(String args[]){
       Scanner in = new Scanner(System.in);
       String st=in.nextLine();
       System.out.println("String is: "+st);
       int num=153;
       int orgi=num;
       int sum=0;
       while(num>0){
           int p=num%10;
           sum+=p*p*p;
           num/=10;
       }
       if(orgi==sum){
           System.out.println(+sum+" is armstrong.");
       }
       else {
           System.out.println(+sum+" is not armstrong.");
       }
       String name="Alaha";
       String rev="";
       for(int i=name.length()-1;i>=0;i--){
           rev=rev+name.charAt(i);
       }
       System.out.println("After reversing the string: "+rev);
       int arr[]={12,5,78,67,54,69};
       System.out.print("After reversing the array: ");
       for(int i=arr.length-1;i>=0;i--){
           System.out.print(arr[i]+" ");}
           System.out.println();
           int n=12356;
           int reverse=0;
           while(n>0){
               int p=n%10;
               reverse=reverse*10+p;
               n/=10;
           }
           System.out.println("The reverse number is: "+reverse);
       }
    }
           
               
     output
Ritika
String is: Ritika
153 is armstrong.
After reversing the string: ahalA
After reversing the array: 69 54 67 78 5 12 
The reverse number is: 65321


public class AllSorts {
    // Bubble Sort
    static void bubbleSort(int arr[]) {
        for(int i=0; i<arr.length-1; i++) {
            for(int j=0; j<arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    // Selection Sort
    static void selectionSort(int arr[]) {
        for(int i=0; i<arr.length-1; i++) {
            int minIndex = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    // Insertion Sort 
    static void insertionSort(int arr[]) {
        for(int i=1; i<arr.length; i++) {
            int key = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    // Merge Sort 
    static void merge(int arr[], int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for(int i=0; i<n1; i++) L[i] = arr[left+i];
        for(int j=0; j<n2; j++) R[j] = arr[mid+1+j];

        int i=0, j=0, k=left;
        while(i<n1 && j<n2) {
            if(L[i] <= R[j]) arr[k++] = L[i++];
            else arr[k++] = R[j++];
        }
        while(i<n1) arr[k++] = L[i++];
        while(j<n2) arr[k++] = R[j++];
    }

    static void mergeSort(int arr[], int left, int right) {
        if(left < right) {
            int mid = (left+right)/2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);
            merge(arr, left, mid, right);
        }
    }
    // Print Array 
    static void printArray(int arr[]) {
        for(int x: arr) System.out.print(x+" ");
        System.out.println();
    }
    //  Main 
    public static void main(String[] args) {
        int arr1[] = {64, 25, 12, 22, 11};
        int arr2[] = arr1.clone();
        int arr3[] = arr1.clone();
        int arr4[] = arr1.clone();

        System.out.println("Original Array:");
        printArray(arr1);

        bubbleSort(arr1);
        System.out.println("Bubble Sort:");
        printArray(arr1);

        selectionSort(arr2);
        System.out.println("Selection Sort:");
        printArray(arr2);

        insertionSort(arr3);
        System.out.println("Insertion Sort:");
        printArray(arr3);

        mergeSort(arr4, 0, arr4.length-1);
        System.out.println("Merge Sort:");
        printArray(arr4);
    }
}
output
Original Array:
64 25 12 22 11 
Bubble Sort:
11 12 22 25 64 
Selection Sort:
11 12 22 25 64 
Insertion Sort:
11 12 22 25 64 
Merge Sort:
11 12 22 25 64 
