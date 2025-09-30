class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i =0 ;i<board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                boolean check = findNext(board, word, 0, i, j);
                if(check){
                    return true;
                }
            }
        }
        return false;
        
    }
    public boolean findNext(char[][] board, String word, int ch, int x, int y){
        if(ch == word.length()){
            return true;
        }
        if(x<0 || y<0 || x>=board.length || y>=board[0].length || word.charAt(ch) != board[x][y] || board[x][y] == '*'){
            return false;
        }
        
        char temp = board[x][y];
        board[x][y] = '*';
        if (findNext(board, word, ch+1, x, y+1) ||
        findNext(board, word, ch+1, x+1, y) ||
        findNext(board, word, ch+1, x, y-1) ||
        findNext(board, word, ch+1, x-1, y)){
            return true;
        }
        board[x][y] = temp;
        return false;
    }
}