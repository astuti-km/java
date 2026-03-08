class Solution {
    public String findDifferentBinaryString(String[] nums) {
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<nums.length;i++){
          if(nums[i].charAt(i)=='0'){
            ans.append('1');
          }  
          else {
            ans.append('0');
          }
        }
        return ans.toString();
    }
}

class Solution {
    boolean pythagoreanTriplet(int[] arr) {
        // code here
        int n=arr.length;
        HashSet<Integer> set=new HashSet<>();
        
        for(int i=0;i<n;i++){
            set.add(arr[i]*arr[i]);
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int sum=arr[i]*arr[i]+arr[j]*arr[j];
                
                if(set.contains(sum)){
                    return true;
                }
            }
        }
        return false;
    }
}
