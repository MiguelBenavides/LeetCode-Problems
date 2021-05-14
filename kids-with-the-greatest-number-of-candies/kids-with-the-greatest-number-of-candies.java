import java.io.*;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length - 1;
        int maxCandie = 0;
        List<Boolean> result = new ArrayList<Boolean>();
        
        //get the max candy count
        for(int i = 0; i <= n; i++){
            maxCandie = Math.max(candies[i], maxCandie);
        }
        
        //iterate giving all extraCandies to each kid and compare against max candy count
        for(int i = 0; i <= n; i++){
            result.add(candies[i] + extraCandies >= maxCandie);
        }
        
        return result;
    }
}