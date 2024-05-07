class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> row=new HashSet<>();
        HashSet<Integer> column=new HashSet<>();
        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[i].length ; j++){
                if(matrix[i][j]==0){
                    row.add(i);
                    column.add(j);
                }
            }
        }

        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[i].length ; j++){
                if(row.contains(i) || column.contains(j)){
                    matrix[i][j]=0;
                }
            }
        }
        return ;
    }
}
