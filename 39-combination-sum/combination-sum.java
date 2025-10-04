class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        Solve(candidates, target, res, ans, 0, 0);
        return res;
    }
    public void Solve(int[] candidates, int target, List<List<Integer>> res, List<Integer> ans, int idx, int total){
        if(total>target) return;
        if(target == total){
            res.add(new ArrayList<>(ans));
            return;
        }
        for(int i =idx; i<candidates.length;i++){
            ans.add(candidates[i]);
            Solve(candidates, target, res, ans, i, total+candidates[i]);
            ans.remove(ans.size()-1);
        }
        
    }
}