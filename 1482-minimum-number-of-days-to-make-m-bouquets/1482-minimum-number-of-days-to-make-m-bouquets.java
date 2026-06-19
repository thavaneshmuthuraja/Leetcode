class Solution {

    public boolean check(int[]bloom,int m,int k,int day)
    {
        int cnt=0;
        for(int v:bloom)
        {
            if(v<=day)
            {
                cnt++;
            }else
            {
                cnt=0;
            }
            if(cnt==k)
            {
                m--;
                cnt=0;
            }
            if(m==0) break;
        }
        return m<=0 ? true:false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int l=1,h=(int)1e9;
        int ans=-1;

        while(l<=h)
        {
            int mid=l+(h-l)/2;

            if(check(bloomDay,m,k,mid))
            {
                ans=mid;
                h=mid-1;
            }else
            {
                l=mid+1;
            }
        }

        return ans;
    }
}