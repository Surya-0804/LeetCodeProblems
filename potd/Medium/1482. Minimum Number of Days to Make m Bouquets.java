class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length < m*k)
            return -1;
        int answer=-1;
        int low=1;
        int high=1000000000;
        while(low <= high){
            int mid = low + (high - low) / 2;
            int consecutive=0;
            int bouquets=0;
            for (int i = 0; i < bloomDay.length; i++) {
                if (bloomDay[i] <= mid) {
                    consecutive++;
                    if (consecutive == k) {
                        bouquets++;
                        consecutive = 0;
                    }
                } else {
                    consecutive = 0;
                }
            }
            
            if(bouquets >=m){
                answer=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return answer;

    }
}
