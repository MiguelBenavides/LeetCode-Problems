class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        
        int replaceIndex = 1;
        int counter = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[replaceIndex] = nums[i];
                replaceIndex++;
                counter++;
            }
        }
        
        return counter;
    }
}