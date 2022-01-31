class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        //Mark existing nums with negative under their respective index
        for(int n : nums){
            int i = Math.abs(n) - 1;
            nums[i] = Math.abs(nums[i]) * -1;
        }
        
        //Add still positive numbers to the list, since those were the missing ones
        List<Integer> result = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                result.add(i + 1);
            }
        }
        
        return result;
    }
}