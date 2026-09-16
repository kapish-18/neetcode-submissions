class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        HashMap<Character, Character> bracketMap = new HashMap<>();
        bracketMap.put(']', '[');
        bracketMap.put('}', '{');
        bracketMap.put(')', '(');

        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {

            if (bracketMap.containsKey(c)) {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if (top != bracketMap.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}