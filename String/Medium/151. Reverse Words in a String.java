class Solution {
    public String reverseWords(String s) {
        String[] words=s.trim().split("\\s+");
        StringBuilder str=new StringBuilder(s.length());
        for(int i=words.length-1;i>=0;i--){
            if(i==0){
                str.append(words[i]);
            }
            else{
                str.append(words[i]);
                str.append(" ");
            }
        }
        return str.toString();
        
    }
}
