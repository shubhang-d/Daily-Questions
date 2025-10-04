class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i =0 ;i<board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                if(board[i][j] == word.charAt(0)){
                    if(check(board, word, 0, i, j)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean check(char[][] board, String word, int idx, int i, int j){
        if(idx == word.length()){
            return true;
        }
        if(i<0 || j<0 || i>=board.length || j>= board[0].length || board[i][j] == '*' || word.charAt(idx) != board[i][j]){
            return false;
        }

        int[][] dir = {{0,1}, {-1,0}, {0, -1}, {1,0}};

        for(int k =0; k<dir.length;k++){
            char temp = board[i][j];
            board[i][j] = '*';
            if(check(board, word, idx+1, i+dir[k][0], j+dir[k][1])){
                return true;
            }
            board[i][j] = temp;
        }
        return false;
    }

}