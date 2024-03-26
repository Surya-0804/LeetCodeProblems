class Solution {
    public int firstMissingPositive(int[] nums) {
        HashMap<Integer,Boolean> map=new HashMap<>();
        int max=Integer.MIN_VALUE;
        for(int num:nums){
            map.put(num,true);
            max=Math.max(max,num);
        }
        for(int i=1;i<max;i++){
            if(!map.containsKey(i)){
                return i;
            }
        }
        return max<0?1:max+1;
    }
}
