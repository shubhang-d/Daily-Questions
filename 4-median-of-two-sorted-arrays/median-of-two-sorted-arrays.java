class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];
        for(int i = 0;i<nums1.length;i++){
            arr[i] = nums1[i];
        }
        for(int i= 0;i<nums2.length;i++){
            arr[nums1.length + i] = nums2[i];
        }
        Arrays.sort(arr);
        double median = 0.0;
        if(arr.length%2==0){
            int a = arr[arr.length/2 -1];
            int b = arr[arr.length/2];
            median = (double)(a+b)/2;
        }else{
            median = arr[arr.length/2];
        }
        return median;
    }
}