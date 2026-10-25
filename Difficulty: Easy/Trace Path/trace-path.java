class Solution {
    public boolean isPossible(int n, int m, String s) {
        // code here
        int x = 0, y = 0;
        int minX = 0, maxX = 0;
        int minY = 0, maxY = 0;

        for (char ch : s.toCharArray()) {
            if (ch == 'L') {
                y--;
            } else if (ch == 'R') {
                y++;
            } else if (ch == 'D') {
                x--; 
            } else if (ch == 'U') {
                x++;
            }

            minX = Math.min(minX, x);
            maxX = Math.max(maxX, x);
            minY = Math.min(minY, y);
            maxY = Math.max(maxY, y);
        }

        return (maxX - minX < n) &&
               (maxY - minY < m);
    }
}