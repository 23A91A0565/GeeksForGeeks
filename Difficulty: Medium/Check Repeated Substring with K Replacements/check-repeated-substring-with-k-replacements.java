class Solution {
    public boolean kSubstr(String s, int k) {
        // code here
        if(s.length()%k!=0)return false;
        HashMap<String,Integer> ans=new HashMap<>();
        for(int i=0;i<s.length();i=i+k){
            String sub=s.substring(i,i+k);
            ans.put(sub,ans.getOrDefault(sub,0)+1);
        }
        int req=(int)(s.length()/k);
        if(ans.size()>2)return false;
        int f1=0,f2=0;
        for(int fr:ans.values()){
            if(f1==0){
                f1=fr;
            }
            else{
                f2=fr;
            }
        }
        
        if(f1==req)return true;
        if(f1==req-1 && f2==1)return true;
        if(f1==1 && f2==req-1)return true;
        return false;
        
    }
}