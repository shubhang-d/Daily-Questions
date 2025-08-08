class Solution {
    public int[] searchRange(int[] nums, int target) {
        int leftMost = findIndex(nums, target, true);
        int rightMost = findIndex(nums, target, false);

        return new int[]{leftMost, rightMost};
    }

    public int findIndex(int[] nums, int target, boolean leftMost){
        int lo = 0;
        int hi = nums.length -1;
        int index = -1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(nums[mid] == target){
                index = mid;
                if(leftMost == true){
                    hi = mid-1;
                }else{
                    lo = mid+1;
                }
            }else if(target > nums[mid]){
                lo = mid+1;
            }else{
                hi = mid-1;
            }
        }
        return index;
    }
}
