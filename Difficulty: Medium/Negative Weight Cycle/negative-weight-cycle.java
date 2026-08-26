class Solution {
    public boolean isNegativeWeightCycle(int V, int[][] edges) {
        // code here
        long[] dist = new long[V];

        // Relax all edges V-1 times
        for (int i = 0; i < V - 1; i++) {

            boolean updated = false;

            for (int[] edge : edges) {
                int u = edge[0];
                int v = edge[1];
                int w = edge[2];

                if (dist[u] + w < dist[v]) {
                    dist[v] = dist[u] + w;
                    updated = true;
                }
            }

            // Optimization: no update means distances are finalized
            if (!updated) {
                break;
            }
        }

        // Vth relaxation
        // If distance still decreases, negative cycle exists
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];

            if (dist[u] + w < dist[v]) {
                return true;
            }
        }

        return false;
    }
}