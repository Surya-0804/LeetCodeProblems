class Solution {
    public String[] findRelativeRanks(int[] score) {
        Integer[] sortedscore=Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(sortedscore,Collections.reverseOrder());
        String[] medals={"Gold Medal", "Silver Medal" , "Bronze Medal"};
        HashMap<Integer,String> map=new HashMap<>();
        for(int i=0;i<score.length;i++){
            if(i<3){
                map.put(sortedscore[i],medals[i]);
            }
            else{
                map.put(sortedscore[i],String.valueOf(i+1));
            }
        }
        String[] result=new String[score.length];
        for(int i=0; i<score.length; i++){
            result[i]=map.get(score[i]);
        }

        return result;
    }
}
