package SortingQues;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicateInAnArray_442 {
     public List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int corrIndex = nums[i] - 1;
            if(nums[i] != nums[corrIndex]){
                swap(nums, i, corrIndex);
            } else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != j + 1){
                ans.add(nums[j]);
            }
        }
        return ans;
    }

    static void swap(int[] arr, int i, int corrIndex){
        int temp = arr[i];
        arr[i] = arr[corrIndex];
        arr[corrIndex] = temp;
    }
}
