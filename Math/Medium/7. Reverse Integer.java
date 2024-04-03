class Solution {
    public int reverse(int x) {
        int n=Math.abs(x);
        int answer=0;
        while(n>0){
            int digit=n%10;
            if(answer>(Integer.MAX_VALUE-digit)/10){
                return 0;
            }
            answer=answer*10+digit;
            n/=10;
        }
        
        return (x<0)?(-answer):answer;
    }
}
