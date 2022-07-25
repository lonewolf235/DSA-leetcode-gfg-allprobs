class Solution {
    public void sortColors(int[] nums) {
        int len=nums.length;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++)
            {
            if(nums[i]<=nums[j]){
                continue;
            }
            else
            {
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
            }
        }
        }
        for(int k:nums){
            System.out.print(k+",");
        }
    }
}