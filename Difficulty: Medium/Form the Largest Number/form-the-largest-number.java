class Solution {
    public String findLargest(int[] arr) {
        // code here
        int n=arr.length;
        String s[]=new String[n];
        int i=0;
        for(int ele:arr){
            s[i++]=String.valueOf(ele);
        }
        
        Arrays.sort(s,(a,b)->(b+a).compareTo(a+b));
        
        if(s[0].equals("0"))return "0";
        StringBuilder sb=new StringBuilder();
        for(String st:s){
            sb.append(st);
        }
        return sb.toString();
    }
}