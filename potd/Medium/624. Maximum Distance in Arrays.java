class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int big=arrays.get(0).get(arrays.get(0).size()-1);
        int small=arrays.get(0).get(0);
        int maxDistance=0;

        for(int i=1; i<arrays.size(); i++){
            maxDistance=Math.max(maxDistance,Math.abs(arrays.get(i).get(arrays.get(i).size()-1)-small));
            maxDistance=Math.max(maxDistance,Math.abs(big-arrays.get(i).get(0)));
            small=Math.min(small,arrays.get(i).get(0));
            big=Math.max(big,arrays.get(i).get(arrays.get(i).size()-1));
        }
        return maxDistance;
    }
}
