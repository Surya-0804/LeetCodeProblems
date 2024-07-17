class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        List<Integer> answer=new ArrayList<>();
        int limit=(int)n/3;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > limit) {
                answer.add(entry.getKey());
            }
        }
        return answer;
    }
}
