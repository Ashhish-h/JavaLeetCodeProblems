package Math;
class PowerOfFour_342{
    public boolean isPowerOfFour(int n) {
        while(n>=4) {
            if(n%4!=0) return false;
            n/=4;
        }
        return n==1;
    }
}