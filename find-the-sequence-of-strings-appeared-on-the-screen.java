class Solution {
    public List<String> stringSequence(String target) {
        int n = target.length();
        int i = 0;
        String str = "";
        if(target == null){
            return Arrays.asList("");
        }
        ArrayList<String> list = new ArrayList<>();
        str = "a";
        int chi = 97;
        char ch = 'a';
        list.add(str);
        while(i<n){
            
            if(target.charAt(i) == str.charAt(i)){
                i++;
                chi = 97;
                ch = 'a';
                if(i != n){
                    str += ch;
                }else{
                    break;
                }
            }else if(target.charAt(i) != str.charAt(i)){
                chi++;
                ch = (char) chi;
                char[] myNameChars = str.toCharArray();
                myNameChars[i] = ch;
                str = String.valueOf(myNameChars);
                // str = string.toString();
            }
            list.add(str);
            System.out.println(str);
        }
        return list;
    }
}
