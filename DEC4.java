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
output
1 2

import java.util.*;

class numv {

    static int[] findSplit(int[] arr) {
        int[] res = new int[2];
        int n = arr.length;
        int resIdx = 0;
        int total = 0;

        for (int i = 0; i < n; i++)
            total += arr[i];

        
        if (total % 3 != 0) {
            res[0] = -1;
            res[1] = -1;
            return res;
        }
        int currSum = 0;

        for (int i = 0; i < n; i++) {
            currSum += arr[i];
            if (currSum == total / 3) {
                currSum = 0;
                res[resIdx++] = i;
                if (resIdx == 2 && i < n - 1) {
                    return res;
                }
            }
        }

        res[0] = -1;
        res[1] = -1;
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 0, 4};
        int[] res = findSplit(arr);

        System.out.println(res[0] + " " + res[1]);
    }
}


class Digits {
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
output
1

class main {
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


class Main {
    static int maxOnes(int[] arr, int k) {
        int res = 0;
        int start = 0, end = 0;
        int cnt = 0;

        while (end < arr.length) {
            if (arr[end] == 0)
                cnt++;
            while (cnt > k) {
                if (arr[start] == 0)
                    cnt--;

                start++;
            }

            res = Math.max(res, (end - start + 1));
            end++;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1};
        int k = 2;
        System.out.println(maxOnes(arr, k));
    }
}

class Main {
    static int getLastMoment(int n, int[] left, int[] right) {
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

import java.util.Arrays;
class Main {
    static int getSecondLargest(int[] arr) {
        int n = arr.length;
    
        Arrays.sort(arr);
        for (int i = n - 2; i >= 0; i--) {
        
            if (arr[i] != arr[n - 1]) {
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = { 12, 35, 1, 10, 34, 1 };
        System.out.println(getSecondLargest(arr));
    }
}

import java.util.Arrays;
class main {
    static int getSecondLargest(int[] arr) {
        int n = arr.length;

        int largest = -1, secondLargest = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest)
                largest = arr[i];
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println(getSecondLargest(arr));
    }
}

import java.util.Arrays;

class GfG {
    static int getSecondLargest(int[] arr) {
        int n = arr.length;

        int largest = -1, secondLargest = -1;

        for (int i = 0; i < n; i++) {
            if(arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println(getSecondLargest(arr));
    }
}

import java.util.Arrays;

class Main {
    static int getSecondLargest(int[] arr) {
        int n = arr.length;

        int largest = -1, secondLargest = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest)
                largest = arr[i];
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println(getSecondLargest(arr));
    }
}

import java.util.Arrays;
class Main {
    
    static void pushZerosToEnd(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0)
                temp[j++] = arr[i];
        }
        while (j < n)
            temp[j++] = 0;
        for (int i = 0; i < n; i++)
            arr[i] = temp[i];
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        pushZerosToEnd(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

import java.util.Arrays;
class Main {
   
    static void reverseArray(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        for (int i = 0; i < n; i++)
            temp[i] = arr[n - i - 1];
        for (int i = 0; i < n; i++)
            arr[i] = temp[i];
    }
    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 2, 6, 5 };

        reverseArray(arr);
  
        for (int i = 0; i < arr.length; i++) 
            System.out.print(arr[i] + " ");
    }
}

class Main {
    static void rotateArr(int[] arr, int d) {
        int n = arr.length;
        for (int i = 0; i < d; i++) {
         
            int first = arr[0];
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = first;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int d = 2;

        rotateArr(arr, d);

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}

import java.util.*;

class Main {
    static void generatePermutations(List<List<Integer>> res,
                                     int[] arr, int idx) {
        if (idx == arr.length - 1) {
            List<Integer> temp = new ArrayList<>();
            for (int x : arr) temp.add(x);
            res.add(temp);
            return;
        }
        for (int i = idx; i < arr.length; i++) {
            swap(arr, idx, i);
            generatePermutations(res, arr, idx + 1);
            swap(arr, idx, i);
        }
    }

    static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
    static void nextPermutation(int[] arr) {

        List<List<Integer>> res = new ArrayList<>();

        generatePermutations(res, arr, 0);

        Collections.sort(res, (a, b) -> {
            for (int i = 0; i < a.size(); i++) {
                if (!a.get(i).equals(b.get(i))) {
                    return a.get(i) - b.get(i);
                }
            }
            return 0;
        });
        for (int i = 0; i < res.size(); i++) {
            boolean match = true;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] != res.get(i).get(j)) {
                    match = false;
                    break;
                }
            }

            if (match) {

                // If it's not the last permutation
                if (i < res.size() - 1) {
                    for (int j = 0; j < arr.length; j++) {
                        arr[j] = res.get(i + 1).get(j);
                    }
                }
                else {
                    for (int j = 0; j < arr.length; j++) {
                        arr[j] = res.get(0).get(j);
                    }
                }

                break;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 1, 7, 5, 0};

        nextPermutation(arr);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}

import java.util.ArrayList;

class Main {

    static ArrayList<Integer> findMajority(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
           
            int cnt = 0;
            for (int j = i; j < n; j++) {
                if (arr[j] == arr[i])
                    cnt += 1;
            }
            if (cnt > (n / 3)) {
                if (res.size() == 0 || arr[i] != res.get(0)) {
                    res.add(arr[i]);
                }
            }
            if (res.size() == 2) {
                if (res.get(0) > res.get(1))
                    java.util.Collections.swap(res, 0, 1);
                break;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 1, 3, 2, 1, 1};
        ArrayList<Integer> res = findMajority(arr);
        for (int ele : res)
            System.out.print(ele + " ");
    }
}

import java.util.Arrays;

class Main {

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

import java.util.Arrays;

class Main {

    static int maxSubarraySum(int[] arr) {
        int res = arr[0];
 
        for (int i = 0; i < arr.length; i++) {
            int currSum = 0;
      
            for (int j = i; j < arr.length; j++) {
                currSum = currSum + arr[j];
             
                res = Math.max(res, currSum);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(maxSubarraySum(arr));
    }
}
