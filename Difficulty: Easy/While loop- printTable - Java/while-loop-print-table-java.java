class Solution {
    public void calculateMultiples(int n) {
        // code here
        int i = n*10;
        while (i >= n) {
            System.out.print(i + " ");
            i = i - n;
        }
    }
}