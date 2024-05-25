class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        Set<String> set=new HashSet<>(wordDict);

        return solve(s,0,set);
    }
    private static List<String> solve(String str, int start, Set<String> set){
        List<String> valid=new ArrayList<>();
        if(start == str.length()){
            valid.add("");
        }
        for(int i=start+1 ; i<=str.length(); i++){
            String pre =str.substring(start, i);
            if(set.contains(pre)){
                List<String> suff= solve(str, i, set);
                for(String suf : suff){
                    valid.add(pre + (suf.equals("")? "" : " ")+suf);
                }
            }
        }
        return valid;
    }
}
