class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1){
            return true;
        }

        int lo = 1;
        int hi = num/2;
        while(lo<=hi){
            long mid = lo + (hi-lo)/2;
            if(mid*mid == num){
                return true;
            }else if(mid*mid> num){
                hi = (int)mid-1;
            }else{
                lo = (int)mid+1;
            }
        }
        return false;
    }
}