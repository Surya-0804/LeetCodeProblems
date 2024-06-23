class Solution {
    public int longestSubarray(int[] nums, int limit) {
        LinkedList<Integer> increase = new LinkedList<>();
        LinkedList<Integer> decrease = new LinkedList<>();

        int left=0;
        int max=0;

        for(int i=0; i<nums.length; i++){
            int n=nums[i];

            while(increase.size()>0 && n<increase.getLast()){
                increase.removeLast();
            }
            increase.add(n);

            while(decrease.size() > 0 && n > decrease.getLast()){
                decrease.removeLast();
            }
            decrease.add(n);

            while(decrease.getFirst() - increase.getFirst() > limit){
                if(nums[left] == increase.getFirst()){
                    increase.removeFirst();
                }
                if(nums[left] == decrease.getFirst()){
                    decrease.removeFirst();
                }
                left++;
            }
            int size = i-left+1;
            max=Math.max(max,size);
        }
        return max;
    }
}
