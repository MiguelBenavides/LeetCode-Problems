public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int bits = 31;
        
        // Split binary in half and swap its bits between the MSB "i" and the LSB "j" until you reach the middle
        for(int i = bits; i > bits / 2; i--){
            int j = bits - i;
            n = swapBits(n, i ,j);
        }
        
        return n;
    }
    
    private int swapBits(int n, int i, int j){
        // Extract the i-th and j-th bits, and see if they differ.
        if (((n >>> i) & 1) != ((n >>> j) & 1)){
            // i-th and j-th bits differ. We will swap them by flipping their values.
            // Select the bits to flip with bitMask. Since n^1 = 0 when n = 1 and 1
            // when n = 0, we can perform the flip XOR.
            int bitMask = (1 << i) | (1 << j);
            n ^= bitMask;
        }
        return n;
    }
}