class Solution {
    public int findDuplicate(int[] nums) {
        int[] arr=new int[nums.length-1];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]-1]++;
        }
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            if(arr[i]>1)
            {
                count=i+1;
                break;
            }
        }
        return count;
    }
}