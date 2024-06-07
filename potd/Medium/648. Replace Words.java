class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        HashSet<String> dict=new HashSet<>(dictionary);
        String[] words=sentence.split(" ");
        StringBuilder result=new StringBuilder();
        for(String word : words){
            if(result.length() > 0)
                result.append(" ");
            result.append(rootWord(dict,word));
        }
        return result.toString();
    }
    private static String rootWord(Set<String> dict , String word){
        for(int i=1; i<word.length(); i++){
            String root=word.substring(0,i);
            if(dict.contains(root)){
                return root;
            }
        }
        return word;
    }
}
