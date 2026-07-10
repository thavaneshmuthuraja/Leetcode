class Solution {
    public int beautySum(String s) {

        int[] arr = new int[256];
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            Arrays.fill(arr, 0);
            int maxf = Integer.MIN_VALUE;
            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);
                arr[c]++;
                maxf = Math.max(maxf, arr[c]);
                int minf = Integer.MAX_VALUE;
                for (int k = 0; k < 26; k++) {
                    if (arr['a' + k] > 0) {
                        minf = Math.min(minf, arr['a' + k]);
                    }
                }
                sum += (maxf - minf);
            }
        }
        return sum;
    }
}