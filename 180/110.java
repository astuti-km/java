import java.util.*;
class srt{
    static void sort(int[] arr){
        Arrays.sort(arr);
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=in.nextInt();
        }
        sort(arr);
        for(int i=0;i<num;i++){
        System.out.print(arr[i]+" ");}
    }
}
output
7
90 45 7 4 80 5576 
456
4 7 45 80 90 456 5576 



import java.util.Arrays;

class GfG {
    static int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        int idx = 0;
        while (idx < n && citations[n - 1 - idx] > idx) {
            idx++;
        }
        return idx;
    }

    public static void main(String[] args) {
        int[] citations = {6, 0, 3, 5, 3};
        System.out.println(hIndex(citations));
    }
}
output
3



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

import java.util.*;
class largest {
    static int secLar(int[] arr){
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
        int lar=secLar(arr);
        System.out.println(lar);
    }
}
output
5
12 35 1 10 34
34



import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        
        for(int i = n - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}
output
  5
1 4 5 7 4 
4 7 5 4 1 

  
