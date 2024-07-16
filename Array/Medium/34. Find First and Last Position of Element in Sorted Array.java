class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] answer=new int[2];
        answer[0]=first(nums,target);
        if(answer[0]==-1) 
            return new int[]{-1,-1};
        answer[1]=last(nums,target);
        return answer;
    }
    private static int first(int[] nums, int target){
        int low=0;
        int high=nums.length-1;
        int start=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                start=mid;
                high=mid-1;
            }
            else if(nums[mid]<target)
                low=mid+1;
            else
                high=mid-1;
        }
        return start;
    }

    private static int last(int[] nums, int target){
        int low=0;
        int high=nums.length-1;
        int last=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                last=mid;
                low=mid+1;
            }
            else if(nums[mid]<target)
                low=mid+1;
            else
                high=mid-1;
        }
        return last;
    }
}
