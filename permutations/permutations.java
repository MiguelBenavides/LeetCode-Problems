class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        int listSize;
        result.add(new ArrayList<Integer>());
        
        for (int num : nums) {
            listSize = result.size();
            while (listSize > 0) {
                List<Integer> permutation = result.remove(0);
                for (int i = 0; i <= permutation.size(); i++) {
                    List<Integer> newPerm = new ArrayList<Integer>(permutation);
                    newPerm.add(i, num);
                    result.add(newPerm);
                }
                listSize--;
            }
        }
        
        return result;
    }
}