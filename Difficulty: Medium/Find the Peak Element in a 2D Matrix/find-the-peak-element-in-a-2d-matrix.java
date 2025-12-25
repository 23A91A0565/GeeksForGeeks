class Solution {
    public ArrayList<Integer> findPeakGrid(int[][] mat) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        int n = mat.length;
        for(int i=0; i<mat.length; i++){
            int m = mat[i].length;
            for(int j=0; j<mat[i].length; j++){
                int up = (i > 0) ? mat[i - 1][j] : Integer.MIN_VALUE;;
                int down = (i < n - 1) ? mat[i + 1][j] : Integer.MIN_VALUE;;
                int left = (j > 0) ? mat[i][j - 1] : Integer.MIN_VALUE;;
                int right = (j < m - 1) ? mat[i][j + 1] : Integer.MIN_VALUE;;

                if (mat[i][j] >= up &&
                    mat[i][j] >= down &&
                    mat[i][j] >= left &&
                    mat[i][j] >= right) {

                    res.add(i);
                    res.add(j);
                    return res;
                }
            }
        }
        return res;
    }
}