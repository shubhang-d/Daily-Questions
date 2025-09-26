class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] trustIn = new int[n+1];
        int[] trustOut = new int[n+1];

        for(int[] arr: trust){
            trustIn[arr[1]]++;
            trustOut[arr[0]]++;
        }

        for(int i =1;i<=n;i++){
            if(trustIn[i] ==n-1 && trustOut[i] == 0){
                return i;
            }
        }
        return -1;
    }
}