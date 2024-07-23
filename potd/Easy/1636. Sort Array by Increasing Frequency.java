class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] answer=new int[nums.length];
        Integer[] temp=new Integer[nums.length];
        int index=0;
        for(int num: nums){
            map.put(num,map.getOrDefault(num,0)+1);
            temp[index++]=num;
        }
        Arrays.sort(temp, (a,b) ->{
            if(!map.get(a).equals(map.get(b))){
                return map.get(a)-map.get(b);
            }else{
                return b-a;
            }
        });

        for(int i=0; i<nums.length; i++){
            answer[i]=temp[i];
        }

        return answer;
    }
}
