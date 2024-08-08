class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int high=findMax(piles);
        int low=1;

        while(low<=high){
            int mid=(low+high)/2;
            int total=calculateTime(piles,mid);
            if(total<=h){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }

    private static int findMax(int[] piles){
        int max=Integer.MIN_VALUE;
        for(int num : piles){
            max=Math.max(max,num);
        }
        return max;
    }

    private static int calculateTime(int[] piles, int hourly){
        int total=0;
        for(int num : piles){
            total+=Math.ceil((double)num / (double)hourly);
        }
        return total;
    }
}
