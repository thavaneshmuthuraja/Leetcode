class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals,(a,b)-> a[0]-b[0]);

        int r=intervals.length;

        int [][]ans=new int[r][2];

        ans[0]=intervals[0];

        int p=0;

        for(int i=1;i<r;i++)
        {
            if(intervals[p][1]>=intervals[i][0])
            {
                intervals[p][1]=Math.max(intervals[p][1],intervals[i][1]);
            }
            else
            {
                intervals[++p]=intervals[i];
            }
        }

        return Arrays.copyOf(intervals,p+1);
        
    }
}