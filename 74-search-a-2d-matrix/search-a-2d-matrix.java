class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix[0].length-1;
        int row=-1;
        for(int i=0; i<matrix.length; i++){
            if(matrix[i][0]<=target && matrix[i][n]>=target){
                row=i;
                break;
            }
        }
        if(row==-1){return false;}
        int l=0,r=n;
        int mid;
        while(l<=r){
            mid=(int)((l+r)/2);
            if(matrix[row][mid]==target){
                return true;
            }
            else if(matrix[row][mid]<target){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return false;
    }
}