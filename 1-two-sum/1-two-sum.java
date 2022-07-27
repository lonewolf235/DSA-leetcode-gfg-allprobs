class Solution {
    public int[] twoSum(int[] nums, int target) {
   
		HashMap<Integer,Integer>mp = new HashMap<>();
         int res[]={0,0};
        
		for(int i=0;i<nums.length;i++) {
			if(mp.containsKey(target-nums[i])) {
				res[1]=i;
				res[0]=mp.get(target-nums[i]);
			}
			mp.put(nums[i],i);
    }
   return res;
    }}