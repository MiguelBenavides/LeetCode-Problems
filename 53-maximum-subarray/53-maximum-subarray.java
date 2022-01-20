class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) throw new IllegalArgumentException("Invalid parameter: null or empty");
        
        int result = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i = 0; i < nums.length; i++){
            currSum += nums[i];
            result = Math.max(result, currSum);
            
            // If at any point the current sum drops below 0, start over the subarray
            if(currSum < 0) currSum = 0;
        }
        
        return result;
    }
}