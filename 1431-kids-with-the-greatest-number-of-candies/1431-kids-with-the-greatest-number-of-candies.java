class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        List<Boolean> result = new ArrayList<>();
        
        for(int i = 0; i < candies.length; i++){
            
            int val = candies[i]+extraCandies;
            result.add(i, true);
            
            for(int j = 0; j < candies.length; j++){
                
                if(candies[j] > val){
                    
                    result.set(i, false);
                    
                }
                
            }
            
            
        }
        
        return result;
        
    }
}