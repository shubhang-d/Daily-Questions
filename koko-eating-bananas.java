class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int lo = 1;
        int hi = -1;
        int hours = 0;
        for(int pile: piles){
            if(pile>hi){
                hi = pile;
            }
        }
        while(lo<=hi){
            int mid = (lo + hi)/2;
            if(canFinish(piles, h, mid)){
                hours = mid;
                hi = mid-1;
            }else{
                lo = mid+1;
            }
        }
        return hours;
    }

    public boolean canFinish(int[] piles, int h, int k){
        long hours = 0;
        for(int pile:piles){
            hours += pile/k;
            if(pile%k!=0) hours++;
        }
        return hours<=h;
    }
}
