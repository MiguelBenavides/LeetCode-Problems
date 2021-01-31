class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> answer = new ArrayList<Boolean>();
        if (queries == null || pattern == null) {
            return answer;
        }
        for (String querie : queries) {
            answer.add(camelMatchString(querie, pattern));
        }
        return answer;
    }
    public boolean camelMatchString(String querie, String pattern) {
        int pos1 = 0;
        int pos2 = 0;
        int n = querie.length();
        int m = pattern.length();
        while (pos1 < n && pos2 < m) {
            if (querie.charAt(pos1) == pattern.charAt(pos2)) {
                pos1++;
                pos2++;
            }
            else {
                if (Character.isLowerCase(querie.charAt(pos1))) {
                    pos1++;
                }
                else {
                    return false;
                }
            }
            if (pos1 == n && pos2 == m) {
                return true;
            }
        }
        while (pos1 < n && pos2 == m) {
            if (Character.isLowerCase(querie.charAt(pos1))) {
                pos1++;
            }
            else {
                return false;
            }
        }
        if (pos1 == n && pos2 == m) {
            return true;
        }
        return false;
    }
}