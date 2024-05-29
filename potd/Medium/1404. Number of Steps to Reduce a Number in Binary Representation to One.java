class Solution {
    public int numSteps(String s) {
        if(s == "1" || s == "0")
            return 0;
        int count=0;
        int carry=0;

        for(int i=s.length()-1; i>=1; i--){
            int num=s.charAt(i)-'0';
            if(num == 0 && carry == 0)
                count++;
            else if(num == 1 && carry == 1){
                count++;
                carry=1;
            }
            else{
                count+=2;
                carry=1;
            }
        }
        if(carry==1)
            count++;
        return count;

    }
}
