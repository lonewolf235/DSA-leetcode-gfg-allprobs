class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans=new int[nums.length];
        long product=1;
        int zerocount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
            {
                zerocount++;
                continue;
            }
            product*=nums[i];
        }if(zerocount==0){
         for(int i=0;i<nums.length;i++){
            
            ans[i]=(int)(product/nums[i]);}
        }
        else if(zerocount==nums.length||zerocount>1)
            for(int i=0;i<nums.length;i++){
            
            ans[i]=0;}
        else 
            for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
            ans[i]=(int)product;
            else 
                ans[i]=0;}
          return ans;  
        }
        
    
}