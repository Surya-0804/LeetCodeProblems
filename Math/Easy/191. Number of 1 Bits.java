class Solution {
    public int hammingWeight(int n) {
        String bits= Integer.toBinaryString(n);
        int count=0;
        for(char ch : bits.toCharArray()){
            if(ch=='1')
                count++;
        }
        return count;
    }
}
