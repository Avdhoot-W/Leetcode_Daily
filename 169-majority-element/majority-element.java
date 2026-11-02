class Solution {
    public int majorityElement(int[] nums) {
     int count = 1;
     int n = (nums.length - 1) / 2;
      HashMap<Integer, Integer> hm = new HashMap<>();
      for(int i = 0;i < nums.length; i++){
        if(!hm.containsKey(nums[i])){
            hm.put(nums[i],count);
        }else{
            hm.put(nums[i],hm.get(nums[i]) + 1);
        }
      }
    System.out.println(hm);
        for(int i = 0; i < nums.length; i++){
            if(hm.get(nums[i]) > n ){
                System.out.println(nums[i]);
                return nums[i];
            }
        }


        return 0;



    }

}   

