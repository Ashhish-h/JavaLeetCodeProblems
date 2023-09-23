package Math;
class UglyNumber_263{
    public boolean isUgly(int n) {
        if(n <= 0)
            return false;
        n = fac(n, 2);
        n = fac(n, 3);
        n = fac(n, 5);
        return n == 1;
    }
    public int fac(int n, int div){
        while(n % div == 0) n /= div;
        return n;
    }
}