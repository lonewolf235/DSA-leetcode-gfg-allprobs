class Solution {
    public int maxArea(int[] height) {

        // Intially the max area is 0
        int maxArea = 0; 
        // The First pointer is started at 0th index
        int pointer1 = 0; 
        // The Second pointer is started at the last index
        int pointer2 = height.length - 1; 
        
        // Loop till the pointers are inside the range given
        while(pointer1 < pointer2){
            // If the value at the pointer1 is smaller, then
            if(height[pointer1] < height[pointer2]){
                maxArea = Math.max(maxArea, height[pointer1] * (pointer2 - pointer1));
                pointer1 += 1; // Decrease the index of pointer1
            }
            // If the value at the pointer2 is smaller, then
            else{
                maxArea = Math.max(maxArea, height[pointer2] * (pointer2 - pointer1));
                pointer2 -= 1; // Decrease the index of pointer2
            }
        }
        // Return the instance that gave us the maximum value
        return maxArea;
    }
}