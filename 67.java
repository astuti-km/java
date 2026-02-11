// whatever done in class

class Solution {
    public static int[] productExceptSelf(int arr[]) {
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
    public static int findEquilibrium(int arr[]) {
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
