class Solution {
    public boolean isEqual(int[] a , int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public boolean checkInclusion(String s1, String s2) {
        int[] cnt1 = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            int idx = s1.charAt(i) - 'a';
            cnt1[idx]++;
        }

        int i = 0;
        int[] cnt2 = new int[26];
        int windowSize = s1.length();

        while(i < windowSize && i < s2.length()) {
            int idx = s2.charAt(i) - 'a';
            cnt2[idx]++;
            i++;
        }

        if (isEqual(cnt1 , cnt2)) return true;

        while(i < s2.length()) {
            char newCh = s2.charAt(i);
            cnt2[newCh - 'a']++;

            char oldCh = s2.charAt(i - windowSize);
            cnt2[oldCh - 'a']--;

            i++;
            if (isEqual(cnt1 , cnt2)) return true;
        }
        return false;
    }
}