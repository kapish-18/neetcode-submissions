class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int longest = 0;
        for(int i : nums){
            // if statement here to detect if the element is beginning of a sequence or it has numbers below it
            if (!set.contains(i - 1)) {
                int count = 0;
                int num = i;
                while(set.contains(num)){
                    count++;
                    num++;
                }
                if(longest<count){longest = count;}
            }

        }
        return longest;
    }
}
