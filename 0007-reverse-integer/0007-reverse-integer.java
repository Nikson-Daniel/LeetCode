class Solution {
    public int reverse(int x) {

        long result = 0;
        int duplicate = x;

        while(duplicate!=0){
            int val = duplicate%10;
            result = (result*10)+val;
            duplicate = duplicate/10;

        
        }

        if(result > Math.pow(2,31)-1|| result < -Math.pow(2,31)){
            return 0;
        }else{
            return (int)result;
        }
            
        
    }
}