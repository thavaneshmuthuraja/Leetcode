class Solution {
    public long maxRatings(int[][] units) {

        long sum=0;
        long mini=(long)1e9,smin=(long)1e9;

        for(int i=0;i<units.length;i++)
        {
            int rem=units[i].length;
            Arrays.sort(units[i]);
            mini=Math.min(mini,(long)units[i][0]);
            smin=Math.min(smin,(long)units[i][1%rem]);
            sum+=(long)units[i][1%rem];
        }

        if(units[0].length==1)
        {
            mini=0L;
            smin=0L;
        }
        return (long)sum+mini-smin;
    }
}