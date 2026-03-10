class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){ 
            digits[i]++;
            return digits;
            }
        digits[i]=0;
        }
        int[] result=new int[digits.length+1];
        result[0]=1;
       return result;
    }
}

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}

class Solution {
    public int singleNumber(int[] nums) {
    int result=0;
    for(int num:nums){
        result ^= num;
    }
    return result;
    }
}
