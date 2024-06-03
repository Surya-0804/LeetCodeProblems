class Solution {
    public int appendCharacters(String s, String t) {
        int n=s.length();
        int m=t.length();
        int i=0;
        int j=0;
        while(i<n && j<m){
            if(s.charAt(i) == t.charAt(j))
                j++;
            i++;
        }
        return m-j;
    }
}
