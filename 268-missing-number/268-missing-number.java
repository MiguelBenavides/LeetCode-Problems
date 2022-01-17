class Solution {
    public int missingNumber(int[] nums) {
        //Calculate the summation formula of n
        int n = nums.length;
        int sum = (n * (n + 1)) / 2;
        
        //The missing number will always be the summation minus all elements of nums
        for(int i = 0; i < n; i++){
            sum -= nums[i];
        }
        
        return sum;
    }
}