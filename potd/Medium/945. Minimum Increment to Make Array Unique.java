class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int i=0; 
        int count=0;
        for(int num : nums){
            i=Math.max(num,i);
            count+= (i++ - num);
        }
        return count;
    }
}
