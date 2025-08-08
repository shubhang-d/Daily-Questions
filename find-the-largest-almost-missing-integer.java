class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            hm.put(nums[i], 0);
        }
        int i = 0;
        while(i+k<=nums.length){
            Set<Integer> s = new HashSet<>();
            for(int j = i;j<i+k;j++){
                s.add(nums[j]);
            }
            // for(int j = i; j<i+k; j++){
            //     if(hm.containsKey(nums[j])){
            //         hm.put(nums[j], hm.get(nums[j]) + 1);
            //     }
            //     System.out.println(hm);
            // }
            for (int a: s){
                if(hm.containsKey(a)){
                    hm.put(a, hm.get(a) + 1);
                }
            }
            i++;
        }
        System.out.println(hm);
        int a = -1;
        int b = 0;
        for (Map.Entry<Integer, Integer> set :hm.entrySet()){
            b = set.getKey();
            if(hm.get(b) == 1){
                if(b>a){
                    a = b;
                }
            }
        }
        return a;
    }
}
