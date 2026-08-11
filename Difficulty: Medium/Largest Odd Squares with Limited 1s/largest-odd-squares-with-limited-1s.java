class Solution {
    ArrayList<Integer> largestSquare(int[][] mat, int[][] queries, int k) {
        // code here
        int n = mat.length;
        int m = mat[0].length;

        int[][] prefix = new int[n + 1][m + 1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
 
                prefix[i + 1][j + 1] =
                        mat[i][j]
                        + prefix[i][j + 1]
                        + prefix[i + 1][j]
                        - prefix[i][j];
            }
        }

        ArrayList<Integer> ans=new ArrayList<>();

        for (int q = 0; q < queries.length; q++) {

            int i = queries[q][0];
            int j = queries[q][1];
            int maxRadius = Math.min(
                    Math.min(i, n - 1 - i),
                    Math.min(j, m - 1 - j)
            );

            int low = 0;
            int high = maxRadius;
            int best = -1;
            while (low <= high) {

                int r = low + (high - low) / 2;

                int top = i - r;
                int bottom = i + r;
                int left = j - r;
                int right = j + r;

                int ones = getSum(
                        prefix,
                        top,
                        left,
                        bottom,
                        right
                );

                if (ones <= k) {
                    best = r;
                    low = r + 1;
                } else {
                    high = r - 1;
                }
            }
            if(best==-1){
                ans.add(best);
            }
            else{
               ans.add(2 * best + 1); 
            }
        }
        return ans;
    }

    private int getSum(int[][] prefix,int top,int left,int bottom,int right) {
        return prefix[bottom + 1][right + 1]
                - prefix[top][right + 1]
                - prefix[bottom + 1][left]
                + prefix[top][left];
    }
}