class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        HashSet<Character> set = new HashSet<>();
        int longestSubstring = 1;
        char[] sArray = s.toCharArray();
        if(sArray.length==0){
            return 0;
        }
        while(i<s.length() && j<s.length()){
            if(set.contains(sArray[j])){
                longestSubstring = Math.max(set.size(),longestSubstring);
                set.remove(sArray[i]);
                i++;
            }
            else{
                set.add(sArray[j]);
                j++;
            }
            longestSubstring = Math.max(set.size(),longestSubstring);
        }
        return longestSubstring;
    }
}