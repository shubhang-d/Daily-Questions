class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int si = 0;
        int ei =0 ;
        int ans = 0;
        while(ei<s.length()){
            char ch = s.charAt(ei);
            //growing
            if(hm.getOrDefault(ch, 0) >= 0){
                hm.put(ch, hm.getOrDefault(ch, 0)+1);
            }
            //shrinking
            while(hm.getOrDefault(ch, 0) > 1){
                hm.put(s.charAt(si), hm.get(s.charAt(si))-1);
                si++;
            }
            //ans
            ans = Math.max(ans, (ei-si+1));
            ei++;
        }
        return ans;
    }
}
