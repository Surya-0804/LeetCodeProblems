class Solution {
    public int maxSubArray(int[] nums) {
        int answer=Integer.MIN_VALUE;
        int sum=0;
        for(int i : nums){
            sum+=i;
            if(answer<sum){
                answer=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return answer;
    }
}
