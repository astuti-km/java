class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
         HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            
            if (map.containsKey(nums[i])) {
                if (i - map.get(nums[i]) <= k) {
                    return true;
                }
            }
            
            map.put(nums[i], i);
        }
        
        return false;
    }
}

class Merge {

    static void merge(int arr[], int l, int mid, int r) {
        int i = l, j = mid + 1, k = 0;
        int temp[] = new int[100];

        while (i <= mid && j <= r) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= r) {
            temp[k++] = arr[j++];
        }

        for (i = l, k = 0; i <= r; i++, k++) {
            arr[i] = temp[k];
        }
    }

    static void mergeSort(int arr[], int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;

            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }
    }

    public static void main(String args[]) {

        int arr[] = {6, 3, 9, 5, 1, 2};
        int n = arr.length;

        mergeSort(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}
