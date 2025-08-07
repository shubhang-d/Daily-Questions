class Solution {
    public int maximumWealth(int[][] accounts) {
        int sumi = 0;
        int sumf = 0;
        for(int i = 0; i<accounts.length; i++){
            for (int j = 0; j<accounts[i].length; j++){
                sumi += accounts[i][j];
            }
            if(sumi>sumf){
                sumf = sumi;
            }
            sumi = 0;
        }
        return sumf;
    }
}
