import java.util.*;

class MergeSort {

    static void merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j])
                arr[k++] = L[i++];
            else
                arr[k++] = R[j++];
        }

        while (i < n1)
            arr[k++] = L[i++];

        while (j < n2)
            arr[k++] = R[j++];
    }

    static void mergeSort(int arr[], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        mergeSort(arr, 0, n - 1);

        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
 #pseudocode 
MERGE-SORT(arr, left, right)
IF left < right
    mid = (left + right) / 2
    MERGE-SORT(arr, left, mid)
    MERGE-SORT(arr, mid+1, right)
    MERGE(arr, left, mid, right)
END IF
#flowchart 
Start
 ↓
Read array
 ↓
Is left < right?
 ├─ No → Stop
 └─ Yes
      ↓
   Find mid
      ↓
   Divide array
      ↓
   Sort left part
      ↓
   Sort right part
      ↓
   Merge both parts
      ↓
    End


import java.util.*;

class QuickSort {

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        quickSort(arr, 0, n - 1);

        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
#pseudocode 
QUICK-SORT(arr, low, high)
IF low < high
    pivot = PARTITION(arr, low, high)
    QUICK-SORT(arr, low, pivot-1)
    QUICK-SORT(arr, pivot+1, high)
END IF
#flowchart
Start
 ↓
Read array
 ↓
Choose pivot
 ↓
Partition array
 ↓
Is low < high?
 ├─ No → Stop
 └─ Yes
      ↓
   Sort left sub-array
      ↓
   Sort right sub-array
      ↓
    End
