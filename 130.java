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
output
5
12 34 56 78 54
[12, 34, 56, 78, 54]
Enter key: 
12
 the key is found at index: 0


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
output
4
1 2 0 3 
2


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
output
6 
1 2 3 4 5 6
5

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
output
7  
1 0 1 11  1 0 0 
6
