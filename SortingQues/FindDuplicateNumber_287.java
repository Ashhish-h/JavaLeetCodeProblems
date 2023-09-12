package SortingQues;

public class FindDuplicateNumber_287 {
     public int findDuplicate(int[] nums) {
        int i = 0;
        while(i < nums.length){
            if(nums[i] != i + 1){
                int correct = nums[i] - 1;
                if(nums[i] != nums[correct]){
                    swap(nums, i, correct);
                }else{
                    return nums[i];
                }
            } else{
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] nums, int i, int correct){
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }
}
