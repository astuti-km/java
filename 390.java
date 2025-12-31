import java.util.*;
class SL{
    static int secLargest(int[] arr){
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=n-2;i>=0;i--){
            if(arr[i]!=arr[n-1]){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int secLar=secLargest(arr);
        System.out.println(secLar);
    }
}
output
9
1 2 34 67 89 90 90 45 56
89


import java.util.*;
class Solution {
    public int getSecondLargest(int[] arr) {
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=n-2;i>=0;i--){
            if(arr[i]!=arr[n-1]){
                return arr[i];
            }
        }
        return -1;
    }

import java.util.*;
class ZeroLast{
    static void zeroEnd(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[count++]=arr[i];
            }
        }
        while(count<arr.length){
            arr[count++]=0;
        }
      
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        zeroEnd(arr);
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
    }
}
output
7
1 0 23 0 5 0 7
1 23 5 7 0 0 0 


import java.util.*;
class Solution {
    void pushZerosToEnd(int[] arr) {
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
public class rev {
   static void reverse(int[] arr){
    int n=arr.length;
   for(int i=0;i<n/2;i++){
    int temp=arr[i];
    arr[i]=arr[n-i-1];
    arr[n-i-1]=temp;
   }
   } 
   public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        reverse(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
}
}
output
6
1 4 5 3 9 2
2 9 3 5 4 1 


class Solution {
    public void reverseArray(int arr[]) {
        int n=arr.length;
 for(int i=0;i<n/2;i++){
     int temp=arr[i];
     arr[i]=arr[n-i-1];
     arr[n-i-1]=temp;
 }
    }
}

import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int key;
        System.out.println("Enter key: ");
        key=in.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                System.out.println(" the key is found at index: "+i);
            }
        }
    }
}  

import java.util.*;
public class equal {
    static int findEquillibrium(int[] arr){
        int n=arr.length;
        int[] pref=new int[n];
        int[] suff=new int[n];
        pref[0]=arr[0];
        suff[n-1]=arr[n-1];

        for(int i=1;i<n;i++){
            pref[i]=pref[i-1]+arr[i];
        }
        for(int i=n-2;i>=0;i--){
            suff[i]=suff[i+1]+arr[i];
        }
        for(int i=0;i<n;i++){
            if(pref[i]==suff[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int ans=findEquillibrium(arr);
        System.out.println(ans);
        
    }
    }

import java.util.*;
class Count{
    static int maxLen(int[] arr){
        int n=arr.length;
        int cnt=0;
        for(int i=0;i<n;i++){
            cnt=i;
        }
        return cnt;
    }
    public static void main(String args[]){
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int length=maxLen(arr);
        System.out.println(length);
    }
}

import java.util.*;
public class length {
    static int maxLen(int[] arr){
        int res=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                if(arr[j]==0){
                    sum=sum-1;
                }
                else {
                    sum=sum+1;
                }
                if(sum==0){
                    res=Math.max(res,j-i+1);
                }
            }
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
        int ans=maxLen(arr);
        System.out.println(ans);
    }
}

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
