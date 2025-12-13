
class Solution {
    public int maximumProfit(int prices[]) {
        // code here
        int n=prices.length;
        int Lmin=prices[0];
        int Lmax=prices[0];
        int res=0;
        
        int i=0;
        while(i<n-1){
            
            while(i<n-1&&prices[i]>=prices[i+1]){
                i++;
            }
            Lmin=prices[i];
            
            while(i<n-1&&prices[i]<=prices[i+1]){
                i++;
            }
            Lmax=prices[i];
            res+=(Lmax-Lmin);
        }
        return res;
    }
}


class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    return true;
                }
            }
        }
        return false;
    }
}


import java.util.*;
class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=n-2;i>=0;i--){
            if(arr[i]!=arr[n-1]){
                return arr[i];
            }
        }
        return -1;
    }
}


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


