class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        var map = new HashMap<String, List<String>>();

        for (String s : strs) {
            int[] charArray = new int[26];
            for (char c : s.toCharArray()) {
                charArray[c - 'a']++;
            }
            var key = Arrays.toString(charArray);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
