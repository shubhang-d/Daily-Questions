class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> comb = new ArrayList<>();
        addCombination(n, 1,k,comb, res);
        return res;
    }
    public void addCombination(int n,int start, int k,List<Integer> comb, List<List<Integer>> res){
        if(comb.size() == k){
            res.add(new ArrayList(comb));
            return;
        }
        
        for (int num = start; num <= n; num++) {
            comb.add(num);
            addCombination(n, num+1, k,comb, res);
            comb.remove(comb.size() - 1);
        }

    }
}