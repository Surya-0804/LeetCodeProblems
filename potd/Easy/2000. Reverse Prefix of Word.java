class Solution {
    public String reversePrefix(String word, char ch) {
        int index=-1;
        for(int i=0 ; i<word.length() ; i++){
            if(word.charAt(i)==ch){
                index=i;
                break;
            }
        }
        if(index==-1)
            return word;
        StringBuilder answer= new StringBuilder();
        for(int i=index;i>=0;i--){
            answer.append(word.charAt(i));
        }
        for(int i=index+1;i<word.length();i++){
            answer.append(word.charAt(i));
        }
        return answer.toString();
    }
}
