public class FindMisMatch_645 {
    public int[] findErrorNums(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int corrIndex = nums[i] - 1;
            if(nums[i] != nums[corrIndex]){
                swap(nums, i, corrIndex);
            } else{
               i++;
            }
        }
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != j + 1){
                return new int[]{nums[j], j+1};
            }
        }
        return new int[]{-1,-1};
    }

    static void swap(int[] arr, int i, int corrIndex){
        int temp = arr[i];
        arr[i] = arr[corrIndex];
        arr[corrIndex] = temp;
    }
}
