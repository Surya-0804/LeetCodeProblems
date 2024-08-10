class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] answer=new int[2];
        HashSet<Integer> set=new HashSet<>();
        for(int[] row: grid){
            for(int num: row){
                if(set.contains(num)){
                    answer[0]=num;
                }
                else{
                    set.add(num);
                }
            }
        }
        int n=grid.length*grid.length;
        for(int i=1; i<=n; i++){
            if(!set.contains(i)){
                answer[1]=i;
                break;
            }
        }
        return answer;
    }
}
