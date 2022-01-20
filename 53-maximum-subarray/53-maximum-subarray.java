class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) throw new IllegalArgumentException("Invalid parameter: null or empty");
        
        // Start always with the sum of the first value
        int result = nums[0];
        int currSum = 0;
        for(int i = 0; i < nums.length; i++){
            // If at any point the current sum drops below 0, start over the subarray
            if(currSum <= 0){
                currSum = nums[i];
            } else {
                currSum += nums[i];
            }
            result = Math.max(result, currSum);
        }
        
        return result;
    }
}