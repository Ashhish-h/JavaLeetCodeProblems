public class HowManyNumbersAreSmallerThanTheCurrentNumber_1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int out = 0;
            for(int j=0;j<nums.length;j++){
                if (nums[i] != nums[j] && nums[i]>nums[j]){
                    out++;
                }
                arr[i]=out;
            }
        }
        return arr;
    }
}


