package Math;

class FibonacciNumber_509 {
    public int fib(int n) {
        if(n == 1 || n == 0){
            return n;
        }
       return fib(n - 1) + fib(n - 2); 
    }
}
