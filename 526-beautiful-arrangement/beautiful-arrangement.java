class Solution {
    int ans = 0;
    
    public void dfs(Integer index, List<Integer> nums) {
        if (index == nums.size()) {
            ans += 1;
        } else {
            for (int i = index; i < nums.size(); i++) {
                if ((index+1) % nums.get(i) == 0 || nums.get(i) % (index+1) == 0) {
                    Collections.swap(nums, i, index);
                    dfs(index+1, nums);
                    Collections.swap(nums, i, index);
                }
            }
        }
    }
    
    public int countArrangement(int n) {
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= n; ++i) nums.add(i);
        dfs(0, nums);
        return ans;
    }
}