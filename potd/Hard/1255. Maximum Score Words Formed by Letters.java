class Solution {
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        int[] count=new int[26];
        for(char ch : letters){
            count[ch - 'a']++;
        }
        return solve(0, words, count, score);
    }

    private int solve(int i , String[] words , int[] count , int[] score){
        if(i >= words.length)
            return 0;
        
        int wordScore=0;
        boolean valid=true;
        int[] newLetter=count.clone();
        for(char ch : words[i].toCharArray()){
            if(newLetter[ch - 'a'] > 0){
                newLetter[ch - 'a']--;
                wordScore+=score[ch - 'a'];
            }
            else{
                valid=false;
                break;
            }
            
        }
        int answer=0;
        if(valid){
            answer= wordScore + solve(i+1, words,newLetter , score);
        }
        answer= Math.max(answer, solve(i+1, words,count , score));
        return answer;
    }
}
