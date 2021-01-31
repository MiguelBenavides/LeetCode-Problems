class Solution {
    public int longestAwesome(String s) {
        int n = s.length(), x = 0, res = 0;
        HashMap<Integer,Integer> h = new HashMap<>();
        h.put(0, -1);
        for (int i = 0; i < n; i++) {
            x ^= 1 << (s.charAt(i) - '0');
            if (h.containsKey(x)) {
                res = Math.max(res, i - h.get(x));
            } else {
                h.put(x, i);
            }
            for (int j = 0; j < 10; j++) {
                if (h.containsKey(x ^ (1 << j))) {
                    res = Math.max(res, i - h.get(x ^ (1 << j)));
                }
            }
        }
        return res;
    }
}