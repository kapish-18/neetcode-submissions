class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> megaMap = new HashMap<>();
        for(String s : strs){
            char[] toSorts = s.toCharArray();
            Arrays.sort(toSorts);
            String sorteds = new String(toSorts);
            if(megaMap.containsKey(sorteds)){
                megaMap.get(sorteds).add(s);
            }
            else{
                megaMap.put(sorteds,new ArrayList<>());
                megaMap.get(sorteds).add(s);
            }
        }
        return new ArrayList<>(megaMap.values());
    }
}
