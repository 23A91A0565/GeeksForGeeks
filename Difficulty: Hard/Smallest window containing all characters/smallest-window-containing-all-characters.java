class Solution {
    public static String minWindow(String s, String p) {
        // code here
        HashMap<Character,Integer> ans=new HashMap<>();
        for(char c:p.toCharArray()){
            ans.put(c,ans.getOrDefault(c,0)+1);
        }
        int min=Integer.MAX_VALUE;
        int i=0,j=0;
        int st=0;
        int match=0;
        while(i<s.length()){
            char curr=s.charAt(i);
            if(ans.containsKey(curr)){
                ans.put(curr,ans.get(curr)-1);
                if(ans.get(curr)==0){
                    match++;
                }
            }
            
            while(match==ans.size()){
                if(i-j+1<min){
                    min=i-j+1;
                    st=j;
                }
                
                char left=s.charAt(j);
                if(ans.containsKey(left)){
                    ans.put(left,ans.get(left)+1);
                    if(ans.get(left)==1){
                        match--;
                    }
                }
                j++;
            }
            i++;
        }
        if(min==Integer.MAX_VALUE)return "";
        return s.substring(st,st+min);
    }
}