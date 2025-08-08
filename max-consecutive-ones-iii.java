class Solution {
    public int longestOnes(int[] nums, int k) {
        int si = 0;
        int ei = 0;
        int ans = 0;
        int flip = 0;
        while(ei<nums.length){
            //growing
            if(nums[ei] == 0){
                flip++;
            }
            //shrinking
            while(flip>k){
                if(nums[si] == 0){
                    flip--;
                }
                si++;
            }
            //ans
            ans = Math.max(ans, ei-si+1);
            ei++;
        }
        return ans;
    }
}
