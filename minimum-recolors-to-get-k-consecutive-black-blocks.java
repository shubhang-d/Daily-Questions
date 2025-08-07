class Solution {
    public int minimumRecolors(String blocks, int k) {
        int wcount =0, count = Integer.MAX_VALUE;
        for(int i = 0; i<blocks.length(); i++){
            if(i+k<=blocks.length()){
                for(int j = i; j<i+k; j++){
                    if(blocks.charAt(j) == 'W'){
                        wcount++;
                    }
                }
                if(wcount<count){
                    count = wcount;
                }
                wcount = 0;
            }else{
                continue;
            }
        }
        return count;
    }
}
