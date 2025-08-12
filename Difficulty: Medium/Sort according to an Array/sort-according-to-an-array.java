class Solution {
    static void relativeSort(int[] a1, int[] a2) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for (int num : a1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : a2) {
            if (map.containsKey(num)) {
                int val = map.get(num);
                while (val > 0) {
                    ans.add(num);
                    val--;
                }
                map.remove(num);
            }
        }
        List<Integer> remainingKeys = new ArrayList<>(map.keySet());
        Collections.sort(remainingKeys);
        for (int num : remainingKeys) {
            int val = map.get(num);
            while (val > 0) {
                ans.add(num);
                val--;
            }
        }
        
        for (int i = 0; i < ans.size(); i++) {
            a1[i] = ans.get(i);
        }
    }
}