class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val)
                continue;
            else
                al.add(nums[i]);
        }
        for(int i=0;i<al.size();i++){
            nums[i]=al.get(i);
        }
        return al.size();
    }
}