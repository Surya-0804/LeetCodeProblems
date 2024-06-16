class Solution {
    public int minPatches(int[] nums, int n) {
        long missing=1;
        int patches=0;
        int index=0;

        while (missing <= n) {
            if (index < nums.length && nums[index] <= missing) {
                missing += nums[index];
                index++;
            } else {
                missing += missing;
                patches++;
            }
        }
        return patches;
    }
}
