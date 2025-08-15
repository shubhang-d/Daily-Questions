class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        generateP(n, res, 0, 0, "");
        return res;      
    }   
    public void generateP(int n, List<String> res, int op, int cp, String ans){
        if(cp>op){
            return;
        }
        if(op + cp == n*2){
            res.add(ans);
            return;
        }
        if(op < n){
            generateP(n, res, op+1, cp, ans+"(");
        }
        if(op>cp){
            generateP(n, res, op, cp+1, ans+")");
        }
    }
}