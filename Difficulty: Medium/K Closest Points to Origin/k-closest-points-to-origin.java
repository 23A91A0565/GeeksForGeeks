class Solution {
    public ArrayList<ArrayList<Integer>> kClosest(int[][] points, int k) {
        // code here
        double[][] dist = new double[points.length][2];
        for (int i = 0; i < points.length; i++) {
            double d = points[i][0] * points[i][0] + points[i][1] * points[i][1];
            dist[i][0] = d; 
            dist[i][1] = i;
        }
        Arrays.sort(dist, (a, b) -> Double.compare(a[0], b[0]));
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            int idx = (int) dist[i][1];
            ArrayList<Integer> point = new ArrayList<>();
            point.add(points[idx][0]);
            point.add(points[idx][1]);
            ans.add(point);
        }

        return ans;
    }
}