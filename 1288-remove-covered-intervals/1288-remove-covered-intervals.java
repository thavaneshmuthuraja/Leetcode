class Solution {
    public int removeCoveredIntervals(int[][] inte) {

        Arrays.sort(inte, (a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            }
            return Integer.compare(b[1], a[1]);
        });

        int prev = 0, c1= 0;
        for (int i = 1; i < inte.length; i++) {
            if (inte[prev][0] <= inte[i][0] && inte[prev][1] >= inte[i][1])
                c1++;
            else
                prev=i;
            // System.out.println(c1);
            // System.out.println(inte[prev][0]+"--"+inte[prev][1]);
        }

        return inte.length - c1;
    }
}