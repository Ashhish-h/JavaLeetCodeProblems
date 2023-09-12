package SortingQues;

public class ArraByParityII_922 {
    public int[] sortArrayByParityII(int[] nums) {
        int evenPointer = 0, oddPointer = 1, len = nums.length;
        while(evenPointer < len && oddPointer < len){
            while(evenPointer < len && nums[evenPointer] % 2 == 0){
                evenPointer += 2;
            }
            while(oddPointer < len && nums[oddPointer] % 2 == 1){
                oddPointer += 2;
            }
            if(evenPointer < len && oddPointer < len){
                swap(nums, evenPointer, oddPointer);
            }
        }
        return nums;
    }

    private void swap(int[] nums, int evenPointer,  int oddPointer){
        int temp = nums[evenPointer];
        nums[evenPointer] = nums[oddPointer];
        nums[oddPointer]  = temp;
    }
}


