class Solution {
public:
    struct Node {
        long long ways;
        long long total;
    };

    vector<int> digits;
    Node memo[20][3][11][11];
    bool seen[20][3][11][11];

    Node dfs(int pos, bool tight, int cnt, int prev2, int prev1) {
        if (pos == digits.size()) {
            return {1, 0};
        }

        int a = prev2 + 1;
        int b = prev1 + 1;

        if (!tight && seen[pos][cnt][a][b]) {
            return memo[pos][cnt][a][b];
        }

        int limit = tight ? digits[pos] : 9;

        Node ans = {0, 0};

        for (int dig = 0; dig <= limit; dig++) {
            bool nextTight = tight && (dig == limit);

            Node child;
            int add = 0;

            if (cnt == 0) {
                if (dig == 0) {
                    child = dfs(pos + 1, nextTight, 0, -1, -1);
                } else {
                    child = dfs(pos + 1, nextTight, 1, -1, dig);
                }
            }
            else if (cnt == 1) {
                child = dfs(pos + 1, nextTight, 2, prev1, dig);
            }
            else {
                if ((prev2 < prev1 && prev1 > dig) ||
                    (prev2 > prev1 && prev1 < dig)) {
                    add = 1;
                }

                child = dfs(pos + 1, nextTight, 2, prev1, dig);
            }

            ans.ways += child.ways;
            ans.total += child.total + add * child.ways;
        }

        if (!tight) {
            seen[pos][cnt][a][b] = true;
            memo[pos][cnt][a][b] = ans;
        }

        return ans;
    }

    long long solve(long long n) {
        if (n <= 0) return 0;

        digits.clear();

        string s = to_string(n);
        for (char c : s) {
            digits.push_back(c - '0');
        }

        memset(seen, false, sizeof(seen));

        return dfs(0, true, 0, -1, -1).total;
    }

    long long totalWaviness(long long num1, long long num2) {
        return solve(num2) - solve(num1 - 1);
    }
};