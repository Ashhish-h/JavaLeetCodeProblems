package Math;

public class Powxn {
    public double myPow(double x, int n) {
        long N = n; // Use long to handle the edge case when n is Integer.MIN_VALUE
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        double result = 1.0;
        double currentProduct = x;

        while (N > 0) {
            if (N % 2 == 1) { // If N is odd
                result *= currentProduct;
            }
            currentProduct *= currentProduct; // Square the base
            N /= 2; // Halve N
        }

        return result;
    }
}
