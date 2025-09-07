public class BubbleSort {
    static void bubbleSort(int[] arr, int n) {
        if(n==1){
            return;
        }
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        bubbleSort(arr, n - 1);
    }
    static void printedArray(int[] arr,int n){
       // System.out.println("Printed array: ");
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void main(String[] args) {
     int arr[] = {64, 34, 25, 12, 22, 11, 90};
     int n=arr.length;
        System.out.print("Printed array: ");
        printedArray(arr,n);
        bubbleSort(arr,n);
        System.out.println("Sorted array: ");
        printedArray(arr,n);
    }
}
output
  Printed array: 64 34 25 12 22 11 90 
Sorted array: 
11 12 22 25 34 64 90 

  public class InsertionSort {
    static void insertionSort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }}
    static void printedArray(int[] arr,int n){
       // System.out.println("Printed array: ");
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void main(String[] args) {
     int arr[] = {64, 34, 25, 12, 22, 11, 90};
     int n=arr.length;
        System.out.println("Printed array: ");
        printedArray(arr,n);
        insertionSort(arr,n);
        System.out.println("Sorted array: ");
        printedArray(arr,n);
    }
}
output
  Printed array: 
64 34 25 12 22 11 90 
Sorted array: 
11 12 22 25 34 64 90 
