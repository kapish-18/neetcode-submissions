class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int i = 0;
        int j = s1.length()-1;
        HashMap<Character,Integer> maps1 = new HashMap<>();
        for(char c : s1.toCharArray()){
            maps1.put(c,maps1.getOrDefault(c,0)+1);
        }

        while(j<s2.length()){
            HashMap<Character,Integer> windowMap = new HashMap<>();
            int counter = i;
            while(counter<=j){
                windowMap.put(s2.charAt(counter),windowMap.getOrDefault(s2.charAt(counter),0)+1);
                counter++;
            }
            if(windowMap.equals(maps1)){
                return true;
            }
            i++;
            j++;
        }
        return false;

    }
}
