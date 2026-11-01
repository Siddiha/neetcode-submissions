class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> premap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            if (premap.containsKey(diff)) { 
                return new int[]{premap.get(diff), i};
            }

            premap.put(num, i);
        }

        return new int[]{};
    }
}