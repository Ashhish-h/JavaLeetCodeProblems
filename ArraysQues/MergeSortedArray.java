

import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int pointer1 = m - 1; // points to the non zero value 
       int pointer2 = n - 1; // point to the end of the nums2
       int pointer = m + n - 1; // pointer for the end of the nums1

       while(pointer1 >= 0 && pointer2 >= 0){
        if(nums1[pointer1] > nums2[pointer2]){
            nums1[pointer] = nums1[pointer1];
            pointer1--;
        } else {
            nums1[pointer] = nums2[pointer2];
            pointer2--;
        }
        pointer--;

       }

       // if some elements are left in nums2
       while(pointer2 >= 0){
        nums1[pointer] = nums2[pointer2];
        pointer2--;
        pointer--;

       }
       System.out.println(Arrays.toString(nums1));

    }
}