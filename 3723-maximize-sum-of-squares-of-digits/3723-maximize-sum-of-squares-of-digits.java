class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < num; i++) {
            int digit = Math.min(9, sum);

            str.append((char) (digit + '0'));
            sum -= digit;
        }

        if (sum > 0) {
            return "";
        }

        return str.toString();
    }
}