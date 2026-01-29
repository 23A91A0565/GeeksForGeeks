class Solution {
    public String firstNonRepeating(String s) {
        // code here
        StringBuilder sb=new StringBuilder();
        int freq[]=new int[256];
        Queue<Character> q=new LinkedList<>();
        for(char ch:s.toCharArray()){
            freq[ch]++;
            q.add(ch);
            while(!q.isEmpty() && freq[q.peek()]>1){
                q.poll();
            }
            if(q.isEmpty())sb.append("#");
            else sb.append(q.peek());
        }
        return sb.toString();
    }
}