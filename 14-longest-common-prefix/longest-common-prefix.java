class Solution {
    public String longestCommonPrefix(String[] strs) {
        String match = strs[0];
        if(strs.length == 1){
            return match;
        }
        for(int i = 1;i<strs.length;i++){
            match = matchStr(match, strs[i]);
        }
        return match;
    }
    public String matchStr(String str1, String str2){
        String match = "";
        if(str1.length() >= str2.length()){
            for(int i =0; i<str2.length();i++){
                if(str2.charAt(i) == str1.charAt(i)){
                    match  = match + str2.charAt(i);
                    System.out.println(match);
                }else{
                    return match;
                }
            }
        }else{
            for(int i =0 ;i<str1.length();i++){
                if(str1.charAt(i) == str2.charAt(i)){
                    match = match + str1.charAt(i);
                }else{
                    return match;
                }
            }
        }
        return match;
    }
}