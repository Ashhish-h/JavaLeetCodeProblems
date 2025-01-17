import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        ArrayList<int[]> temp = new ArrayList<>();
        for (int[] interval : intervals) {
            if (temp.isEmpty() || temp.getLast()[1] < interval[0]) {
                temp.add(interval);
            } else {
                temp.getLast()[1] = Math.max(temp.getLast()[1], interval[1]);
            }
        }
        int[][] res = new int[temp.size()][2];
        for (int i = 0; i < temp.size(); i++) {
            int[] t = temp.get(i);
            for (int j = 0; j < 2; j++) {
                res[i][j] = t[j];
            }
        }
        return res;
    }
}