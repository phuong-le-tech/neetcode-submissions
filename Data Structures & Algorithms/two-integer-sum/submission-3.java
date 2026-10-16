class Solution {
    public int[] twoSum(int[] nums, int target) {
        var countMap = new HashMap<Integer, Integer>();

        for (var i = 0; i < nums.length; i++) {
            var num = nums[i];
            var diff = target - num;

            if (countMap.containsKey(diff)) {
                return new int[] {countMap.get(diff), i};
            }

            countMap.put(num, i);
        }
        return new int[] {};
    }
}
