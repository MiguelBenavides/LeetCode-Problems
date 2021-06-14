class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        if (n == 0)
            return result;
        backtracking(result, n, "", 0, 0);
        return result;
    }
    
    public void backtracking(List<String> result, int n, String parenthesis, int opens, int closes) {
        //base case
        if (parenthesis.length() == n * 2) {
            result.add(parenthesis);
            return;
        }
        if (opens < n) backtracking(result, n, parenthesis + "(", opens + 1, closes);
        if (closes < opens) backtracking(result, n, parenthesis + ")", opens, closes + 1);
    }
}