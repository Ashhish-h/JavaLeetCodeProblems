package Math;
class PowerOfTwo{
    public boolean isPowerOfTwo(int n) {
        if(n == 1){
            return true;
        }
        if(n % 2 != 0){
            return false;
        }
        if(n <= 0){
            return false;
        }
        int power = 0, quotient = 0, n2 = n;
        while(n != 1){
            quotient = n / 2;
            power++;
            n = quotient;
        }
        if(Math.pow(2, power) == n2){
            return true;
        }
        return false;
    }
}