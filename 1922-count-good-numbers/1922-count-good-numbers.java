class Solution {
    static final int MOD = 1000000007;

    long pow(long a, long n) {
        if (n == 0)
            return 1;

        if (n % 2 == 0) {
            long v = pow(a, n / 2);
            return (v * v) % MOD;
        } else {
            long v = pow(a, n / 2);
            return (v * v % MOD * a) % MOD;
        }
    }

    public int countGoodNumbers(long n) {
        long evenPositions = (n + 1) / 2; // positions with 5 choices
        long oddPositions = n / 2;         // positions with 4 choices

        return (int)((pow(5, evenPositions) *
                      pow(4, oddPositions)) % MOD);
    }
}