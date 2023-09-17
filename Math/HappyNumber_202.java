package Math;

public class HappyNumber_202 {
    public boolean isHappy(int n) {
        int sq1 = n;
        int sq2 = n;
        do{
            sq1 = sqrt(sq1);
            sq2 = sqrt(sqrt(sq2));
        }while(sq1 != sq2);
        
        return sq1 == 1;
    }

    private int sqrt(int num){
        int ans = 0;
        while(num > 0){
            int remainder = num % 10;
            ans += remainder * remainder;
            num /= 10;
        }
        return ans;
    }
}
