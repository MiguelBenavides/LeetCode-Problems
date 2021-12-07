class Solution {
    public int romanToInt(String s) {
        if (s == null || s.length() == 0) return 0;
        
        HashMap<Character, Integer> roman = new HashMap<Character, Integer>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
        
        int result = roman.get(s.charAt(s.length() - 1));
        int last = result;
        for (int i = s.length() - 2; i >= 0; i--) {
            int current = roman.get(s.charAt(i));
            if (current < last) {
                result -= current;
                last = 0;
            } else {
                result += current;
                last = current;
            }
        }
        
        return result;
    }
}