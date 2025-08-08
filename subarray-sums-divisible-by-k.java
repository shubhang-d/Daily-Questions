class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int sum = 0;
        int ans = 0;
        int[] arr = new int[k];
        arr[0] = 1; 
        for(int n : nums){
            sum+=n;
            sum =(k+(sum%k))%k; 
            arr[sum]++;
            ans+=(arr[sum]-1); 
        }
        return ans;

    }
}
