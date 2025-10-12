class Solution {
    long[][] t = new long[100001][2];
    public long maxAlternatingSum(int[] nums) {
        for(int i = 0;i<t.length;i++){
            for(int j =0; j<2;j++){
                t[i][j] = -1;
            }
        }
        
        long max = solve(nums, 0, true);
        return max;
    }
    public long solve(int[] nums, int index, boolean flag){
        if(nums.length == index){
            return 0;
        }
        int a= 0;
        if(flag == false){
            a = 0;
        }else{
            a = 1;
        }
        if(t[index][a] != -1)
            return t[index][a];
        long val = nums[index];
        
        if(flag == false){
            val = -val;
        }
        long pick = val + solve(nums, index+1, !flag);
        long notPick = solve(nums, index+1, flag);
        return t[index][a] = Math.max(pick, notPick);

    }
}