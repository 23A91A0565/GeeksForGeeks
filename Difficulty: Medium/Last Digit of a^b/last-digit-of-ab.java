class Solution {
    public int getLastDigit(String a, String b) {
        // code here
        if(b.equals("0"))return 1;
        int x=Integer.parseInt(a.substring(a.length()-1));
        int y=Integer.parseInt(b.substring(Math.max(0,b.length()-2)))%4;
        if(y==0)y=4;
        int ans=1;
        while(y-->0){
            ans=(ans*x)%10;
        }
        return ans;
    }
};