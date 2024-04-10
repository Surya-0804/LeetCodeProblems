class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int n=deck.length;
        int [] answer=new int[n];
        Deque<Integer> deque=new LinkedList<>();
        for(int i=0;i<n;i++)
            deque.add(i);
        for(int card :deck){
            int index=deque.poll();
            answer[index]=card;
            if(!deque.isEmpty())
                deque.add(deque.poll());
        }
        return answer;
    }
}
