class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> lla = new ArrayList<>();
        List<String> ll = new ArrayList<>();
        Partitioning(s, ll, lla);
        return lla;
    }
    public void Partitioning(String ques, List<String> ll, List<List<String>> lla){
        if(ques.length() == 0){
            lla.add(new ArrayList<>(ll));
            return;
        }
        for(int i = 1;i<=ques.length();i++){
            String s = ques.substring(0, i);
            if(isPalindrome(s)){
                ll.add(s);
                Partitioning(ques.substring(i), ll, lla);
                ll.remove(ll.size() -1);
            }
        }
    }

    public boolean isPalindrome(String s){
        int i = 0;
        int j = s.length() - 1;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}