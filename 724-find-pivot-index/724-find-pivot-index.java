class Solution {
    public int pivotIndex(int[] nums) {
        //Get the sum of the array
        int total = 0;
        for(int num : nums){
            total += num;
        }
        
        //Find pivot starting from the left
        int leftSum = 0;
        for(int i = 0; i < nums.length; i++){
            int rigthSum = total - nums[i] - leftSum;
            if(leftSum == rigthSum){
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}