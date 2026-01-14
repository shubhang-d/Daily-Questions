class Solution {
    public int[] singleNumber(int[] nums) {
        int ans = 0;
        for(int n: nums) ans ^=n;

        int mask = ans & -ans;

        int num0 = 0, num1 =0;

        for(int n:nums){
            if((n&mask) !=0){
                num1 ^= n;
            }else{
                num0 ^= n;
            }
        }
        return new int[]{num0, num1};
    }
}