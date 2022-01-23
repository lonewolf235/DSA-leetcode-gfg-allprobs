class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum=Integer.MIN_VALUE;
        int sum=0;
        int maxvalue=nums[0];
       for(int i=0;i<nums.length;i++){
           if(nums[i]>maxvalue)
               maxvalue=nums[i];
           sum+=nums[i];
             if(sum>maxsum)
               maxsum=sum;
           if(sum<0)
               sum=0;
         
           
       } if(maxvalue>0)
        return maxsum;
        else
            return maxvalue;
    }
}