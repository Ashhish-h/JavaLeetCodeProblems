package Math;
class PowerOfThree_326{
    public boolean isPowerOfThree(int n) {
        while(n>=3) {
            if(n%3!=0) return false;
            n/=3;
        }
        return n==1;
    }
}