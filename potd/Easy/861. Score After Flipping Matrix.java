class Solution {
    public int matrixScore(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int answer=0;

        for(int i=0; i<n ; i++){

            if(grid[i][0]==0){

                for(int j=0; j<m ; j++)
                    grid[i][j]=1-grid[i][j];
                
            }
        }

        for(int j=0 ; j<m ; j++){
            int count=0;

            for(int i=0 ; i<n ; i++){
                count+=grid[i][j];
            }

            int max=Math.max(count,n-count);
            answer+=max*(1<<(m-j-1));
        }
        return answer;
    }
}
