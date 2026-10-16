class Solution {
    public boolean hasDuplicate(int[] nums) {
        var numsBis = new HashSet<Integer>();

        for (var i = 0; i < nums.length; i++) {
            numsBis.add(nums[i]);
        }

        return numsBis.size() != nums.length;
    }
}