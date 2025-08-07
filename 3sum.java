class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List <List<Integer>> list = new ArrayList<>();
        for (int i = 0; i<nums.length; i++){
            int l = i+1;
            int r = nums.length-1;
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            while(l<r){
                if(nums[i] + nums[l] + nums[r] == 0){
                    list.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    while(l<r && nums[l] == nums[l-1]){
                        l++;
                    }
                }else if(nums[i] + nums[l] + nums[r] >0){
                    r--;
                }else{
                    l++;
                }
            }
        }
        return list;
    }
}
