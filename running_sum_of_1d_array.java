class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        int[] suma = new int[nums.length];
        for (int i = 0; i<nums.length; i++){
            suma[i] = sum+nums[i];
            sum = suma[i];
        }
        return suma;
    }
}
