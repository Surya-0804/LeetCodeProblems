class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int numrows = rowSum.length;
        int colrows = colSum.length;
        int[][] result = new int[numrows][colrows];

        int i=0,j=0;

        while(i<numrows && j<colrows){
            int val = Math.min(rowSum[i], colSum[j]);
            result[i][j] = val;
            rowSum[i] -= val;
            colSum[j] -= val;

            if(rowSum[i] == 0){
                i++;
            }
            if(colSum[j] == 0){
                j++;
            }
        }
        return result;
    }
}
