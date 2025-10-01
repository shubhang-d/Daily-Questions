class Solution {
    public int findContentChildren(int[] g, int[] s) {
        if(s.length == 0){
            return 0;
        }
        int m = g.length;
        int n = s.length;
        int i = 0;
        int j = 0;
        int count =0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(i<m && j<n){
            if(s[j]>=g[i]){
                count++;
                i++;
                j++;
            }else{
                while(j<n && s[j]<g[i]){
                    j++;
                }
                if(j>=n){
                    break;
                }
            }
        }
        return count;
    }
}