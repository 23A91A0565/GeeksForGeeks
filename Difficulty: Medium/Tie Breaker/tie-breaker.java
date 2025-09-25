// User function Template for Java

class Solution {
    public static String TieBreak(String arr[]) {
        // Your code here
        int max=0;
        HashMap<String,Integer> ans=new HashMap<>();
        for(String s:arr){
            ans.put(s,ans.getOrDefault(s,0)+1);
            max=Math.max(max,ans.get(s));
        }
        ArrayList<String> store=new ArrayList<>();
        for(String s:ans.keySet()){
            if(ans.get(s)==max){
                store.add(s);
            }
        }
        Collections.sort(store);
        return store.get(0);
    }
}

