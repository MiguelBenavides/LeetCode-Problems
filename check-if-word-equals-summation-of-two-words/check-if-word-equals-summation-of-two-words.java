class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        //Convert firstWord to firstInteger
        int firstInteger = 0;
        for(int i = 0; i < firstWord.length(); i++){
            firstInteger *= 10;
            firstInteger += firstWord.charAt(i) - 'a';
        }
        
        //Convert secondWord to secondInteger
        int secondInteger = 0;
        for(int i = 0; i < secondWord.length(); i++){
            secondInteger *= 10;
            secondInteger += secondWord.charAt(i) - 'a';
        }
        
        //Convert targetWord to targetInteger
        int targetInteger = 0;
        for(int i = 0; i < targetWord.length(); i++){
            targetInteger *= 10;
            targetInteger += targetWord.charAt(i) - 'a';
        }
        
        //Add firstInteger and secondInteger and compare against targetWord
        return firstInteger + secondInteger == targetInteger;
    }
}