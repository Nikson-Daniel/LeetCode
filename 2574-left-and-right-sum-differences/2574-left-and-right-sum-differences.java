class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] result = new int[nums.length];
        
        
        for(int i = 0; i < nums.length; i++){
            int leftInt = 0;
            int rightInt = 0;
            
            for(int j = 0; j <= i; j++){
                leftInt += nums[j];
            }
            
            for(int k = i; k < nums.length; k++){
                rightInt+=nums[k];
            }
            
            result[i]=Math.abs(leftInt-rightInt);

        
        
        }
        
        return result;
        
    }
}