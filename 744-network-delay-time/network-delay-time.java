class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) 
            adj.add(new ArrayList<>());

        for (int[] time : times)
            adj.get(time[0]).add(new int[]{time[1], time[2]}); 

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        pq.add(new int[]{0, k}); // {current time, current node}

        int[] network = new int[n + 1];
        Arrays.fill(network, Integer.MAX_VALUE);
        network[k] = 0;

        while (!pq.isEmpty()) {
            int[] top = pq.poll();
            int cur_time = top[0], cur = top[1];

            for (int[] time : adj.get(cur)) {
                int new_cur = time[0];
                int new_time = cur_time + time[1];

                if (new_time < network[new_cur]) {
                    network[new_cur] = new_time;
                    pq.add(new int[]{new_time, new_cur});
                }
            }
        }

        int min_time = 0;
        for (int i = 1; i <= n; i++) {
            if (network[i] == Integer.MAX_VALUE) return -1; 
            min_time = Math.max(min_time, network[i]);
        }

        return min_time;
    }
}