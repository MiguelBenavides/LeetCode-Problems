class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> visitedNumbers = new HashSet<Integer>();
        
        while (!visitedNumbers.contains(n)) {
            visitedNumbers.add(n);            
            n = squaredDigits(n);
            if (n == 1) return true;
        }
        return false;
    }
    
    public int squaredDigits(int n) {
        int output = 0;
        while (n > 0) {
            int digit = n % 10;
            output += Math.pow(digit,2);
            n /= 10;
        }
        return output;
    }
}