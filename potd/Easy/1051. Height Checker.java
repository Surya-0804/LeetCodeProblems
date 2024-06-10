class Solution {
    public int heightChecker(int[] heights) {
        int[] sorted=Arrays.copyOf(heights,heights.length);
        Arrays.sort(sorted);
        int answer=0;
        for(int i=0; i<heights.length; i++){
            if(sorted[i]!=heights[i])
                answer++;
        }
        return answer;
    }
}
