class Solution {
    public int maxWater(int arr[]) {
        // Code Here
        int left=0,right=arr.length-1;
        int res=0;
        while(left<right){
            int max=Math.min(arr[left],arr[right])*(right-left);
            res=Math.max(res,max);
            if(arr[left]<arr[right])
            left+=1;
            else
            right-=1;
        }
        return res;
    }
}


class Solution {
    public int maxWater(int arr[]) {
        // code here
        Stack<Integer> st=new Stack<>();
        int res=0;
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]<arr[i]){
                int pop_height=arr[st.pop()];
                if(st.isEmpty())
                break;
                int dist=i-st.peek()-1;
                int water=Math.min(arr[st.peek()],arr[i]);
                water-= pop_height;
                res+=dist*water;
            }
            st.push(i);
        }
        return res;
    }
}


class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        int n=s.length();
        int res=0;
        for(int i=0;i<n;i++){
            boolean[] vis=new boolean[26];
            for(int j=i;j<n;j++){
                if(vis[s.charAt(j)-'a']==true)
                break;
                else {
                    res=Math.max(res,j-i+1);
                    vis[s.charAt(j)-'a']=true;
                }
            }
        }
        return res;
    }
}


class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        int n=arr.length;
        ArrayList<Integer> res=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<k;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        res.add(map.size());
        for(int i=k;i<arr.length;i++){
            int remove=arr[i-k];
            map.put(remove,map.get(remove)-1);
            if(map.get(remove)==0)
            map.remove(remove);
            
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            res.add(map.size());
        }
        return res;
    }
}


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


// User function Template for Java

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
