package SearchingQues;

public class ValidPerfectSquare_367 {
    public boolean isPerfectSquare(int num) {
        if(num == 1){
            return true;
        }

        int start = 1;
        int end = num / 2;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(mid == num / mid && num % mid == 0){
                return true;
            }else if (mid < num / mid){
                start  = mid + 1;
            } else{
                end = mid - 1;
            }
        }
        return false;
    }
}


