import java.util.*;
class prefix{
    static int findEquillibrium(int[] arr){
        for(int i=0;i<arr.length;i++){
            int leftSum=0;
            for(int j=0;j<i;j++)
                leftSum+=arr[j];
            int rightSum=0;
            for(int j=i+1;j<arr.length;j++)
                rightSum+=arr[j];
                if(leftSum==rightSum)
                return i;
        }
            return -1;
    }
    public static void main(String ars[]){
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        System.out.println("Enter "+n+" elements: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(findEquillibrium(arr));
        
    }
}

output
7
Enter 7 elements: 
12
17  4  -9  45 3 -1
-1



import java.util.*;

class soln {
    static int equilibriumPoint(int[] arr) {
        int prefSum = 0, total = 0;
        for (int ele : arr) {
            total += ele;
        }
        for (int pivot = 0; pivot < arr.length; pivot++) {
            int suffSum = total - prefSum - arr[pivot];
            if (prefSum == suffSum) {
                return pivot;
            }
            prefSum += arr[pivot];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 6, 5, 6};

        System.out.println(equilibriumPoint(arr));
    }
}




import java.util.*;

class GfG {
    static int findEquilibrium(int[] arr) {
  
        for (int i = 0; i < arr.length; ++i) {
            
            int leftSum = 0;
            for (int j = 0; j < i; j++)
                leftSum += arr[j];
            int rightSum = 0;
            for (int j = i + 1; j < arr.length; j++)
                rightSum += arr[j];
            if (leftSum == rightSum)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        System.out.println(findEquilibrium(arr));
    }
}



import java.util.*;
class subArray{
    static int longestSubArray(int[] arr,int k){
        int res=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum==k){
                    int sublen=j-i+1;
                    res=Math.max(res,sublen);
                }
            }
        }
        return res;
    }
    public static void main(String args[]){
        Scanner in =new Scanner(System.in);
       int[] arr={1,6,8,3,0,7};
       int k=15;
        System.out.println(longestSubArray(arr,k));
    }
}

output
3



import java.util.HashMap;
import java.util.Map;

class Solution {

    static int longestSubarray(int[] arr, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        int res = 0;
        int prefSum = 0;

        for (int i = 0; i < arr.length; ++i) {
            prefSum += arr[i];
            if (prefSum == k) 
                res = i + 1;
            else if (mp.containsKey(prefSum - k)) 
                res = Math.max(res, i - mp.get(prefSum - k));
            if (!mp.containsKey(prefSum))
                mp.put(prefSum, i);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, -10};
        int k = 15;
        System.out.println(longestSubarray(arr, k));
    }
}


