import java.util.*;
class Main{
    static int lastSecond(int[] arr){
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=n-2;i>=0;i--){
            if(arr[i]!=arr[n-1]){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int ans=lastSecond(arr);
        System.out.println(ans);
    }
}



import java.util.*;
class Main{
    static int[] Multiply(int[] arr){
        int n=arr.length;
        int[] res=new int[n];
        Arrays.fill(res,1);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j){
                    res[i]*=arr[j];
                }
            }
        }
        return res;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int[] ans=Multiply(arr);
        System.out.println(Arrays.toString(ans));
    }
}

import java.util.*;
public class Multiply {
    static int[] exceptSelfProd(int[] arr){
        int n=arr.length;
        int[] preprod=new int[n];
        int[] lastprod=new int[n];
        int[] res=new int[n];

        preprod[0]=1;
        for(int i=1;i<n;i++){
            preprod[i]=arr[i-1]*preprod[i-1];
        }
        lastprod[n-1]=1;
        for(int i=n-2;i>=0;i--){
            lastprod[i]=arr[i+1]*lastprod[i+1];
        }
        for(int i=0;i<n;i++){
            res[i]=preprod[i]*lastprod[i];
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int[] ans=exceptSelfProd(arr);
        System.out.println(Arrays.toString(ans));
    }
}
output
5
7 6 4 9 5 
[1080, 1260, 1890, 840, 1512]


import java.util.*;
class Main{
    static int equalSum(int[] arr){
        int n=arr.length;
        int[] first=new int[n];
        int[] last=new int[n];
        for(int i=0;i<n/2;i++){
            first[i]++;
        
        for(int j=n/2;j<=n;j++){
            last[j]++;
        
        if(first[i]==last[j]){
            return n/2;
        }}}
        return -1;
    }-
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        int ans=equalSum(arr);
        System.out.println(ans);
    }
}
output
7
-7 1 5 2 -4 3 0
3

import java.util.*;
class Main{
    static int[] product(int[] arr){
        int n=arr.length;
        int zero=0,index=-1,prod=1;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                zero++;
                index=i;
            }
            else prod*=arr[i];
        }
        int[] res=new int[n];
        Arrays.fill(res,0);
        for(int i=0;i<n;i++){
            if(zero==0){
            res[i]=prod/arr[i];
        }
        else if(zero==1){
            res[index]=prod;
        }
        }
        return res;
    }
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        int[] ans=product(arr);
        System.out.println(Arrays.toString(ans));
    }
}
output
5
3 2 6 10 5
[600, 900, 300, 180, 360]

class Solution {
    public static int[] productExceptSelf(int arr[]) {
        // code here
       int n=arr.length;
       int[] ascprod=new int[n];
       int[] desprod=new int[n];
       int[] res=new int[n];
       
       ascprod[0]=1;
       for(int i=1;i<n;i++){
           ascprod[i]=arr[i-1]*ascprod[i-1];
       }
       desprod[n-1]=1;
       for(int i=n-2;i>=0;i--){
           desprod[i]=arr[i+1]*desprod[i+1];
       }
       for(int i=0;i<n;i++){
           res[i]=ascprod[i]*desprod[i];
       }
       return res;
    }
}


class Solution {
    public static int[] productExceptSelf(int arr[]) {
        // code here
       int n=arr.length;
       int zero=0,prod=1,index=-1;
       for(int i=0;i<n;i++){
           if(arr[i]==0){
               zero++;
               index=i;
           }
           else 
           prod*=arr[i];
       }
       int[] res=new int[n];
       Arrays.fill(res,0);
       for(int i=0;i<n;i++){
           if(zero==0){
               res[i]=prod/arr[i];
           }
           else if (zero==1){
               res[index]=prod;
           }
       }
       return res;
    }
}


class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        // code here
        int n=arr.length;
        int[] first=new int[n];
        int[] last=new int[n];
        
        for(int i=0;i<n/2;i++){
            first[i]++;
            for(int j=n/2;j<=n;j++){
                last[j]++;
                if(first[i]==last[j])
                return n/2;
            }
        }
        return -1;
    }
}
