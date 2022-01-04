class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int var = target - nums[i];
            if (map.containsKey(var)) {
                return new int[] {map.get(var), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("There is no solution for these inputs");
    }
}