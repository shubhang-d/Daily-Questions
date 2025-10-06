class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<Boolean>> grid = new ArrayList<>();
        for(int i = 0;i<n;i++){
            List<Boolean> temp = new ArrayList<>();
            for(int j =0 ;j<n;j++){
                temp.add(false);
            }
            grid.add(temp);
        }
        List<List<String>> res = new ArrayList<>();
        solve(n, grid, res, 0);
        return res;
    }
    public void solve(int n, List<List<Boolean>> grid, List<List<String>> res, int k){
        if(n == k){
            List<String> ans = new ArrayList<>();
            for(int i = 0;i<n;i++){
                String s = "";
                for(int j =0;j<n;j++){
                    if(grid.get(i).get(j)){
                        s=s+"Q";
                    }else{
                        s=s+".";
                    }
                }
                ans.add(s);
            }
            res.add(ans);
            return;
        }

        for(int i = 0;i<n;i++){
            if(isSafe(grid, i, k)){
                grid.get(i).set(k, true);
                solve(n, grid, res, k+1);
                grid.get(i).set(k, false);
            }
        }
    }
    public boolean isSafe(List<List<Boolean>> grid, int i, int j){
        //vertical
        int temp = i;
        while(temp>=0){
            if(grid.get(temp).get(j) == true){
                return false;
            }
            temp--;
        }
        //horizontal
        temp = j;
        while(temp>=0){
            if(grid.get(i).get(temp) == true){
                return false;
            }
            temp--;
        }
        //left diagonal
        int temp1 = i;
        int temp2 = j;
        while(temp1>=0 && temp2>=0 ){
            if(grid.get(temp1).get(temp2)==true){
                return false;
            }
            temp1--;
            temp2--;
        }
        //right diagonal
        temp1 = i;
        temp2 = j;
        while(temp2>=0 && temp1<grid.size()){
            if(grid.get(temp1).get(temp2) == true){
                return false;
            }
            temp1++;
            temp2--;
        }
        return true;
    }
}