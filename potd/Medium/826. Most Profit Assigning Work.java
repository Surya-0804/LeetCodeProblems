class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int answer=0;
        List<int[]> jobs=new ArrayList<>();

        for(int i=0; i<difficulty.length; i++){
            jobs.add(new int[] {difficulty[i],profit[i]});
        }

        Collections.sort(jobs, (a,b) -> (a[0] - b[0]));
        Arrays.sort(worker);
        int j=0;
        int maxProfit=0;
        for(int i=0; i< worker.length; i++){
            while(j< jobs.size()&& jobs.get(j)[0] <=worker[i]){
                maxProfit =Math.max(maxProfit, jobs.get(j)[1]);
                j++;
            }
            answer+=maxProfit;
        }
        return answer;
    }
}
