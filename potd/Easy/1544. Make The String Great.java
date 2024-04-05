class Solution {
    public String makeGood(String s) {
        Stack<Character> stack=new Stack<>();
        for(char ch: s.toCharArray()){
            if(!stack.isEmpty() && Math.abs(ch-stack.peek())==32){
                stack.pop();
            }
            else{
                stack.push(ch);
            }
        }
        StringBuilder answer=new StringBuilder();
        for(int i=0;i<stack.size();i++){
            answer.append(stack.get(i));
        }
        return answer.toString();
    }
}
