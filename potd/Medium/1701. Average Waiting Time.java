class Solution {
    public double averageWaitingTime(int[][] customers) {
        int n = customers.length;
        double waitingTime = customers[0][1];
        int prevFinish = customers[0][1] + customers[0][0];
        for(int i=1; i<n; i++){
            int arrival = customers[i][0];
            int start = Math.max(arrival,prevFinish);
            int end = start + customers[i][1];
            waitingTime += end - arrival;
            prevFinish = end;
        }
        return waitingTime / n;
    }
}
