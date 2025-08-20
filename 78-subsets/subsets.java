class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> lla = new ArrayList<>();
        generateSubsets(nums, new ArrayList<>(), lla, 0);
        return lla;
    }
    public static void generateSubsets(int[] nums, List<Integer> ll, List<List<Integer>> lla, int idx){
        lla.add(new ArrayList<>(ll));
        for(int i =idx; i<nums.length;i++){
            ll.add(nums[i]);
            generateSubsets(nums, ll, lla, i+1);
            ll.remove(ll.size()-1);
        }
    }
}