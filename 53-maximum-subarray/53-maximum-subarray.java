class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) throw new IllegalArgumentException("Invalid parameter: null or empty");
        
        int result = nums[0];
        int currSum = result;
        for(int i = 1; i < nums.length; i++){
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