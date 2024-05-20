class Solution {
    int sum=0;
    public int subsetXORSum(int[] nums) {
        dfs(nums,0,sum);
        return sum;
    }

    private  void dfs(int[] nums , int start , int prevSum){
        if(start>=nums.length)
            return;
        for(int i=start ; i<nums.length; i++){
            int currentSum=prevSum^nums[i];
            sum+=currentSum;
            dfs(nums,i+1,currentSum);
        }
    }
}
