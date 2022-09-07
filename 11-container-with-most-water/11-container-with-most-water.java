class Solution {
    public int maxArea(int[] height) {
        int h=height.length;
        int i=0,j=h-1;
        int maxarea=0,area;
        while(j>i){
            if(height[i]>height[j]){
                area=height[j]*(j-i);
            j--;
            }
            else{
                area=height[i]*(j-i);
            i++;
            
        }
            maxarea=Math.max(area,maxarea);
            
    }
        return maxarea;
}
}