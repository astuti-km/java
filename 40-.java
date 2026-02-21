class Solution {
    public int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
       int i=0;
       int j=nums.length-1;
       while(i<j){
        int sum=nums[i]+nums[j];
        if(sum==target){
            return new int[] {i,j};
        }
        else if(sum<target){
            i++;
        }
        else if(sum>target){
            j--;
        }
       } 
       return new int[] {-1,-1};
    }
}


class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Arrays.sort(numbers);
        int i=0;
        int j=numbers.length-1;
                while(i<j){
                    int sum=numbers[i] + numbers[j];
                    if(sum==target){ 
                    return new int[] {i+1,j+1};
                }
                else if(sum<target){ 
                i++;}
                else if(sum>target){ 
                j--;
                }}
                return new int[] {-1,-1};
            }
        }
