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


class Solution {
    int countPairs(int arr[], int target) {
        // code here
        int n=arr.length;
        int res=0;
        int left=0;
        int right=n-1;
        
        Arrays.sort(arr);
        while(left<right){
            if(arr[left]+arr[right]<target){
                left++;
            }
            else if(arr[left]+arr[right]>target){
                right--;
            }
            else
            {
                int cnt1=0,cnt2=0;
                int element1=arr[left],element2=arr[right];
                while(left<=right && arr[left]==element1){
                    cnt1++;
                    left++;
                }
                while(left<=right && arr[right]==element2){
                    cnt2++;
                    right--;
                }
                if(element1==element2){
                    res+=(cnt1*(cnt1-1))/2;
                }
                else {
                    res+=cnt1*cnt2;
                }
            }
        }
        return res;
    }
}


class norm {
    static int getLastMoment(int n, int[] left, 
                             			int[] right) {
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
