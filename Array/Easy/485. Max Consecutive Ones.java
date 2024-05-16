class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int answer=0;
        int count=0;
        for(int i : nums){
            if(i==1)
                count++;
            else
                count=0;
            answer=Math.max(answer,count);
        }
        return answer;
    }
}
