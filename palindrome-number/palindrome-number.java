import java.lang.Math;

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int numDigits = (int)Math.floor(Math.log10(x)) + 1;
        int msdMask = (int)Math.pow(10, numDigits - 1);
        while (x != 0) {
            if (x / msdMask != x % 10) return false;
            x %= msdMask;
            x /= 10;
            msdMask /= 100;
        }
        return true;
    }
}