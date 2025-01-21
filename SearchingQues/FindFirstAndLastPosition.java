package SearchingQues;

public class FindFirstAndLastPosition {
    public int[] searchRange(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int firstOcc = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] >= target) {
                if (nums[mid] == target) {
                    firstOcc = mid;
                }
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        start = 0;
        end = nums.length - 1;
        int lastOcc = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] <= target) {
                if (nums[mid] == target) {
                    lastOcc = mid;
                }
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return new int[] { firstOcc, lastOcc };
    }
}
