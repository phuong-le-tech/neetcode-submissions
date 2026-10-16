class Solution {
    public boolean hasDuplicate(int[] nums) {
        var noDuplicate = new HashSet<Integer>();
        
        for (int num : nums) {
            if (noDuplicate.contains(num)) {
                return true;
            }
            noDuplicate.add(num);
        }

        return false;
    }
}