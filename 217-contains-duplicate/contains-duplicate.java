class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(hm.containsKey(nums[i])){
                return true;
            }else{
                hm.put(nums[i], count++);
            }
        }
        return false;
    }
}