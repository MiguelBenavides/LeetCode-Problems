class Solution {
    public int maxNumberOfBalloons(String text) {
        //Put the word "balloon" in a HashMap and count each character
        HashMap<Character, Integer> balloonMap = new HashMap<>();
        String balloon = "balloon";
        for(char c : balloon.toCharArray()){
            if(balloonMap.containsKey(c)){
                balloonMap.put(c, balloonMap.get(c) + 1);
            } else {
                balloonMap.put(c, 1);
            }
        }
        
        //Put the word text in a HashMap and count each character (only for balloon letters)
        HashMap<Character, Integer> textMap = new HashMap<>();
        for(char c : text.toCharArray()){
                if(textMap.containsKey(c)){
                    textMap.put(c, textMap.get(c) + 1);
                } else {
                    textMap.put(c, 1);
                }
        }
        
        //Maximum amount of balloons cannot be bigger than initial text
        int result = text.length();
        //Maximum number of balloons gets bottlenecked by the least available letter in text
        for(char c : balloonMap.keySet()){
            result = Math.min(result, textMap.getOrDefault(c, 0) / balloonMap.get(c));
        }
        
        return result;
    }
}