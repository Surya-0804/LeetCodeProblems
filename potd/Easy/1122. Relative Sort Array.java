class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] count=new int[1001];
        int[] answer=new int[arr1.length];
        int index=0;

        for(int num : arr1){
            count[num]++;
        }

        for(int num :arr2){
            while(count[num]-- >0){
                answer[index++]=num;
            }
        }
        for(int i=0; i<count.length; i++){
            while(count[i]-- >0){
                answer[index++]=i;
            }
        }
        return answer;
    }
}
