class Solution {
    public int findDuplicate(int[] nums) {
        int[] frequency=new int[nums.length+1];
        for(int n:nums){
            if(frequency[n]==0){
                freequency[n]++;
            }
            else{
                return n;
            }
        }
        return -1;
    }
}
