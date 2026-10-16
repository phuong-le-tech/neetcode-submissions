class Solution {
    public boolean isAnagram(String s, String t) {
        
        if (s.length() != t.length()) {
            return false;
        }

        var letterCount = new HashMap<Character, Integer>();

        for (char letter : s.toCharArray()) {
            letterCount.put(letter, letterCount.getOrDefault(letter, 0) + 1);
        }

        for (char letter : t.toCharArray()) {
            letterCount.put(letter, letterCount.getOrDefault(letter, 0) - 1);
            if (letterCount.get(letter) < 0) {
                return false;
            }
        }

        return true;
    }
}
