class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n=nums.length;
        int[] count=new int[n+1];
        count[0]=1;
        int answer=0;
        int temp=0;
        for(int num : nums){
            temp+=num&1;
            if(temp - k >=0){
                answer+=count[temp-k];
            }
            count[temp]++;
        }
        return answer;
    }
}
