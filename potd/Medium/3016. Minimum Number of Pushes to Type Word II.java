class Solution {
    public int minimumPushes(String word) {
        int[] freq=new int[26];
        for(char ch: word.toCharArray()){
            freq[ch-'a']++;
        }
        Integer[] sortFreq=new Integer[26];
        for(int i=0; i<26; i++){
            sortFreq[i]=freq[i];
        }
        Arrays.sort(sortFreq,Collections.reverseOrder());
        int totalPress=0;
        for(int i=0; i<26; i++){
            if(sortFreq[i]==0)
                break;
            totalPress+=(i/8 +1)*sortFreq[i];
        }
        return totalPress;
    }
}
