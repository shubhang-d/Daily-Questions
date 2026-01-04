class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int board[][] = obstacleGrid;

        int dp[][] = new int [obstacleGrid.length][obstacleGrid[0].length];
        for(int arr[] :dp){
            Arrays.fill(arr,-1);
        }
        return helper(0,0,board,dp);
    }

    public int helper(int i, int j, int board[][], int dp[][]){
        if(i>=board.length || j>=board[0].length || board[i][j]==1){
            return 0;
        }
        if(i==board.length-1 && j==board[0].length-1){
            return 1;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        board[i][j]=1;
        int ans =0;
        ans+=helper(i,j+1,board,dp);
        ans+=helper(i+1,j,board,dp);
        board[i][j]=0;

        return dp[i][j]=ans;

    }
}