class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][m-1]<target)
                    break;
                else if(matrix[i][j]==target)
                    return true;
            }
        }
        return false;
    }
}
