package SearchingQues;

public class sqrtx_69 {
    public int mySqrt(int x) {
        long start = 1;
        long end = x;
        long out = 0;
        while(start <= end) {
            long mid = start + (end - start) / 2;
            if (mid* mid == x){
                out = (int)mid;
                break;
            }
            else if (mid*mid < x){
                start = mid + 1;
                out = mid;
            } 
            else {
                end = mid - 1;
            }
        }
        return (int) out;
    }
}
