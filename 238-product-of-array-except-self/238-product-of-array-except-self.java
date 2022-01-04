class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        
        //Loop to multiply the right part
        int[] right = new int[len];
        right[len - 1] = 1;
        for(int i = len - 2; i >= 0; i--){
            right[i] = right[i + 1] * nums[i + 1];
        }
        
        //Loop to multiply the left part
        int[] left = new int[len];
        left[0] = 1;
        for(int i = 1; i < len; i++){
            left[i] = left[i - 1] * nums[i - 1];
        }
        
        //Loop to multiply left and right
        for(int i = 0; i < len; i++){
            nums[i] = left[i] * right[i];
        }
        
        return nums;
    }
}