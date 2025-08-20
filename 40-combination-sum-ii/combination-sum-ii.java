class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> lla = new ArrayList<>();
        Arrays.sort(candidates);
        Combinations(candidates, target, new ArrayList<>(), lla, 0);
        return lla;
    }
    public void Combinations(int[] candidates, int target, List<Integer> ll, List<List<Integer>> lla, int idx){
        if(target==0){
            lla.add(new ArrayList<>(ll));
            return;
        }
        for(int i = idx; i<candidates.length;i++){
            if(i>idx && candidates[i] == candidates[i-1]) continue;
            if(target >= candidates[i]){
                ll.add(candidates[i]);
                Combinations(candidates, target-candidates[i], ll, lla, i+1);
                ll.remove(ll.size()-1);
            }
        }
    }
}