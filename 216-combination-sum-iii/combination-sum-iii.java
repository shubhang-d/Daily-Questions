class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> lla = new ArrayList<>();
        combinations(k,n, new ArrayList<>(), lla, 1);
        return lla;
    }
    public void combinations(int k, int n, List<Integer> ll, List<List<Integer>> lla, int idx){
        if(n==0 && ll.size() == k){
            lla.add(new ArrayList<>(ll));
        }
        for(int i = idx;i<=9;i++){
            ll.add(i);
            combinations(k, n-i, ll, lla, i+1);
            ll.remove(ll.size()-1);
        }
    }
}