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
