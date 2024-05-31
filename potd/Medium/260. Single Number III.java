class Solution {
    public int[] singleNumber(int[] nums) {
        int answer=0;
        for(int num : nums){
            answer ^= num;
        }
        answer &= -answer;
        int[] result=new int[2];
        for(int num : nums){
            if((answer & num )== 0)
                result[0]^=num;
            else
                result[1]^=num;
        }
        return result;
    }
}
