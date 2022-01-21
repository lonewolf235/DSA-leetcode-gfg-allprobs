class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int flag =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                flag++;
            if(nums[i]!=0)
            prod = prod * nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(flag==0){
                nums[i]= prod/nums[i];
            }
            else if(flag==1){
                if(nums[i]==0)
                    nums[i]=prod;
                else
                    nums[i]=0;
            }
            else{
                nums[i]=0;
            }    
        }
        return nums;
    }
}