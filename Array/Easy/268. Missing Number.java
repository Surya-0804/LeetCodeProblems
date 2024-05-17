class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sumExpected = n * (n + 1) / 2;
        int sumActual = 0;
        
        for (int num : nums) {
            sumActual += num;
        }
        
        return sumExpected - sumActual;
    }
}
