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
    public void sort012(int[] arr) {
        // code here
        Arrays.sort(arr);
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


// User function Template for Java

class Solution {
    public int findMin(int[] arr) {
        // complete the function here
        int minElement=arr[0];
        for(int i=0;i<arr.length;i++){
         minElement=Math.min(minElement,arr[i]);
         
        }
        return minElement;
    }
}


import java.util.*;
class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[count++]=arr[i];
                
            }}
            while(count<arr.length){
                arr[count++]=0;
            }
        
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
    int countFreq(int[] arr, int target) {
        // code here
        int s=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                s++;
            }
        }
        return s;
    }
}

class Solution {
    public boolean isSorted(int[] arr) {
        // code here
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
               return false;
            }}
                
                return true;
            
        
    }
}

