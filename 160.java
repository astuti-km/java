import java.util.*;
public class swaping {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int a=8;
       int b =0;
       swap(a,b); 
    }
    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
       
    }
}


import java.util.*;
public class printSum {
    public static void sum(int a,int b){
        int c=a+b;
        System.out.println("Sum is: "+c);
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.err.println("enter a:");
        int a=in.nextInt();
        System.err.println("enter b");
        int b=in.nextInt();
        sum(a,b);
    }
}


import java.util.ArrayList;
public class list {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
       num.add(89);
       num.add(867);
       num.add(769);
       num.add(980);
        num.add(579);
        System.out.println(num);
        System.out.println(num.contains(769));
    }
}


// User function Template for Java
class Solution {
    public List<List<Integer>> findTriplets(int[] arr) {
        // Your code here
        List<List<Integer>> res = new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    
                    if(arr[i] + arr[j] + arr[k] == 0){
                        ArrayList<Integer> triplet =new ArrayList<>();
                        triplet.add(i);
                        triplet.add(j);
                        triplet.add(k);
                        res.add(triplet);
                    }
                }
            }
        }
        return res;
    }
}


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



class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        
    HashSet<Integer> res = new HashSet<>();
    
    for(int num:a)
        res.add(num);
        
    for(int num:b)
         res.add(num);
    
    ArrayList<Integer> st = new ArrayList<> ();
    for(int it:res)
        st.add(it);
    return st;
}
}

class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
        HashSet<Integer> st=new HashSet<>();
        int res=0;
        for(int val:arr)
        st.add(val);
        
        for(int val:arr){
        if(st.contains(val) && !st.contains(val-1)){
            int cur=val;
            int cnt=0;
            while(st.contains(cur)){
                st.remove(cur);
                cur++;
                cnt++;
            }
            res=Math.max(res,cnt);
        }
    }
    return res;
    }
}
