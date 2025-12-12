class Solution {
    public int missingNumber(int[] arr) {
        // code here
        int n=arr.length;
        for(int i=0;i<n;i++){
            while(arr[i]>=1&& arr[i]<=n && arr[i]!=arr[arr[i]-1]){
                int temp=arr[i];
                arr[i]=arr[temp-1];
                arr[temp-1]=temp;
            }
        }
        for(int i=1;i<=n;i++){
            if(i!=arr[i-1])
            return i;
        }
        return n+1;
    }
}


// User function Template for Java
import java.util.*;
class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // add your code here
        int n=arr.length;
        d=d%n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
        }
        static void reverse(int arr[],int l,int r){
            while(l<r){
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++;
                r--;
            }
        }
    }


class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        
        int res=arr[0];
        
            int sum=0;
            
            for(int i=0;i<arr.length;i++){
                sum+=arr[i];
                res=Math.max(res,sum);
                if(sum<0)
                sum=0;
            }
        
        return res;
    }
}


class Solution {
    public void mergeArrays(int a[], int b[]) {
        // code here
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


class Solution {
    int search(int[] arr, int key) {
        // code here
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
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
    public int getMinDiff(int[] arr, int k) {
        // code here
        int n=arr.length;
        if(n==1)
        return 0;
        
        Arrays.sort(arr);
        int p=arr[n-1]-arr[0];
        int small,large;
        for(int i=1;i<n;i++){
            if(arr[i]-k<0)
            continue;
        
        small=Math.min(arr[0]+k,arr[i]-k);
         large=Math.max(arr[i-1]+k,arr[n-1]-k);
        p=Math.min(p,large-small);
    }
    return p;
}
}



class Solution {
    void nextPermutation(int[] arr) {
        // code here
    int n=arr.length;
    int p=-1;
    for(int i=n-2;i>=0;i--){
        if(arr[i]<arr[i+1]){
        p=i;
        break;
        }
    }
    if(p==-1){
        reverse(arr,0,n-1);
        return;
    }
    for(int i=n-1;i>p;i--){
        if(arr[i]>arr[p]){
            swap(arr,i,p);
            break;
        }
    }
    reverse(arr,p+1,n-1);
    }
    void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    void reverse(int arr[],int l,int r){
        while(l<r){
            swap(arr,l,r);
            l++;
            r--;
        }
    }
    
}
