package SearchingQues;

public class KokoEatingBanana {
    private int calHrs(int piles[], int speed) {
        int totalHrs = 0;
        for (int i : piles) {
            totalHrs += Math.ceil((double) i / (double) speed);
        }
        return totalHrs;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length, high = 0;
        for (int i : piles) {
            high = Math.max(high, i);
        }
        int low = 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int totalHrs = calHrs(piles, mid);
            if (totalHrs <= h)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return low;
    }
}