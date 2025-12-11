class Solution {
    int maxProduct(int[] arr) {
        // code here
        int n=arr.length;
        int maxProd=arr[0];
        int curMax=arr[0];
        int curMin=arr[0];
        for(int i=1;i<n;i++){
            int c=arr[i];
            if(c<0){
                int temp=curMax;
                curMax=curMin;
                curMin=temp;
            }
            curMax=Math.max(c,curMax*c);
            curMin=Math.min(c,curMin*c);
            maxProd=Math.max(maxProd,curMax);
        }
        return maxProd;
    }
}

class Solution {
    void nextPermutation(int[] arr) {
        int n = arr.length;
        int p = -1;

       
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                p = i;
                break;
            }
        }

       
        if (p == -1) {
            reverse(arr, 0, n - 1);
            return;
        }

      
        for (int i = n - 1; i > p; i--) {
            if (arr[i] > arr[p]) {
                swap(arr, i, p);
                break;
            }
        }
        reverse(arr, p + 1, n - 1);
    }
    void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

   
    void reverse(int[] arr, int l, int r) {
        while (l < r) {
            swap(arr, l, r);
            l++;
            r--;
        }
    }
}


class Solution {
    public int maxCircularSum(int arr[]) {

        int totalSum = 0;
        int curMaxSum = 0, curMinSum = 0;
        int maxSum = arr[0], minSum = arr[0];

        for (int i = 0; i < arr.length; i++) {

            curMaxSum = Math.max(curMaxSum + arr[i], arr[i]);
            maxSum = Math.max(maxSum, curMaxSum);

          
            curMinSum = Math.min(curMinSum + arr[i], arr[i]);
            minSum = Math.min(minSum, curMinSum);

            totalSum += arr[i];
        }

        if (minSum == totalSum)
            return maxSum;

        int circularSum = totalSum - minSum;

        return Math.max(maxSum, circularSum);
    }
}


class Solution {
    public static boolean areAnagrams(String s1, String s2) {

        if (s1.length() != s2.length())
            return false;

        int freq[] = new int[256];  

        for (int i = 0; i < s1.length(); i++) {
            freq[(int)s1.charAt(i)]++;   
            freq[(int)s2.charAt(i)]--;   
        }

        for (int x : freq) {
            if (x != 0)
                return false;    
        }

        return true;
    }
}


class Solution {
    public int maxCircularSum(int arr[]) {
        
        int totalSum=0;
        int curMaxSum=0,curMinSum=0;
        int maxSum=arr[0],minSum=arr[0];
        for(int i=0;i<arr.length;i++){
            curMaxSum=Math.max(curMaxSum+arr[i],arr[i]);
            maxSum=Math.max(maxSum,curMaxSum);
            
            curMinSum=Math.min(curMinSum+arr[i],arr[i]);
            minSum=Math.min(minSum,curMinSum);
            
            totalSum+=arr[i];
        }
        int normalSum=maxSum;
        int circularSum=totalSum-minSum;
        if(minSum==totalSum)
        return normalSum;
        
        return Math.max(normalSum,circularSum);
    }
}

class Solution {
    public void mergeArrays(int a[], int b[]) {
       
        int i=a.length-1,j=0;
        while(i>=0  && j<b.length){
            if(a[i]<=b[j]){
                break;
            }
            
                int temp=a[i];
                a[i]=b[j];
                b[j]=temp;
                i--;
                j++;
            
        }
        Arrays.sort(a);
        Arrays.sort(b);
    }
}
