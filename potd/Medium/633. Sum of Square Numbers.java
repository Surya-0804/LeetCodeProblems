class Solution {
    public boolean judgeSquareSum(int c) {
        for(long i=0; i*i<=c; i++){
            double b=Math.sqrt(c- i*i);
            if(b == (int)b)
                return true;
        }
        return false;
    }
}
