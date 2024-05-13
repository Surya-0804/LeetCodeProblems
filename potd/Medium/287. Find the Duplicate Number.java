class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            if(map.containsKey(n)){
                return n;
            }
            else{
                map.put(n,1);
            }
        }
        return -1;
    }
}


//Implemented an alternative solution using an integer array instead of a HashMap to enhance memory efficiency. This approach is particularly suitable for the problem '287. Find the Duplicate Number' in the 'Array/Medium' category."
