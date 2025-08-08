class Solution {
    public String getHint(String secret, String guess) {
        int bull =0 ;
        int cow = 0;
        int[] arr = new int[10];
        for(int i =0; i<secret.length();i++){
            if(guess.charAt(i) == secret.charAt(i)){
                bull++;
            }else{
                if(arr[Character.getNumericValue(secret.charAt(i))] < 0) cow++;
                if(arr[Character.getNumericValue(guess.charAt(i))] > 0) cow++;
                arr[Character.getNumericValue(secret.charAt(i))]++;
                arr[Character.getNumericValue(guess.charAt(i))]--;
            }
        }
        return bull + "A" + cow + "B";
    }
}
