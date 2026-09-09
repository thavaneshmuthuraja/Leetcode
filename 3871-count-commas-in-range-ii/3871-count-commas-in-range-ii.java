class Solution {
    public long countCommas(long n) {

        long cnt = 0;

        if (n <= 999) {
            return 0;
        }

        if (n <= 999999) {
            return n - 999;
        }

        cnt += (999999 - 999) * 1L;

        if (n <= 999999999) {
            return cnt + (n - 999999) * 2;
        }

        cnt += (999999999 - 999999) * 2L;

        if (n <= 999999999999L) {
            return cnt + (n - 999999999) * 3;
        }

        cnt += (999999999999L - 999999999) * 3L;

        if (n <= 999999999999999L) {
            return cnt + (n - 999999999999L) * 4;
        }

        cnt += (999999999999999L - 999999999999L) * 4L;

        return cnt + (n - 999999999999999L) * 5;
    }
}