class ConcatenationOfArray_1929{
    public int[] getConcatenation(int[] nums) {
        int[] arr = new int[nums.length+nums.length];
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            arr[nums.length+i] = nums[i];
        }
        return arr;
    }
}