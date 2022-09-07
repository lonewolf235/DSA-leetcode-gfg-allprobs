class Solution {
    public int maxArea(int[] height) {
        
    int start=0;
    int end=height.length-1;
    int maxWater=Integer.MIN_VALUE;
    while(start<end)
    {
        maxWater=Math.max(maxWater,Math.min(height[start],height[end])*(end-start));
        if(height[start]>height[end])
            end--;
        else 
            start++;
    }
    return maxWater;
  }
}