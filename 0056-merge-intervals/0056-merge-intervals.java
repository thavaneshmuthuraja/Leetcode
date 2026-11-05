class Solution {
    public int[][] merge(int[][] intervals) {
        int [][]res=new int [intervals.length][2];
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int n=intervals.length,in=0;
        res[in]=intervals[0];
        for(int i=1;i<n;++i)
        {
            if(res[in][1]<intervals[i][0])
            {
                res[++in]=intervals[i];
            }else
            {
                res[in][1]=Math.max(res[in][1],intervals[i][1]);
            }
        }
        return java.util.Arrays.copyOf(res,in+1);
    }
}