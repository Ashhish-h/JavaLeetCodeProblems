package SortingQues;

public class MissingNumber_268 {
    public int missingNumber(int[] nums) {
       	int i = 0;
	    while(i < nums.length) {
		    int corrIndex = nums[i];
		    if(nums[i] < nums.length && nums[i] != nums[corrIndex]) {
			    swap(nums, i, corrIndex);
		    }else {
			    i++;
		    }
	    }
	    for(int j = 0; j<nums.length;j++) {
		    if(nums[j] != j) {
			    return j;
		    }
	    }
	    return nums.length; 
    }
    public static void swap(int[] arr, int i, int corrIndex) {
	int temp = arr[i];
	arr[i] = arr[corrIndex];
	arr[corrIndex] = temp;
	}
}



