class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i =0; i<board.length;i++){
            for(int j = 0;j<board[0].length; j++){
                boolean ans = search( board, i, j, word, 0);
                if(ans == true){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean search(char[][] board, int cr, int cc, String word, int idx){
        if(idx == word.length()){
            return true;
        }
        if(cc<0 || cr<0 || cc>=board[0].length || cr>=board.length || word.charAt(idx) != board[cr][cc]){
            return false;
        }
        board[cr][cc] = '*';
        int[] r = {-1,0,1,0};
        int[] c= {0,-1,0,1};
        for(int k = 0;k<c.length;k++){
            boolean ans = search(board, cr+r[k], cc+c[k], word, idx+1);
            if(ans == true){
                return true;
            }
        }
        board[cr][cc] = word.charAt(idx);
        return false;
    }
}