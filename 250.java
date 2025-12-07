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



class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int n=arr.length;
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
            
        }
    }
}



public class Great{

   
    static int maxProfitRec(int[] price, int start, int end) {
        int res = 0;

       
        for (int i = start; i < end; i++) {
            for (int j = i + 1; j <= end; j++) {
               
               
                if (price[j] > price[i]) {
               
                   
                    int curr = (price[j] - price[i]) +
                               maxProfitRec(price, start, i - 1) +
                               maxProfitRec(price, j + 1, end);
                    res = Math.max(res, curr);
                }
            }
        }
        return res;
    }

    static int maxProfit(int[] prices) {
        return maxProfitRec(prices, 0, prices.length - 1);
    }

    public static void main(String[] args) {
        int[] prices = {100, 180, 260, 310, 40, 535, 695};
        System.out.println(maxProfit(prices));
    }
}




class solute {

    static int maxProfit(int[] prices) {
        int n = prices.length;
        int res = 0;

       
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                res = Math.max(res, prices[j] - prices[i]);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] prices = {7, 10, 1, 3, 6, 9, 2};
        System.out.println(maxProfit(prices));
    }
}

import java.util.Arrays;

class solution {

    static int getMinDiff(int[] arr, int k) {
        int n = arr.length;
        Arrays.sort(arr);
        int res = arr[n - 1] - arr[0];

      
        for (int i = 1; i < arr.length; i++) {

          
           
            if (arr[i] - k < 0)
                continue;

           
            int minH = Math.min(arr[0] + k, arr[i] - k);
            int maxH = Math.max(arr[i - 1] + k, arr[n - 1] - k);
            res = Math.min(res, maxH - minH);
        }
        return res;
    }

    public static void main(String[] args) {
        int k = 2;
        int[] arr = {1, 5, 8, 10};

        int ans = getMinDiff(arr, k);
        System.out.println(ans);
    }
}



class soln {
   
    static int findSum(int[] arr, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) 
            sum += arr[i];
        return sum;
    }

    static int[] findSplit(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {

            for (int j = i + 1; j < n - 1; j++) {

                int sum1 = findSum(arr, 0, i);
                int sum2 = findSum(arr, i + 1, j);
                int sum3 = findSum(arr, j + 1, n - 1);

                
                if (sum1 == sum2 && sum2 == sum3)
                    return new int[]{i, j};
            }
        }

        
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 0, 4};
        int[] res = findSplit(arr);

        System.out.println(res[0] + " " + res[1]);
    }
}



class GfG {
    static int singleDigit(int n) {
        int sum = 0;

       
        while (n > 0 || sum > 9) {

            if (n == 0) {
                n = sum;
                sum = 0;
            }

            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 1234;
        System.out.println(singleDigit(n));
    }
}

class soln {
    static int maxOnes(int[] arr, int k) {
        int res = 0;
       
        for(int i = 0; i < arr.length; i++) {
           
            int cnt = 0;
            for(int j = i; j < arr.length; j++) {
                if(arr[j] == 0)
                    cnt++;
            
                if(cnt <= k)
                    res = Math.max(res, (j - i + 1));
            }
        }
        
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1};
        int k = 2;
        System.out.println(maxOnes(arr, k));
    }
}

class norm {
    static int getLastMoment(int n, int[] left, 
                             			int[] right) {
        int res = 0;

       
        for (int i = 0; i < left.length; i++) {
            res = Math.max(res, left[i]);
        }

        
        for (int i = 0; i < right.length; i++) {
            res = Math.max(res, n - right[i]);
        }

       
        return res;
    }

    public static void main(String[] args) {
        int n = 4;
        int[] left = {2};
        int[] right = {0, 1, 3};
        System.out.println(getLastMoment(n, left, right));
    }
}
