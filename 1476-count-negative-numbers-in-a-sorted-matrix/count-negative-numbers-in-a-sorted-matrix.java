class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for(int i = grid.length-1;i>=0;i--){
            int lo = 0;
            int hi = grid[0].length-1;
            int ans = -1;
            while(lo<=hi){
                int mid = lo + (hi-lo)/2;
                if(grid[i][mid] < 0){
                    ans = mid;
                    hi = mid-1;
                }else{
                    lo = mid+1;
                }
            }
            if(ans == -1){
                break;
            }else{
                count += grid[0].length - ans;
            }
        }
        return count;
    }
}