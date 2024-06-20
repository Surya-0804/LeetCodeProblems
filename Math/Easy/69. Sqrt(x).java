class Solution {
    public int mySqrt(int x) {
        long low=0;
        long high=x;
        while(low<=high){
            long mid=(high+low)/2;

            if(mid*mid >x)
                high=mid-1;
            else if(mid*mid < x)
                low=mid+1;
            else
                return (int)mid;
        }
        return (int)high;
    }
}
