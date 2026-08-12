class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freqMap = new HashMap<>();
        HashSet<Integer> uniqueElements = new HashSet<>();
        for(int i : nums){
            freqMap.put(i,freqMap.getOrDefault(i,0)+1);
            uniqueElements.add(i);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->b[1]-a[1]);
        for(int i : uniqueElements){
            int[] pairList = {i,freqMap.get(i)};
            pq.offer(pairList);
        }
        int[] ans = new int[k];
        for(int i = 0 ; i<k ; i++){
            int[] pair = pq.poll();
            ans[i] = pair[0];
        }
        return ans;
    }
}
