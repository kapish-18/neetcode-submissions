class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for(String s : tokens){
            if(s.equals("+")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a+b);
                continue;
            }
            if(s.equals("-")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a-b);
                continue;
            }
            if(s.equals("*")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a*b);
                continue;
            }
            if(s.equals("/")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a/b);
                continue;
            }
            stack.push(Integer.parseInt(s));
        }
        return stack.pop();
    }
}
