class Solution {
    public int[][] insert(int[][] inte, int[] newI) {
        int n=inte.length,i=0,in=0;
        int res[][]=new int[n+1][2];

        while(i<n && inte[i][1]<newI[0])
        {
            res[in][0]=inte[i][0];
            res[in++][1]=inte[i][1];
            i++;
        }

        while(i<n && inte[i][0]<=newI[1])
        {
            newI[0]=Math.min(newI[0],inte[i][0]);
            newI[1]=Math.max(newI[1],inte[i][1]);
            i++;
        }

        res[in][0]=newI[0];
        res[in++][1]=newI[1];

        while(i<n)
        {
            res[in][0]=inte[i][0];
            res[in++][1]=inte[i][1];
            i++;
        }

        return java.util.Arrays.copyOf(res,in);
    }
}