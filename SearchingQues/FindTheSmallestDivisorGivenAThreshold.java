package SearchingQues;

public class FindTheSmallestDivisorGivenAThreshold {
    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1, right = getMax(nums);
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (computeSum(nums, mid) > threshold) {
                left = mid + 1; // Increase divisor if the sum exceeds threshold
            } else {
                right = mid; // Decrease divisor if the sum is within the threshold
            }
        }
        return left;

    }

    // Function to compute sum by dividing each element by divisor
    private static int computeSum(int[] nums, int divisor) {
        int sum = 0;
        for (int num : nums) {
            sum += Math.ceil((double) num / divisor);
        }
        return sum;
    }

    // Helper function for finding max
    private static int getMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
