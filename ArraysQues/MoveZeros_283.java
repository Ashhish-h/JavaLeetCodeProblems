class MoveZeros_283{
    public void moveZeroes(int[] nums) {
        int i = 0;
        for (int num : nums)
        {
            if (num != 0)
            {
                nums[i] = num;
                i++;
            }
        }

        while (i <= nums.length - 1)
        {
            nums[i] = 0;
            i++;
        }  
    }
}