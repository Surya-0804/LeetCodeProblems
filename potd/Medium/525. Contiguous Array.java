class Solution {
    public int findMaxLength(int[] nums) {
        int len=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int subArrayLen=0;
        for(int i=0;i<len;i++){
            sum+= nums[i]==0? -1 :1;
            if(sum==0){
                subArrayLen=i+1;
            }
            else if(map.containsKey(sum)){
                subArrayLen=Math.max(subArrayLen,i-map.get(sum));
            }
            else{
                map.put(sum,i);
            }
        }
        return subArrayLen;
    }
}
