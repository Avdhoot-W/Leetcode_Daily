class Solution {
    public int[] twoSum(int[] nums, int target) {
      HashMap<Integer, Integer> hm = new HashMap<>();
      int count = 0;
      for(int i = 0; i < nums.length; i++){
        int compliment = target - nums[i];
        if(!hm.containsKey(compliment)){
                hm.put(nums[i], count++);
        }else{
            
            return new int[]{i, hm.get(compliment)};
        }

      }
      return new int[]{};
    }
}