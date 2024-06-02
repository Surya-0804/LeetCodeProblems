class Solution {
    public void reverseString(char[] s) {
        int i=0;
        int n=s.length-1;
        while(i!=s.length/2){
            char ch=s[i];
            s[i]=s[n];
            s[n]=ch;
            i++;
            n--;
        }
    }
}
