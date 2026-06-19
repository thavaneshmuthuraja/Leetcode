class Solution {

    boolean check(int []piles,int k,int h)
    {
        for(int i=0;i<piles.length;i++)
        {
            int t=(int)Math.ceil((double)piles[i]/k);
            h-=t;
        }
        return h>=0 ?true:false;
    }
    public int minEatingSpeed(int[] piles, int hu) {
        int l=1,h=(int)1e9,ans=-2;

        while(l<=h)
        {
            int mid=(l+h)/2;

            if(check(piles,mid,hu))
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