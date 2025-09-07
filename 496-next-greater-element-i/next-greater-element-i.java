class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int result[] = new int[nums1.length];

        //finding nextGreater for nums2
        int nextGreater[] = new int[nums2.length];
        Stack<Integer> s = new Stack<>();
        for(int i=nums2.length-1; i>=0; i--){
            while(!s.isEmpty() && nums2[i] >= nums2[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                nextGreater[i] = -1;
            }else{
                nextGreater[i] = nums2[s.peek()];
            }
            s.push(i);
        }

        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nextGreater.length; i++){
            map.put(nums2[i],nextGreater[i]);
        }

        for(int i=0; i<nums1.length; i++){
            result[i] = map.get(nums1[i]);
        }
        return result;
    }
}