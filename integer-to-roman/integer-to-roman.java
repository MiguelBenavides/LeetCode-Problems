class Solution {
    public String intToRoman(int num) {
        
        StringBuilder result = new StringBuilder();
        
        HashMap<Integer, String> roman = new HashMap<Integer, String>();
        roman.put(1, "I");
        roman.put(4, "IV");
        roman.put(5, "V");
        roman.put(9, "IX");
        roman.put(10, "X");
        roman.put(40, "XL");
        roman.put(50, "L");
        roman.put(90, "XC");
        roman.put(100, "C");
        roman.put(400, "CD");
        roman.put(500, "D");
        roman.put(900, "CM");
        roman.put(1000, "M");
        
        ArrayList<Integer> masks = new ArrayList<Integer>();
        masks.add(1000);
        masks.add(900);
        masks.add(500);
        masks.add(400);
        masks.add(100);
        masks.add(90);
        masks.add(50);
        masks.add(40);
        masks.add(10);
        masks.add(9);
        masks.add(5);
        masks.add(4);
        masks.add(1);
        
        while (num != 0) {
            int mask = masks.remove(0);
            int temp = num / mask;
            num %= mask;
            while (temp != 0) {
                result.append(roman.get(mask));
                temp--;
            }
        }
        
        return result.toString();
    }
}