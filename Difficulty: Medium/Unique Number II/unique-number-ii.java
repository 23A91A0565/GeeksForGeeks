class Solution {
    public int[] singleNum(int[] arr) {
        // Code here
        Map<Integer, Integer> hash = new HashMap<>();
        for(int num: arr)
        {
            hash.put(num,hash.getOrDefault(num,0)+1);
        }
        List<Integer> result = new ArrayList<>();
        for (int num : hash.keySet()) 
        {
            if (hash.get(num) == 1) 
            {
                result.add(num);
            }
        }
        Collections.sort(result);
        return new int[]{result.get(0), result.get(1)};
    }
}