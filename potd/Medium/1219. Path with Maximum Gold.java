class Solution {
    private final List<Integer> dx=Arrays.asList(-1,0,0,1);
    private final List<Integer> dy=Arrays.asList(0,-1,1,0);

    public int dfs(int i, int j, int[][] grid){
        int n=grid.length;
        int m = grid[0].length;
        
        if(i<0 || i>=n || j<0 || j>=m || grid[i][j]==0)
            return 0;

        int current=grid[i][j];
        int max=0;

        for(int k=0 ; k<4 ; k++){
            int newi=i+dx.get(k);
            int newj=j+dy.get(k);
            grid[i][j]=0;
            max=Math.max(max , current+dfs(newi , newj, grid));
            grid[i][j]=current;
        }
        return max;
    }

    public int getMaximumGold(int[][] grid) {
        int n=grid.length;
        int m = grid[0].length;
        int answer=0;

        for(int i=0; i<n ; i++){
            for(int j=0; j<m ;j++){
                if(grid[i][j]!=0){
                    answer=Math.max(answer,dfs(i,j,grid));       
                }
            }
        }
        return answer;
    }
}
