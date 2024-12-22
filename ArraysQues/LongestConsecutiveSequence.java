class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int longest = 1;
        int lastSmaller = Integer.MIN_VALUE;
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] - 1 == lastSmaller) {
                count++;
                lastSmaller = nums[i];
            } else if(lastSmaller != nums[i]) {
                count = 1;
                lastSmaller = nums[i];
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }
}