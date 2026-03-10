class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String a ="";
        for(int i =0 ;i<s.length();i++){
            char ch = s.charAt(i);
            if((ch >= 'A' && ch <= 'Z') || (ch>= 'a' && ch<='z') || (ch>= '0' && ch<= '9')){
                a = a+ ch;
            }
        }
        String arev = "";
        for(int i = a.length()-1;i>=0;i--){
            arev += a.charAt(i);
        }
        if(a.equals(arev)){
            
            return true;
        }

        return false;
    }
}