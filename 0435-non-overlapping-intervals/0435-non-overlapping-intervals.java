class Solution {
    class Pair{
        int st,end;
        Pair(int s,int e)
        {
            st=s;
            end=e;
        }
    }
    public int eraseOverlapIntervals(int[][] inte) {
        Pair[] hold=new Pair[inte.length];
        for(int i=0;i<inte.length;++i)
        {
            hold[i]=new Pair(inte[i][0],inte[i][1]);
        }
        Arrays.sort(hold,(a,b)-> Integer.compare(a.end,b.end));
        int last=hold[0].end,ans=0;
        for(int i=1;i<hold.length;++i)
        {
            if(last<=hold[i].st)
            {
                last=hold[i].end;
            }else
            {
                ans++;
            }
        }
        return ans;
    }
}