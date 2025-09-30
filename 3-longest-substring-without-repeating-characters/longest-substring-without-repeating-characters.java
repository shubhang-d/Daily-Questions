class Solution {
    public int lengthOfLongestSubstring(String s) {
        int si =0 ;
        int ei =0 ;
        int n = s.length();
        HashMap<Character, Integer> hm = new HashMap<>();
        int ans = 0;
        while(ei<n){
            //growing
            char ch = s.charAt(ei);
            hm.put(ch, hm.getOrDefault(ch, 0)+1);
            //shrinking
            while(hm.get(ch)>1){
                    char cha = s.charAt(si);
                    hm.put(cha, hm.get(cha)-1);
                    si++;
            }
            //calculate
            ans = Math.max(ans, ei-si+1);
            ei++;
        }
        return ans;
    }
}