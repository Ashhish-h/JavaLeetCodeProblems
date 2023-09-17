package Math;

public class PalindromeNumber_9 {
    public boolean isPalindrome(int x) {
        int n = x;
        int rev = 0;
        while (x > 0) {
            int d = x % 10;
            rev = rev * 10 + d;
            x /= 10;
        }
        if (n == rev)
        {
            return true;
        } else{
            return false;
        }
    }
}
