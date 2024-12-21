package greedyQues;

public class RearrangeElementBySign {
    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int posIndx = 0, negIndx = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                ans[negIndx] = nums[i];
                negIndx += 2;
            } else {
                ans[posIndx] = nums[i];
                posIndx += 2;
            }
        }
        return ans;

    }
}
