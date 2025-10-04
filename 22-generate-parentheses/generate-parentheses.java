class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        Solve(n, ans, "", 0, 0, 0);
        return ans;
    }
    public void Solve(int n, List<String> ans, String s, int lb, int rb, int sum){
        if(sum == -1){
            return;
        }
        if(lb == n && rb ==n){
            ans.add(s);
            return;
        }
        
        if(lb<=n){
            Solve(n, ans, s+"(", lb+1, rb, sum+1);
        }
        if(rb<=n){
            Solve(n, ans, s+")", lb, rb+1, sum-1);
        }
    }
}