public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int HammingWeight = 0;
        while(n != 0){
            if((n & 1) == 1){
                HammingWeight++;
            }
            n = n >>> 1; //Bit shift right applying 0's to the left regardless if the number is positive or negative
        }
        return HammingWeight;
    }
}