class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int i=0; i<n; i++){
            if(nums[i]!=0){
                nums[count++]=nums[i];
            }
        }
        for(int i=count; i<n; i++){
            nums[i]=0;
        }
    }
}
