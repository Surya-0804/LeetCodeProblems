class Solution {
    public int longestPalindrome(String s) {
        int answer=0;
        boolean flag=false;
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int value : map.values()){
            if(value%2 == 0){
                answer+=value;
            }
            else{
                answer+=value-1;
                flag=true;
            }
        }
        if(flag){
            answer++;
        }
        return answer;
    }
}
