class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] mp = new int[26];

        int m = (int)1e9;

        for (int i = 0; i < text.length(); i++) {
            mp[text.charAt(i) - 'a']++;
        }

        String t = "balon";

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);

            if (c == 'l' || c == 'o') {
                m = Math.min(m, mp[c - 'a'] / 2);
            } else {
                m = Math.min(m, mp[c - 'a']);
            }
        }

        return m;
    }
}