class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> queue=new LinkedList<>();
        Stack<Integer> stack=new Stack<>();
        int served=0;
        for(int s: students){
            queue.add(s);
        }
        for(int i=sandwiches.length-1;i>=0;i--){
            stack.push(sandwiches[i]);
        }
        while(!queue.isEmpty() && served<sandwiches.length){
            if(queue.peek().equals(stack.peek())){
                queue.remove();
                stack.pop();
                served=0;
            }
            else{
                queue.add(queue.remove());
                served++;
            }
        }
        
        return queue.size();
    }
}
