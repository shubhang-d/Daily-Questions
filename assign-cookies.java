class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i =0, j =0;
        while(i<g.length && j<s.length){
            if(g[i] <= s[j]){
                i++;
                j++;
            }else if(g[i] > s[j]){
                if(j+1<s.length){
                    j++;
                }else{
                    break;
                }
            }
        }
        return i;
        
    }
}
