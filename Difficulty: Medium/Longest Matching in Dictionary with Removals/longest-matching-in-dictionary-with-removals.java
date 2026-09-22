class Solution {
    public String findLongestWord(String s, List<String> d) {
        // code here
        d.sort((a,b)->{
            if(a.length()!=b.length()){
                return b.length()-a.length();
            }
            return a.compareTo(b);
        });
        
        for(int i=0;i<d.size();i++){
            if(isValid(s,d.get(i))){
                return d.get(i);
            }
        }
        return "";
    }
    public boolean isValid(String s,String word){
        int i=0;
        int j=0;
        while(i<s.length() && j<word.length()){
            if(s.charAt(i)==word.charAt(j)){
                j++;
            }
            i++;
        }
        return j==word.length();
    }
}