import java.util.HashSet;
import java.lang.Math;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> seen = new HashSet<>();
        int counter = 0, result = 0;
        boolean flag = false;
        for (int i = 0; i < s.length(); i++) {
            flag = false;
            for (int j = i; j < s.length() && !flag; j++) {
                if (seen.contains(s.charAt(j))) {
                    result = Math.max(result, counter);
                    seen.clear();
                    counter = 0;
                    flag = true;
                } else {
                    seen.add(s.charAt(j));
                    counter++;
                }
            }
            if (!flag) break;
        }
        return Math.max(result, counter);
    }
}