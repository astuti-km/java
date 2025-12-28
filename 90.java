class Solution {
    public static int[] productExceptSelf(int arr[]) {
        // code here
        int n=arr.length;
        int[] res=new int[n];
        for(int i=0;i<res.length;i++){
            res[i]=1;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j)
                res[i]*=arr[j];
            }
        }
        return res;
    }
}


import java.util.*;
public class exceptSelf {
    static int[] multiplyExceptSelf(int[] arr){
        int n=arr.length;
        int[] res=new int[n];
        for(int i=0;i<res.length;i++){
            res[i]=1;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j)
                    res[i]*=arr[j];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int[] result=multiplyExceptSelf(arr);
        System.out.println(Arrays.toString(result));
    }
}
output
5
9 8 7 5 4 
[1120, 1260, 1440, 2016, 2520]

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
public class lastSecond {
    static int giveSecLargest(int[] arr){
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=n-2;i>=0;i--){
            if(arr[i]!=arr[n-1]){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         int n=in.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int ans=giveSecLargest(arr);
        System.out.println(ans);
    }
}
output
5                 
123
67 89 45 90
90

