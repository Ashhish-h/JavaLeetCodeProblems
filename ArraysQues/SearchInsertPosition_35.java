package ArraysQues;

class SearchInsertPosition_35 {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length -  1;
        while(start <= end) {
            int middle = start+(end - start) / 2; 
            if(nums[middle] == target){
                return middle;
            }
            if(target > nums[middle]) {
                start = middle + 1;
                } else {
                end = middle - 1;
            }

        }
        return start;
    }
}