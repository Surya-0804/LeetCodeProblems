class Solution {
    public String reverseParentheses(String s) {
        Stack<Integer> stack=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch == '('){
                stack.push(sb.length());
            }else if(ch == ')'){
                int start=stack.pop();
                reverse(sb,start,sb.length()-1);
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    private static void reverse(StringBuilder sb, int start, int end){
        while(start<end){
            char temp=sb.charAt(start);
            sb.setCharAt(start++,sb.charAt(end));
            sb.setCharAt(end--,temp);
        }
    }
}
