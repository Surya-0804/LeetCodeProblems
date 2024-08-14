class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int low=0;
        int high=nums[nums.length-1]-nums[0];

        while(low<high){
            int mid=(low+high)/2;
            if(isSmallPairs(nums,k,mid))
                high=mid;
            else
                low=mid+1;
        }
        return low;
    }

    private static boolean isSmallPairs(int[] nums, int k, int mid){
        int count=0;
        int low=0;
        for(int high=1; high<nums.length; high++){
            while(nums[high]-nums[low]>mid)
                low++;
            count+=high-low;
        }
        return count>=k;
    }
}
