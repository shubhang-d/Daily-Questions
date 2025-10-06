class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        for(int i = 0;i<nums.length;i++) arr.add(nums[i]);
        List<List<Integer>> ans = new ArrayList<>();
        addpermute(arr, 0, ans);
        return ans;
    }
    public void addpermute(List<Integer> nums, int index, List<List<Integer>> ans){
        if(index == nums.size()){
            ans.add(new ArrayList<>(nums));
            return;
        }
        for(int i = index; i<nums.size();i++){
            Collections.swap(nums, i, index);
            addpermute(nums, index+1, ans);
            Collections.swap(nums, index, i);
        }
    }
}