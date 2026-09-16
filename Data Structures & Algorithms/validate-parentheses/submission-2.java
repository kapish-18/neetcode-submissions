class Solution {
    public boolean isValid(String s) {
        if(s.length()==0){return true;}
        if(s.length()%2 != 0){return false;}
        HashMap<Character,Character> bracketMap = new HashMap<>();
        bracketMap.put(']','[');
        bracketMap.put('}','{');
        bracketMap.put(')','(');
        Deque<Character> stack = new ArrayDeque<>();
        for(char c : s.toCharArray()){
            if(!stack.isEmpty() && bracketMap.containsKey(c)){
                char temp = stack.pop();
                if(temp!=bracketMap.get(c)){
                    return false;
                }
                continue;
            }
            stack.push(c);
        }
        return stack.isEmpty();
    }
}
