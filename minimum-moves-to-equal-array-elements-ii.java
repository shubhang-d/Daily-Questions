class Solution {
    public int minMoves2(int[] nums) {
        int median = nums.length/2;
        Arrays.sort(nums);
        median = nums[median];
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            count += Math.abs(nums[i] - median);
        }
        return count;
    }
}
