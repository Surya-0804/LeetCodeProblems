class Solution {
    public String countAndSay(int n) {
        if(n==0)
            return "0";
        if(n==1){
            return "1";
        }else{
            String s="1";
            for(int i=1; i<n; i++){
                StringBuilder sb= new StringBuilder();
                int j=0; 
                while(j<s.length()){
                    int count=0;
                    int t=j;
                    char ch=s.charAt(j);
                    while(t<s.length() && s.charAt(t)==ch){
                        count++;
                        t++;
                    }
                    sb.append(String.valueOf(count));
                    sb.append(ch);
                    j=t;
                }
                s=sb.toString();
            }
            return s;
        } 
    }
}
