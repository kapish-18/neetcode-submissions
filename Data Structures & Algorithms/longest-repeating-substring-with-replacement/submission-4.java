class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> count = new HashMap<>();
        int i = 0;
        int j = 0;
        int maxf = 0;
        int longest = 0;
        while(j<s.length()){
            count.put(s.charAt(j),count.getOrDefault(s.charAt(j),0)+1);
            maxf = Math.max(maxf,count.get(s.charAt(j)));
           if((j-i+1) - maxf <= k){
                longest = Math.max(longest,(j-i)+1);
                j++;
           }
           else if((j-i+1)-maxf > k){
            while((j-i+1)-maxf > k){
                count.put(s.charAt(i),count.get(s.charAt(i))-1);
                i++;    
            }
            j++;
           }
        }
        return longest;
    }
}
