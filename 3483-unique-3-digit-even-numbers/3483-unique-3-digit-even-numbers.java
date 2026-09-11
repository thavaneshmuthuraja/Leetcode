import java.util.*;

class Solution {
    int ans = 0;
    Set<Integer> set = new HashSet<>();

    void func(int val, int[] digits, int cnt, boolean[] used) {

        if (cnt == 3) {
            if (val % 2 == 0) {
                if (set.add(val)) {
                    ans++;
                }
            }
            return;
        }

        for (int i = 0; i < digits.length; ++i) {

            // Same array position cannot be used twice
            if (used[i]) {
                continue;
            }

            // First digit cannot be 0
            if (cnt == 0 && digits[i] == 0) {
                continue;
            }

            used[i] = true;

            val = (val * 10) + digits[i];

            func(val, digits, cnt + 1, used);

            // Backtracking
            val = val / 10;
            used[i] = false;
        }
    }

    public int totalNumbers(int[] digits) {
        boolean[] used = new boolean[digits.length];

        func(0, digits, 0, used);

        return ans;
    }
}