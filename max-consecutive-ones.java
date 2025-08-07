class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cons1 = 0;
        int temp = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]==1){
                temp++;
                if (temp>cons1){
                    cons1 = temp;
                }
            }else if(nums[i]!=1){
                temp = 0;
            }
        }
        return cons1;
    }
}
