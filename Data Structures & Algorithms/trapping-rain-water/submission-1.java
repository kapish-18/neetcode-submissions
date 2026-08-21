class Solution {
    public int trap(int[] height) {
        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];

//building leftMax
        for(int i = 0; i<height.length ; i++){
            if(i == 0){
                leftMax[i] = 0;
                continue;
            }
            leftMax[i] = Math.max(leftMax[i-1],height[i-1]);
        }

//building rightMax
        int index = height.length-1;
        for(int i = 0; i<height.length ; i++){
            if(i==0){
                rightMax[index]=0;
                index--;
                continue;
            }
            rightMax[index] = Math.max(rightMax[index+1],height[index+1]);
            index--;
        }

//calculate area
        int totalArea = 0;
        for(int i = 0; i<height.length ; i++){
            if(Math.min(leftMax[i],rightMax[i]) - height[i]>=0){
                totalArea+=Math.min(leftMax[i],rightMax[i]) - height[i];
            }
        }

        return totalArea;
    
    }
}
