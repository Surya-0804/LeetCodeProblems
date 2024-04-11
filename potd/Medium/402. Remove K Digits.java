class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack=new Stack<>();
        for(char digit:num.toCharArray()){
            while(!stack.isEmpty() && k>0 && stack.peek()>digit){
                stack.pop();
                k--;
            }
            stack.push(digit);
        }
        while(k>0 && !stack.isEmpty()){
            stack.pop();
            k--;
        }
        StringBuilder s=new StringBuilder();
        while(!stack.isEmpty()){
            s.append(stack.pop());
        }
        s.reverse();
        while(s.length()>0 && s.charAt(0)=='0')
            s.deleteCharAt(0);
        return (s.length()>0)?s.toString():"0";
    }
}
