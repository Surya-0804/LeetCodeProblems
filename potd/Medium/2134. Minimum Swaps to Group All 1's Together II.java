class Solution {
    public int minSwaps(int[] nums) {
        int n=nums.length;
        int totalOnes=0;
        for(int num :nums){
            totalOnes+=num;
        }
        if(totalOnes == 0 || totalOnes==n)
            return 0;
        
        int currentOnes=0;
        for(int i=0; i<totalOnes; i++){
            currentOnes+=nums[i];
        }
        int maxOnes=0;
        for(int i=0; i<n; i++){
            currentOnes-=nums[i];
            currentOnes+=nums[(i+totalOnes)%n];
            maxOnes=Math.max(currentOnes,maxOnes);
        }

        return totalOnes-maxOnes;
    }
}
