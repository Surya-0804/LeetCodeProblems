class Solution {
    public int minimumDeletions(String s) {
        int minCount=0;
        int bCount=0;
        for(char ch : s.toCharArray()){
            if(ch == 'a'){
                minCount=Math.min(minCount+1, bCount);
            }
            else{
                bCount++;
            }
        }
        return minCount;
    }
}
