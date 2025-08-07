class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        List ml = new ArrayList();
        if (ransomNote.length() > magazine.length()) return false;
        for(int i = 0; i<magazine.length(); i++){
            ml.add(magazine.charAt(i));
        }
        for (int i = 0; i<ransomNote.length(); i++){
            if(!ml.contains(ransomNote.charAt(i))){
                return false;
            }
            ml.remove(ml.indexOf(ransomNote.charAt(i)));
        }
        return true;
    }
}
