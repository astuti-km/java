class Solution {
    public int countTriplets(int[] arr, int target) {
        // Code Here
        int n=arr.length;
        int res=0;
        
        for(int i=0;i<n-2;i++){
            int left=i+1,right=n-1;
            
            while(left<right){
                int sum=arr[i]+arr[left]+arr[right];
                if(sum<target){
                left+=1;}
                
                else if(sum>target){
                    right-=1;
                }
                else if(sum==target){
                    int arr1=arr[left],arr2=arr[right];
                    int cnt1=0;
                    int cnt2=0;
                    while(left<=right && arr[left]==arr1){
                        left++;
                        cnt1++;
                    }
                    while(left<=right && arr[right]==arr2){
                        right--;
                        cnt2++;
                    }
                    if(arr1==arr2)
                    res+=(cnt1*(cnt1-1))/2;
                    
                    else 
                    res+=(cnt1*cnt2);
                }
            }
        }
        return res;
        
    }
}


// User function Template for Java
class Solution {
    int countPairs(int arr[], int target) {
        // Your code here
        Arrays.sort(arr);
        int left=0;
        int right=arr.length-1;
        int cnt=0;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum<target){
            cnt+=right-left;
            left++;}
            else {
                right--;
            }
        }
        
        return cnt;
    }
}



class Solution {
    public int cntSubarrays(int[] arr, int k) {
        // code here
        Map<Integer, Integer> sum = new HashMap<>();
        int res=0;int currSum=0;
        
        for(int i=0;i<arr.length;i++){
           currSum+=arr[i];
           if(currSum==k)
               res++;
           if(sum.containsKey(currSum-k))
           res+=sum.get(currSum-k);
           
           sum.put(currSum,sum.getOrDefault(currSum,0)+1);
        }
        return res;
    }
}



class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
        int res=0;
        HashMap<Integer, Integer> mp=new HashMap<>();
        int prefXOR=0;
        
        for(int val:arr){
        prefXOR^=val;
        
        res+=mp.getOrDefault(prefXOR^k,0);
        if(prefXOR==k)
            res++;
            mp.put(prefXOR,mp.getOrDefault(prefXOR,0)+1);
        }
        return res;
    }
}


import java.util.*;
class GfG {
    static int countTriplets(int[] arr, int target) {
        int n = arr.length;
        int res = 0;
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1, right = n - 1;
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if (sum < target) {
                    left += 1;
                }
                else if (sum > target) {
                    right -= 1;
                }
                else if (sum == target) {
                    int ele1 = arr[left], ele2 = arr[right];
                    int cnt1 = 0, cnt2 = 0;
                    while (left <= right && arr[left] == ele1) {
                        left++;
                        cnt1++;
                    }
                    while (left <= right && arr[right] == ele2) {
                        right--;
                        cnt2++;
                    }
                    if (ele1 == ele2)
                        res += (cnt1 * (cnt1 - 1)) / 2;
                    else
                        res += (cnt1 * cnt2);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {-3, -1, -1, 0, 1, 2};
        int target = -2;

        System.out.println(countTriplets(arr, target));
    }
}


import java.util.Arrays;
class GfG {
    static int binarySearch(int[] arr, int complement) {
        int lo = 0, hi = arr.length - 1;
        int res = arr.length;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            if (arr[mid] >= complement) {
                res = mid;
                hi = mid - 1;
            } 
          	else {
                lo = mid + 1;
            }
        }
        return res;
    }

    static int countPairs(int[] arr, int target) {
        int cnt = 0;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            int ind = binarySearch(arr, complement);
            cnt += ind;
            if (ind > i)
                cnt--;
        }
        return cnt / 2;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 8, 3, 4, 7, 6, 5 };
        int target = 7;
        System.out.println(countPairs(arr, target));
    }
}



class GfG {
    static int subarrayXor(int[] arr, int k) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            int prefXOR = 0;
            for (int j = i; j < arr.length; j++) {
                prefXOR = prefXOR ^ arr[j];

                if (prefXOR == k)
                    res++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = { 4, 2, 2, 6, 4 };
        int k = 6;
        System.out.println(subarrayXor(arr, k));
    }
}


class GfG {
    public static int cntSubarrays(int[] arr, int k) {
        int count = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int currSum = 0;
            for (int j = i; j < n; j++) {
                currSum += arr[j];
                if (currSum == k) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {10, 2, -2, -20, 10};
        int k = -10;
        System.out.println(cntSubarrays(arr, k));
    }
}
