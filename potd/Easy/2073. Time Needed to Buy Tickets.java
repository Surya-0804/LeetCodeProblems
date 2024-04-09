class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time=0;
        int i=0;
        while(tickets[k]!=0 && i<tickets.length){
            if(tickets[i]>0){
                time++;
                tickets[i]--;
            }
            i++;
            if(tickets[k]==0){
                return time;
            }
            if(i==tickets.length){
                i=0;
            }            
        }
        return time;
    }
}
