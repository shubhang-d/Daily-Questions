class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int currmax = nums[0], currmin= nums[0], maxSum=nums[0], minSum= nums[0];
        int totalsum = nums[0];
        for(int i = 1;i<nums.length;i++){
            int a = nums[i];
            currmax = Math.max(a, currmax+a);
            maxSum = Math.max(maxSum, currmax);

            currmin=Math.min(a, currmin + a);
            minSum = Math.min(currmin, minSum);
            totalsum += a;
        }
        if(minSum==totalsum) return maxSum;
        return Math.max(maxSum, totalsum-minSum);
    }
}