class Solution {
    public List<String> commonChars(String[] words) {
        int[] final_count=new int[26];
        List<String> common=new ArrayList<>();
        for(char ch : words[0].toCharArray()){
            final_count[ch-'a']++;
        }

        for(int i=1; i<words.length; i++){
            int[] count=new int[26];
            for(char ch : words[i].toCharArray()){
                count[ch-'a']++;
            }

            for(int j=0; j<26; j++){
                final_count[j]=Math.min(final_count[j],count[j]);
            }
        }
        for(int i=0; i<26; i++){
            int c=final_count[i];

            while(c-- >0){
                common.add(String.valueOf((char) ('a' + i)));
            }
        }
        return common;
    }
}
