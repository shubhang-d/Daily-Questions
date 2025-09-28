class Solution {
    public int[] findFirstAndLast(int[] nums, int mid){
        int temp = mid;
        int[] arr = {-1,-1};
        while(temp !=-0 && nums[temp] == nums[temp-1]){
            temp--;
        }
        arr[0] = temp;
        temp = mid;
        while(temp != nums.length-1 && nums[temp] == nums[temp+1]){
            temp++;
        }
        arr[1] = temp;
        return arr;
    }
    public int[] searchRange(int[] nums, int target) {
        int lo =0 ;
        int hi = nums.length-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(nums[mid]==target){
                return findFirstAndLast(nums, mid);
            }else if(nums[mid]>target){
                hi = mid-1;
            }else{
                lo = mid+1;
            }
        }
        return new int[]{-1,-1};
    }
}