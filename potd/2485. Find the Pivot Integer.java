class Solution {
    public int pivotInteger(int n) {
        int leftsum = 0;
        int rightsum=0;
        for(int i=0;i<=n;i++){
            leftsum=i*(i+1)/2;
            rightsum=n*(n+1)/2 - i*(i-1)/2;

            if (leftsum == rightsum) {
                return i;
            }
        }
        return -1;
    }
}
