class Solution {
    public int minKBitFlips(int[] nums, int k) {
        int answer=0;
        int flips=0;
        for(int i=0; i<nums.length; i++){
            if((nums[i]+flips )%2==0){
                if(i > nums.length-k)
                    return -1;
                else{
                    answer++;
                    flips++;
                    nums[i]=-1;
                }
            }
            if(i+1 >=k){
                flips -=nums[i-k+1]<0 ? 1:0;
            }
        }
        return answer;

    }
}
