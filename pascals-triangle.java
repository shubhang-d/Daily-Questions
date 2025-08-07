class Solution {
    public List<List<Integer>> generate(int numRows) {
        int n = 0;
        int r = 0;

        List<List<Integer>> arr = new ArrayList<>();

        for(int i = 0; i<numRows;i++){
            List<Integer> arr2 = new ArrayList<>();
            arr2.add(1);
            for(int j = 1;j<i;j++){
                int val = arr.get(i-1).get(j-1) + arr.get(i-1).get(j);
                arr2.add(val);
            }
            if(i>0) arr2.add(1);
            arr.add(arr2);
        }
        return arr;
    }
}
