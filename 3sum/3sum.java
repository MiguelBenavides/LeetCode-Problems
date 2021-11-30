class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Collections.sort(nums)
        // -4 -1 -1 0 1 2
        // -1 1? 1 0
        // -1 1? 2 -1
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (nums.length < 3) return res;
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue;
            ArrayList<ArrayList<Integer>> twoSumList = twoSum(nums, i, 0 - nums[i]);
            for (ArrayList<Integer> ls : twoSumList) {
                ls.add(nums[i]);
                Collections.sort(ls);
                res.add(ls);
            }
        }
        
        return res;
    }
    
    public ArrayList<ArrayList<Integer>> twoSum(int[] nums, int index, int target) {
        Set<Integer> set = new HashSet<>();
        Set<ArrayList<Integer>> res = new HashSet<>();
        
        for (int i = index + 1; i < nums.length; i++) {
            if (set.contains(target-nums[i])) {
                ArrayList<Integer> cur = new ArrayList<>();
                cur.add(nums[i]);
                cur.add(target-nums[i]);
                res.add(cur);
            }
            set.add(nums[i]);
        }
        
        return new ArrayList<>(res);
    }
}