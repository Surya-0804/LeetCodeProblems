class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n=position.length;
        int answer=-1;
        int low=1;
        int high=position[n-1]-position[0];
        while(low<=high){
            int mid=(high+low)/2;
            
            int lastPosition=position[0];
            int balls=1;
            for(int i=1; i<n; i++){
                if(position[i]- lastPosition >=mid){
                    balls++;
                    lastPosition=position[i];
                }
            }
            if(balls >=m){
                answer=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return answer;

    }
}
