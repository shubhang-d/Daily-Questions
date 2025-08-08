class Solution {
    public long maxSum(int[][] grid, int[] limits, int k) {
        List<Integer> arr = new ArrayList<>();
        for(int i =0 ;i<grid.length; i++){
            List<Integer> al = new ArrayList<Integer>(grid[i].length);
            for (int j : grid[i])
            {
                al.add(j);
            }
            Collections.sort(al, Collections.reverseOrder());
            for(int j = 0; j<limits[i];j++){
                arr.add(al.get(j));
            }
        }
        Collections.sort(arr, Collections.reverseOrder());
        long sum = 0;
        for(int i = 0;i<k;i++){
            sum += arr.get(i);
        }
        return sum;
    }
}
