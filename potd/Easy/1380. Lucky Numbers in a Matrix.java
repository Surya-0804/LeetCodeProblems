class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> answer=new ArrayList<>();
        int n=matrix.length;
        int m=matrix[0].length;

        List<Integer> row=new ArrayList<>();
        for(int i=0; i<n; i++){
            int min=Integer.MAX_VALUE;
            for(int j=0; j<m; j++){
                min=Math.min(min,matrix[i][j]);
            }
            row.add(min);
        }

        List<Integer> coloumn=new ArrayList<>();
        for(int i=0; i<m; i++){
            int max=Integer.MIN_VALUE;
            for(int j=0; j<n; j++){
                max=Math.max(max,matrix[j][i]);
            }
            coloumn.add(max);
        }

        for(int i=0; i<n; i++ ){
            for(int j=0; j<m; j++){
                if(matrix[i][j]==row.get(i) && matrix[i][j]==coloumn.get(j)){
                    answer.add(matrix[i][j]);
                }
            }
        }
        return answer;
    }
}
