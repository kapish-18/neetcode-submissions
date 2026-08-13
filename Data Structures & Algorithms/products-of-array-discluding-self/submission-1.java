class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prodArray = new int[nums.length];
        int zeroCount = 0;
        int prod = 1;
        for(int i : nums){
            if(i==0){
                zeroCount+=1;
            }
            if(zeroCount > 1){
                return new int[nums.length];
            }
            if(i!=0){
                prod*=i;
            }
        }
        for(int i = 0 ; i<nums.length ; i++){
            if(nums[i]!=0 && zeroCount == 1){
                prodArray[i] = 0;
            }
            else if(nums[i]==0){
                prodArray[i]=prod;
            }
            else if(nums[i]!=0 && zeroCount == 0){
                prodArray[i] = prod/nums[i];
            }
        }
        return prodArray;
    }
}  
