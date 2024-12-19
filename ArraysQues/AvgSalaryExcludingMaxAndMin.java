public class AvgSalaryExcludingMaxAndMin {
    public double average(int[] salary) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < salary.length; i++) {
            min = Math.min(min, salary[i]);
            max = Math.max(max, salary[i]);
        }
        double sum = 0;
        for (int i = 0; i < salary.length; i++) {
            if (min != salary[i] && max != salary[i]) {
                sum += salary[i];
            }
        }
        return sum / (salary.length - 2);
    }
}
