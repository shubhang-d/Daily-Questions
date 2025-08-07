class Solution {
    public int removeDuplicates(int[] nums) {
        int prev = Integer.MIN_VALUE;
        int index = 0;
        for(int i = 0; i<nums.length; i++){
            if(prev!=nums[i]){
                prev = nums[i];
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
