class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Deque<Integer> stack = new ArrayDeque<>();
        int max = Integer.MAX_VALUE;
        int i = temperatures.length - 1;
        stack.push(i);
        i--;
        while (i >= 0) {
            if (temperatures[stack.peek()] > temperatures[i]) {
                result[i] = stack.peek() - i;
                stack.push(i);
            } else {
                if (i != temperatures.length - 2) {
                    while (!stack.isEmpty() && !(temperatures[stack.peek()] > temperatures[i])) {
                        stack.pop();
                    }
                    if(!stack.isEmpty()){result[i] = stack.peek() - i;}
                    stack.push(i);
                } else {
                    stack.pop();
                    stack.push(i);
                }
            }
            i--;
        }
        return result;
    }
}
