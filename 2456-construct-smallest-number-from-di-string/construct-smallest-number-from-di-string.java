class Solution {
    public String smallestNumber(String pattern) {
        Stack<Integer> st = new Stack<>();
        int[] arr = new int[pattern.length()+1];
        int idx = 1;
        for(int i = 0;i<=pattern.length();i++){
            if(i==pattern.length() || pattern.charAt(i) == 'I'){
                arr[i] = idx;
                idx++;
                while(!st.isEmpty()){
                    arr[st.pop()] = idx;
                    idx++;
                }
            }else{
                st.push(i);
            }
        }
        String str = "";
        for(int i =0;i<arr.length;i++){
            str += arr[i];
        }
        return str;
    }
}