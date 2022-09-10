class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> li=new ArrayList<Integer>();
        Arrays.sort(nums);
        if(nums.length<=1)
            return li;
        else{
            for(int i=1;i<nums.length;i++){
                if(nums[i]==nums[i-1])
                    li.add(nums[i]);
            }   
        }
        return li;
    }
}