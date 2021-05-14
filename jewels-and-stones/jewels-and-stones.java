class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int totalJewels = 0;
        HashSet<Character> jewelTypes = new HashSet<Character>();
        
        //Fill a list of types of jewels
        for(int i = 0; i < jewels.length(); i++){
            jewelTypes.add(jewels.charAt(i));
        }
        
        //Iterate trought the rocks and check if each is in the list
        for(int i = 0; i < stones.length(); i++){
            if (jewelTypes.contains(stones.charAt(i))) {
                totalJewels++;
            }
        }
        
        return totalJewels;
    }
}