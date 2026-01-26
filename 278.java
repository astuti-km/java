class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        int s=0,e=0;
        ArrayList<Integer> res=new ArrayList<>();
        int curr=0;
        
        for(int i=0;i<arr.length;i++){
            curr+=arr[i];
            if(curr>=target){
            e=i;
            while(curr>target &&s<e){
                curr-=arr[s];
                ++s;
            }
                if(curr==target){
                    res.add(s+1);
                    res.add(e+1);
                    return res;
                }
            }
        }
        res.add(-1);
        return res;
    }
}
class Solution {
    public int countTriangles(int arr[]) {
        // code here
        int res=0;
        Arrays.sort(arr);
        
        for(int i=2;i<arr.length;i++){
            int left=0,right=i-1;
            while(left<right){
                if(arr[left]+arr[right]>arr[i]){
                    res+=right-left;
                    right--;
                }
                else {
                    left++;
                }
            }
        }
        return res;
    }
}
class Solution {

    int countPairs(int arr[], int target) {
        // Complete the function
        int res=0;
        int n=arr.length;
        int left=0,right=n-1;
        
        while(left<right){
            if(arr[left]+arr[right]<target)
                left++;
            else if(arr[left]+arr[right]>target)
            right--;
            else {
                int cnt1=0,cnt2=0;
                int ele1=arr[left],ele2=arr[right];
                while(left<=right && arr[left]==ele1)
                {
                    left++;
                    cnt1++;
                }
                while(left<=right && arr[right]==ele2){
                    right--;
                    cnt2++;
                }
                if(ele1==ele2)res+=(cnt1*(cnt1-1))/2;
                else
                    res+=cnt1*cnt2;
                
            }
        }
        return res;
    }
}
class Solution {
    public ArrayList<Integer> sumClosest(int[] arr, int target) {
        // code here
        int n=arr.length;
        Arrays.sort(arr);
        
        ArrayList<Integer> res=new ArrayList<>();
        int minDiff=Integer.MAX_VALUE;
        int left=0,right=n-1;
        
        while(left<right){
            int curSum=arr[left]+arr[right];
            int curDiff=Math.abs(target-curSum);
            if(curDiff<minDiff){
                minDiff=curDiff;
                res=new ArrayList<>(Arrays.asList(arr[left],arr[right]));
            }
            if(curSum==target)
            return new ArrayList<>(Arrays.asList(arr[left],arr[right]));
            
            else if (curSum<target)
            left++;
            else 
            right--;
        }
        return res;
    }
}
// User function Template for Java
class Solution {
    int countPairs(int arr[], int target) {
        // Your code here
        Arrays.sort(arr);
        int left=0;
        int right=arr.length-1;
        int cnt=0;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum<target){
            cnt+=right-left;
            left++;}
            else {
                right--;
            }
        }
        
        return cnt;
    }
}
class Solution {
    public int countTriplets(int[] arr, int target) {
        // Code Here
        int n=arr.length;
        int res=0;
        
        for(int i=0;i<n-2;i++){
            int left=i+1,right=n-1;
            
            while(left<right){
                int sum=arr[i]+arr[left]+arr[right];
                if(sum<target){
                left+=1;}
                
                else if(sum>target){
                    right-=1;
                }
                else if(sum==target){
                    int arr1=arr[left],arr2=arr[right];
                    int cnt1=0;
                    int cnt2=0;
                    while(left<=right && arr[left]==arr1){
                        left++;
                        cnt1++;
                    }
                    while(left<=right && arr[right]==arr2){
                        right--;
                        cnt2++;
                    }
                    if(arr1==arr2)
                    res+=(cnt1*(cnt1-1))/2;
                    
                    else 
                    res+=(cnt1*cnt2);
                }
            }
        }
        return res;
        
    }
}
import java.util.Arrays;

class GfG {
    static int binarySearch(int[] arr, int complement) {
        int lo = 0, hi = arr.length - 1;
        int res = arr.length;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            if (arr[mid] >= complement) {
                res = mid;
                hi = mid - 1;
            } 
          	else {
                lo = mid + 1;
            }
        }
        return res;
    }
    static int countPairs(int[] arr, int target) {
        int cnt = 0;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            int ind = binarySearch(arr, complement);
            cnt += ind;

            if (ind > i)
                cnt--;
        }
        return cnt / 2;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 8, 3, 4, 7, 6, 5 };
        int target = 7;
        System.out.println(countPairs(arr, target));
    }
}
import java.util.*;
public class prim {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int c=2;
        boolean isPrime=true;
        while(c*c<=n){
           if(n%c==0){ 
            isPrime=false;
            break;
           }
           c+=1;
        }
      if(isPrime)
        System.out.println(+n+" is prime");
      else
            System.out.println(+n+" is not prime");
    }
}
import java.util.*;
public class loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int cnt=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                cnt++;
            }}
            System.out.print(cnt);  
    }}
import java.util.*;
public class prime{
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.print("Enter a number: ");
       int n= in.nextInt();
       boolean isPrime=true;
       for(int i=2;i<=n/2;i++){
        if(n%i==0){
            isPrime = false;
            break;
        }
}
            if(isPrime){
                System.out.println(+n+" is prime");
            }
            else {
                System.out.println(+n+" is not prime");
            }
        }
    }
import java.util.*;
class Loops{
    public static void main(String ars[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }  
    }
}
