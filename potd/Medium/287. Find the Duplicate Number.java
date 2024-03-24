class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            if(map.containsKey(n)){
                return n;
            }
            else{
                map.put(n,1);
            }
        }
        return -1;
    }
}
