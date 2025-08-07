class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        int n = s.length();
        int l = n-2;
        int r = n-1;
        String a ="";
        
        while(l>0){
            if(s.charAt(l) == ' '){
                String a2 = s.substring(l+1, r+1);
                a +=a2;
                a+= " ";
            
                l--;
                while(s.charAt(l) == ' '){
                    l--;
                }

                l -=1;
                r  = l+1;
                
            }else{
                l--;
            }
        }
        a += s.substring(0, r+1);
        return a;
    }
}
