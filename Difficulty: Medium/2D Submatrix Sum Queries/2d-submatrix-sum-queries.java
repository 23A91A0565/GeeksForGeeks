class Solution {
    public ArrayList<Integer> prefixSum2D(int[][] mat, int[][] queries) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = mat.length;
        int m = mat[0].length;

        int[][] pre = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                pre[i][j] =
                        mat[i - 1][j - 1]
                      + pre[i - 1][j]
                      + pre[i][j - 1]
                      - pre[i - 1][j - 1];
            }
        }

        for (int[] q : queries) {
            int r1 = q[0];
            int c1 = q[1];
            int r2 = q[2];
            int c2 = q[3];

            int res =
                    pre[r2 + 1][c2 + 1]
                  - pre[r1][c2 + 1]
                  - pre[r2 + 1][c1]
                  + pre[r1][c1];

            ans.add(res);
        }

        return ans;
    }
}
