class Solution {
    public List<String> letterCombinations(String digits) {
        Map<Character, String> phoneMap = new HashMap<>() {{
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }};
        
        List<String> output = new ArrayList<>();
        if (digits.length() == 0) {
            return output;
        }
        
        backtrack(output, phoneMap, digits, 0, "");
        return output;
    }
    
    private void backtrack(List<String> output, Map<Character, String> 
phoneMap, String digits, int index, String combination) {
        if (index == digits.length()) {
            output.add(combination);
            return;
        }
        
        char digit = digits.charAt(index);
        String letters = phoneMap.get(digit);
        
        for (int i = 0; i < letters.length(); i++) {
            backtrack(output, phoneMap, digits, index + 1, combination + 
letters.charAt(i));
        }
    }
}
