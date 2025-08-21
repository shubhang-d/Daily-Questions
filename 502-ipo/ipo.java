class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n = profits.length;
        int[][] arr = new int[n][2];
        for(int i =0;i<n;i++){
            arr[i][0] = capital[i];
            arr[i][1] = profits[i];
        }
        Arrays.sort(arr,(a,b) -> a[0] - b[0]);

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> b[1] - a[1]);
        for(int i =0;i<arr.length;){
            while(i<n && w>=arr[i][0]){
                pq.add(arr[i]);
                i++;
            }
            if(pq.isEmpty() || k ==0){
            return w;
        }
        w+= pq.poll()[1];
        k--;
        }
        
        
        while(pq.size()>0 && k>0 && w>pq.peek()[1]){
        w+=pq.poll()[1];
        k--;
    }
    return w;
    }

    

}