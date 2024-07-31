class Solution {
    public String removeOuterParentheses(String s) {
        int balance=0;
        StringBuilder answer=new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch == '('){
                if(balance>0){
                    answer.append(ch);
                }
                balance++;
            }else{
                balance--;

                if(balance>0){
                    answer.append(ch);
                }
            }
        }
        return answer.toString();
    }
}
