class Solution {
    public boolean hasSameDigits(String s) {
        String e= "";
        while(s.length() != 2){
            for(int i = 1;i<s.length(); i++){
                int a = Character.getNumericValue(s.charAt(i-1));
                int b = Character.getNumericValue(s.charAt(i));
                int c = (a+b)%10;
                e = e + String.valueOf(c);
            }
            s = e;
            e  = "";
            System.out.println(s);
        }
        if(s.charAt(0) == s.charAt(1)){
            return true;
        }
        return false;
    }
}
