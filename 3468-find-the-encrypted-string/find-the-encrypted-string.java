class Solution {
    public String getEncryptedString(String s, int k) {
        return (s + s).substring(k % s.length(), k % s.length() + s.length());
    }
}