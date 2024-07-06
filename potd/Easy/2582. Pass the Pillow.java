class Solution {
    public int passThePillow(int n, int time) {
        int pass=1;
        boolean flag=true;
        for(int i=0; i<time; i++){
            if(flag)
                pass++;
            else
                pass--;
            if(pass == n)
                flag=false;
            if(pass == 1)
                flag=true;
        }
        return pass;

    }
}
