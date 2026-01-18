import java.util.*;
class lar{
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
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int seclargest=secLargest(arr);
        System.out.println(seclargest);
    }
}
6
12 35 1 10 34 1
34

import java.util.*;
class lar{
    static int secLargest(int[] arr){
        int n=arr.length;
       int largest=-1,seclargest=-1;
       for(int i=0;i<n;i++){
           if(arr[i]>largest){
               largest=arr[i];
           }
       }
       for(int i=0;i<n;i++){
           if(arr[i]>seclargest && arr[i]!=largest){
               seclargest=arr[i];
           }
       }
       return seclargest;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int seclargest=secLargest(arr);
        System.out.println(seclargest);
    }
}
3
10 5 10
5


import java.util.*;
class lar{
    static int secLargest(int[] arr){
        int n=arr.length;
       int largest=-1,seclargest=-1;
       for(int i=0;i<n;i++){
           if(arr[i]>largest){
               seclargest=largest;
               largest=arr[i];
           }
           else if(arr[i]<largest && arr[i]>seclargest){
               seclargest=arr[i];
               return seclargest;
           }
       }
       return -1;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int seclargest=secLargest(arr);
        System.out.println(seclargest);
    }
}
3
10 10 10 
-1



import java.util.*;
class Solution {
    public int getSecondLargest(int[] arr) {
        int n=arr.length;
        int largest=-1;
        int seclargest=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                seclargest=largest;
                largest=arr[i];
            }
        else if(arr[i]<largest && arr[i]>seclargest){
            seclargest=arr[i];
           
        }
        }
         return seclargest;
    }
    
}


import java.util.*;
class Solution {
    public int getSecondLargest(int[] arr) {
        int n=arr.length;
        int largest=-1;
        int seclargest=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]>seclargest && arr[i]!=largest){
                seclargest=arr[i];
            }
        }
        return seclargest;
    }
   } 

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
}
    
