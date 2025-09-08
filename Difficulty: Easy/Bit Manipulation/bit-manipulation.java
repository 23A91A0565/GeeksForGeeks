// User function Template for Java

class Solution {
    static void bitManipulation(int num, int i) {
        // code here
        int get=(num&(1<<i-1))!=0?1:0;
        int set=num|(1<<i-1);
        int clear=num&~(1<<i-1);
        System.out.print(get+" "+set+" "+clear);
    }
}
