import java.util.*;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] ma = new int[nums1.length + nums2.length];

        for(int i = 0; i<nums1.length; i++){
            ma[i] = nums1[i];
        }
        for(int i = 0; i<nums2.length; i++){
            ma[i+nums1.length] = nums2[i];
        }
        Arrays.sort(ma);
        // Collections.sort(ma);
        // System.out.println(ma.size()/2);
        if (ma.length%2 == 0){
            return (double)(ma[ma.length/2 -1] + ma[ma.length/2])/2;
        }else{
            return (double) (ma[(ma.length)/2]);
        }
    }
}
