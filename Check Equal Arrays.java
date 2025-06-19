class Solution {
    public static boolean checkEqual(int[] a, int[] b) {
        boolean res=false;
        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a, b)) 
          res=true;
        return res;
    }
}
