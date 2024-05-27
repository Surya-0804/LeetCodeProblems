class Solution {
    public int specialArray(int[] nums) {
        int n=nums.length;
        int count=0;
        int freq[]=new int[n+1];
        for(int i=0; i<n ; i++){
            if(nums[i]>n)
                count++;
            else
                freq[nums[i]]++;
        }
        int temp=count;
        for(int i=n ; i>=0; i--){
            temp+=freq[i];
            if(temp==i)
                return i;
        }
        return -1;
    }
}
