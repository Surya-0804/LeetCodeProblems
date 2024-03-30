class Solution {
    public String reverseVowels(String s) {
        char[] letter=s.toCharArray();
        int start=0;
        int end=s.length()-1;
        String vowels="aeiouAEIOU";
        while(start<end){
            while(start<end && vowels.indexOf(letter[start])==-1){
                start++;
            }
            while(start<end && vowels.indexOf(letter[end])==-1){
                end--;
            }
            char temp=letter[start];
            letter[start]=letter[end];
            letter[end]=temp;

            start++;
            end--;
        }
        String answer=new String(letter);
        return answer;
    }
}
