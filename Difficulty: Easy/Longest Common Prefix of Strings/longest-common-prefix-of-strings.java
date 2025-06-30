// User function Template for Java
class Solution {
    public String longestCommonPrefix(String arr[]) {
        // code here
        Arrays.sort(arr);
        StringBuilder sb=new StringBuilder();
        String s1=arr[0];
        String s2=arr[arr.length-1];
        int l=Math.min(s1.length(),s2.length());
        int j=0;
        while(j<l && s1.charAt(j)==s2.charAt(j)){
            sb.append(s1.charAt(j));
            j++;
    }
    return sb.toString();
    }
}