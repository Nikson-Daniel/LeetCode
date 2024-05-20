class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        
        List<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            arrayList.add(index[i], nums[i]);
        }
        
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            result[i] = arrayList.get(i);
        }
        
        return result;
        
    }
}