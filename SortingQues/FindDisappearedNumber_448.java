package SortingQues;
import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumber_448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int corrIndex = nums[i] - 1;
            if(nums[i] != nums[corrIndex]){
                swap(nums, i, corrIndex);
            } else{
                i++;
            }
        }

        //Finding all Disappeares Numbers
        List<Integer> res = new ArrayList<>();
            for(int index = 0; index < nums.length; index++){
                if(nums[index] != index + 1){
                    res.add(index + 1);
                }
            }
            return res;    
        }

    public static void swap(int[] nums, int i, int corrIndex){
        int temp = nums[i];
        nums[i] = nums[corrIndex];
        nums[corrIndex] = temp;
    }
}
