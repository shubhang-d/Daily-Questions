class Solution {
    public boolean predictTheWinner(int[] nums) {
        int ans = solve(nums, 0,nums.length-1, 0);
        return ans>=0;
    }
    public int solve(int[] nums, int i, int j, int turn){
        if(i>j){
            return 0;
            
        }
        int ans=0;
        if(turn == 0){
            int left = nums[i] + solve(nums, i+1, j, 1);
            int right = nums[j] + solve(nums, i, j-1, 1);
            ans = Math.max(left, right);
        }else{
            int left = -nums[i] + solve(nums, i+1, j, 0);
            int right = -nums[j] + solve(nums, i, j-1, 0);
            ans = Math.min(left, right);
        }
        return ans;
    }
}