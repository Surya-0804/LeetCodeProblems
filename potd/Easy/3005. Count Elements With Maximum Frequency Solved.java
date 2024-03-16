class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> freq=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(freq.containsKey(nums[i])){
                freq.put(nums[i],freq.get(nums[i])+1);
            }
            else{
                freq.put(nums[i],1);
            }
        }
        int max=0;
        int count=0;
        for(int value:freq.values()){
            if (value>=max){
                max=value;
            }
        }
        for(int value:freq.values()){
            if(value==max){
                count+=max;
            }
        }
        return count;
    }
}
