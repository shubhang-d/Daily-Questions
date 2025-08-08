class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> arr = new ArrayList<>();
        for(int i =0; i<n;i++){
            arr.add(i+1);
        }
        int a= 0;
        while(arr.size() !=1){
            int rem = (a+k-1)%arr.size();
            arr.remove(rem);
            a = rem;
        }
        return arr.get(0);
    }
}
