class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;
        int i = 0;
        int j = heights.length-1;
        while(i<j){
            if((j-i)*Math.min(heights[i],heights[j]) > maxArea){
                maxArea = (j-i)*Math.min(heights[i],heights[j]);
            }
            if(heights[i]>heights[j]){
                j--;
            }
            else if(heights[j]>heights[i]){
                i++;
            }
            else if(heights[i]==heights[j]){
                i++;
                j--;
            }
        }
        return maxArea;
    }
}
