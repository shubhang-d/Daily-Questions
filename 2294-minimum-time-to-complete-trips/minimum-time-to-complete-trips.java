class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        int min = time[0];
        for(int t: time){
            if(t<min) min = t;
        }

        long lo = 1;
        long hi = (long) min * totalTrips;
        while(lo<=hi){
            long mid = lo+ (hi-lo)/2;
            if(isPossible(time, totalTrips, mid)){
                hi = mid-1;
            }else{
                lo = mid+1;
            }
        }
        return lo;
    }
    public boolean isPossible(int[] time, int totalTrips, long mid){
        long sum = 0;
        for(int i = 0;i<time.length;i++){
            sum += mid/time[i];
        }
        if(sum>=totalTrips){
            return true;
        }else{
            return false;
        }
    }
}