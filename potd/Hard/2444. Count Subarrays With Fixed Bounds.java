class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long count=0;
        int leftindex=-1;
        int rightindex=-1;
        int currentindex=-1;
        for(int i=0;i<nums.length;i++){
            if(!(minK<=nums[i]&& nums[i]<=maxK))
                currentindex=i;
            if(minK==nums[i])
                leftindex=i;
            if(maxK==nums[i])
                rightindex=i;
            count+=Math.max(0,Math.min(leftindex,rightindex)-currentindex);
        }
        return count;
    }
}
