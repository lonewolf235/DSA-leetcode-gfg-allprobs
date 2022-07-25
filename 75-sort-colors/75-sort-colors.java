class Solution {
    public void sortColors(int[] nums) {
        int len=nums.length;
       Arrays.sort(nums);
        for(int k:nums){
            System.out.print(k+",");
        }
    }
}