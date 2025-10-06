class Solution {
    int ans = 0;
    public int getMaximumGold(int[][] grid) {
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j] != 0){
                    solve(grid, i, j, 0);
                }
            }
        }
        return ans;
    }
    public int solve(int[][] grid, int i, int j, int count){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j] == 0){
            return 0;
        }
        count += grid[i][j];
        int temp = grid[i][j];
        grid[i][j] = 0;
        solve(grid, i+1, j, count);
        solve(grid, i-1, j, count);
        solve(grid, i, j+1, count);
        solve(grid, i, j-1, count);
        grid[i][j] = temp;
        if(count>=ans){
            ans = count;
        }
        count-= grid[i][j];
        return ans;
    }
}