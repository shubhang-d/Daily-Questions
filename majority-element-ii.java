class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int a = n/3;
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<n; i++){
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }
        for(Integer key : hm.keySet()){
            if(hm.get(key) > a) list.add(key);
        }
        return list;
    }
}
