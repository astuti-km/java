import java.util.*;
class Mx{
    static int maxSubArray(int[] arr,int k){
        int res=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum==k){
                    int length=j-i+1;
                    res=Math.max(res,length);
                }
            }
        }
        return res;
    }
    public static void main(String ars[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int k=in.nextInt();
        int ans=maxSubArray(arr,k);
        System.out.println(ans);
    }
}
output
6
-5 8 -14 2 4 12
-5
5   


import java.util.HashMap;
import java.util.Map;
class Solution {
    public int longestSubarray(int[] arr, int k) {
       Map<Integer,Integer> mp=new HashMap<>();
       int res=0;
       int pref=0;
       for(int i=0;i<arr.length;i++){
           pref+=arr[i];
           if(pref==k)
           res=i+1;
           else if(mp.containsKey(pref-k))
           res=Math.max(res,i-mp.get(pref-k));
           
           if(!mp.containsKey(pref))
           mp.put(pref,i);
       }
       return res;
    }
}
