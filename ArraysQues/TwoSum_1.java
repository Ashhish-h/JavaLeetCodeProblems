class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int ele = 0;
        for(int i = 0; i < nums.length; i++)
        {
          for(int j=i+1;j<nums.length;j++){
              ele = target - nums[i];
              if (ele == nums[j]){
                  return new int[]{i, j};
              }
          }
        }
        return new int[]{};
    }
}