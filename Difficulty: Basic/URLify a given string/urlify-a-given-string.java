class Solution {
    String URLify(String s) {
        // code here
        String st="%20";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                sb.append(st);
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}