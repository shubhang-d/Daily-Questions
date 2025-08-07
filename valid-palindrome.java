class Solution {
    public boolean isPalindrome(String s) {
        String a= "";
        s = s.toLowerCase();
        for(int i = 0; i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                a += s.charAt(i);
            }
        }
        int n = a.length();
        // System.out.print(a);
        for(int i = 0;i<n;i++){
            if(a.charAt(i) != a.charAt(n -1 - i)){
                return false;
            }
        }
        return true;
    }
}
