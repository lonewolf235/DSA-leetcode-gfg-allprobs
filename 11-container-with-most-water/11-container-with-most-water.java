class Solution {
    public int maxArea(int[] height) {
        int leftPointer = 0;
        int rightPointer = height.length - 1;
        int maxWaterInContainer = 0;
        while(leftPointer < rightPointer){
            
            int waterContained = 0;
            
            if(height[leftPointer] < height[rightPointer]){
                waterContained = height[leftPointer] * (rightPointer - leftPointer);
                leftPointer++;
            }else{
                waterContained = height[rightPointer] * (rightPointer - leftPointer);
                rightPointer--;
            }
            
            maxWaterInContainer = Math.max(maxWaterInContainer, waterContained);
        }
        return maxWaterInContainer;
        
    }
}