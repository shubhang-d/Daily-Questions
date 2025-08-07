class Solution {
    public int possibleStringCount(String word) {
        int count = 1;
        int l = 0;
        int r = l+1;
        int n = word.length();
        while(l<=r && r<word.length()){
            if(word.charAt(l) == word.charAt(r) && r<n-1){
                r++;
            }else if(word.charAt(l) != word.charAt(r)){
                count += r-l-1;
                l = r;
            }else if(word.charAt(l) == word.charAt(r) && r==n-1){
                count += r-l;
                l = r;
                break;
            }
        }
        return count;
    }
}
