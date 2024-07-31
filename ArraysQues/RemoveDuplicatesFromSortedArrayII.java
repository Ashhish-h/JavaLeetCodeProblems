public class RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        if(nums.length <= 2){
            return nums.length;
        }

        int insertPos = 1, count = 1;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i - 1]){
                count++;
            } else {
                count = 1;
            }

            if(count <= 2){
                nums[insertPos] = nums[i];
                insertPos++;
            }
        }
        return insertPos;
    }
}
