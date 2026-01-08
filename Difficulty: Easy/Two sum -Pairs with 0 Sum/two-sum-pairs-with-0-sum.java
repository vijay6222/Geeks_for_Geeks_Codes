class Solution {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        // Count frequency
        for (int val : arr) {
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        // Find pairs
        for (int val : arr) {

            // (0,0) case
            if (val == 0 && map.containsKey(0) && map.get(0) > 1) {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(0);
                pair.add(0);
                ans.add(pair);
                map.remove(0);
            }

            // (x, -x) case
            else if (val < 0 && map.containsKey(val) && map.containsKey(-val)) {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(val);
                pair.add(-val);
                ans.add(pair);
                map.remove(val);
                map.remove(-val);
            }
        }

        
        Collections.sort(ans, (a, b) -> {
            if (!a.get(0).equals(b.get(0)))
                return a.get(0) - b.get(0);
            return a.get(1) - b.get(1);
        });

        return ans;
    }
}