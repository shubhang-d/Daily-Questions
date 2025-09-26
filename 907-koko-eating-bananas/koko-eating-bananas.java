class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int lo = 1;
        int hi = -1;
        for(int banana: piles){
            if(banana>hi){
                hi = banana;
            }
        }
        int ans = -1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(isPossible(piles, mid, h)){
                ans = mid;
                hi = mid-1;
            }else{
                lo = mid+1;
            }
        }
        return ans;
    }
    public boolean isPossible(int[] piles, int mid, int h){
        long count =0;
        for(int i =0 ;i<piles.length;i++){
            count += piles[i]/mid;
            if(piles[i]%mid != 0) count++;
        }
        if(count>h){
            return false;
        }else{
            return true;
        }

    }
}