class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int counter = 0;

        for (int i = 0; i < nums.size(); i++){

            for (int j = i+1; j < nums.size(); j++){
                boolean isTrue = true;



                if(nums.get(i)+nums.get(j) < target){
                    isTrue=false;
                }

                if (!isTrue){
                    counter++;
                }

            }

        }

        return counter;
    }
}