// User function Template for Java
class Solution {
    public static int josephus(int n, int k) {
        // Your code here
        LinkedList<Integer> li = new LinkedList<>();
        for(int i=0;i<n;i++){
            li.add(i);
        }
        
        int index=0;
        while( li.size() >1){
            index=(index+k-1)%li.size();
            li.remove(index);
        }
        
        return li.get(0);
    }
}