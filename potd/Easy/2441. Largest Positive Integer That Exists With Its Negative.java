class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int answer=-1;
        for(int num : nums){
            set.add(num);

            int k=num*-1;
            if(set.contains(k)){
                answer=Math.max(answer,Math.abs(k));
            }
        }
        return answer;
    }
}
