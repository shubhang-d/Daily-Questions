class Solution {
    public int findPeakElement(int[] nums) {
        int peak = 0;
        while(peak<nums.length-1){
            if(nums[peak]>nums[peak+1]){
                return peak;
            }else{
                peak++;
            }
        }
        return peak;
    }
}