class Solution {
    public int beautifulSubsets(int[] nums, int k) {
        Arrays.sort(nums);
        return dfs(nums,k,0,new HashSet<Integer>());
    }

    private static int dfs(int[] nums, int k , int i, HashSet<Integer> set){
        if(i == nums.length)
            return set.isEmpty() ? 0 :1;
        
        int count=dfs(nums, k , i+1 , set);

        if(set.contains(nums[i]-k))
            return count;
        
        set.add(nums[i]);
        count+=dfs(nums,k,i+1,set);
        set.remove(nums[i]);
        return count;
    }
}
