class Solution {
    public boolean sumGame(String num) {

        int s1 = 0, s2 = 0;
        int q1 = 0, q2 = 0;

        int n = num.length();

        for (int i = 0; i < n / 2; i++) {
            char c = num.charAt(i);

            if (c == '?')
                q1++;
            else
                s1 += c - '0';
        }

        for (int i = n / 2; i < n; i++) {
            char c = num.charAt(i);

            if (c == '?')
                q2++;
            else
                s2 += c - '0';
        }

        // Same number of '?' on both sides
        if (q1 == q2) {
            return s1 != s2;
        }

        int diffQ = q1 - q2;
        int diffS = s1 - s2;

        // Odd difference -> Alice wins
        if (Math.abs(diffQ) % 2 == 1) {
            return true;
        }

        /*
         * Bob can win only if the existing sum difference
         * can be exactly cancelled by the extra '?'s.
         *
         * Direction is important.
         */
        int required = -(diffQ / 2) * 9;

        return diffS != required;
    }
}