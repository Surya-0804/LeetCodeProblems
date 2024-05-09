class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        long answer=0;
        int dec=0;
        Arrays.sort(happiness);
        for(int i=happiness.length-1 ; i>=happiness.length-k ; i--){
            answer+=Math.max(0,happiness[i]-dec);
            dec++;
        }
        return answer;
    }
}
