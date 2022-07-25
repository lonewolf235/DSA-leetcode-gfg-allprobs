class Solution {
    public void moveZeroes(int[] nums) {
        int len=nums.length;
        int count=0,place=0;
      for(int i=0;i<len;i++){
          if(nums[i]==0)
              count++;
          else
          {
              nums[place++]=nums[i];
          }
      }
        for(int i=place;i<len;i++){
            nums[i]=0;
        }
    }
}