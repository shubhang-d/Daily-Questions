class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int mx = Integer.MIN_VALUE;
        int sum = 0;
        for(int i =0;i<weights.length;i++){
            if(weights[i]> mx){
                mx = weights[i];
            }
            sum += weights[i];
        }
        int lo = mx;
        int hi = sum;
        int ans = -1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(isPossible(weights, mid, days)){
                ans = mid;
                hi = mid-1;
            }else{
                lo = mid+1;
            }
        } 
        return ans;
    }

    public boolean isPossible(int[] weights, int mid, int days){
        int sum =0;
        int count =0;
        for(int i = 0; i<weights.length;i++){
            if(mid>= weights[i]+ sum){
                sum += weights[i];
            }else{
                count++;
                sum = weights[i];
            }
        }
        count++;
        if(count<=days){
            return true;
        }else{
            return false;
        }
    }
}