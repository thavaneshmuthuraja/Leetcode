class Solution {
    public boolean canMakeSubsequence(String s, String t) {

        int n = s.length(), m = t.length();
        int[] pre = new int[n];
        int[] suf = new int[n];

        if (n > m)
            return false;

        int in1 = 0;
        for (int i = 0; i < n; i++) {
            while (in1 < m && s.charAt(i) != t.charAt(in1)) {
                in1++;
            }
            if (in1 >= m) {
                while (i < n)
                    pre[i++] = m;
                break;
            }
            pre[i] = in1++;
        }

        if (pre[n - 1] != m)
            return true;
        in1 = m - 1;
        for (int i = n - 1; i >= 0; i--) {
            while (in1 >= 0 && s.charAt(i) != t.charAt(in1)) {
                in1--;
            }
            if (in1 < 0) {
                while (i >= 0)
                    suf[i--] = -1;
                break;
            }
            suf[i] = in1--;
        }

        for (int i = 0; i < n; i++) {

            int L = (i == 0) ? -1 : pre[i - 1];
            int R = (i == n - 1) ? m : suf[i + 1];

            if (L != m && R != -1 && L + 1 < R)
                return true;
        }

        return false;
    }
}