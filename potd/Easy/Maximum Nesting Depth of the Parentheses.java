class Solution {
    public int maxDepth(String s) {
        int count=0;
        int max_depth=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                count++;
                max_depth=(max_depth<count)? count: max_depth;
            }
            if(ch==')'){
                count--;
            }
        }
        return max_depth;
    }
}
