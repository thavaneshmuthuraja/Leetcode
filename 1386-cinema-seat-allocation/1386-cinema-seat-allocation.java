class Solution {
    public int maxNumberOfFamilies(int n, int[][] s) {

        Map<Integer, Set<Integer>> mp = new HashMap<>();

        // Store reserved seats row-wise
        for (int i = 0; i < s.length; i++) {

            int row = s[i][0];
            int seat = s[i][1];

            mp.computeIfAbsent(row, k -> new HashSet<>()).add(seat);
        }

        // Every completely empty row can accommodate 2 groups
        int cnt = (n - mp.size()) * 2;

        // Process only rows having reservations
        for (Set<Integer> seats : mp.values()) {

            boolean left = true;    // 2,3,4,5
            boolean middle = true;  // 4,5,6,7
            boolean right = true;   // 6,7,8,9

            for (int j = 2; j <= 5; j++) {
                if (seats.contains(j)) {
                    left = false;
                    break;
                }
            }

            for (int j = 4; j <= 7; j++) {
                if (seats.contains(j)) {
                    middle = false;
                    break;
                }
            }

            for (int j = 6; j <= 9; j++) {
                if (seats.contains(j)) {
                    right = false;
                    break;
                }
            }

            if (left && right) {
                cnt += 2;
            }
            else if (left || middle || right) {
                cnt += 1;
            }
        }

        return cnt;
    }
}