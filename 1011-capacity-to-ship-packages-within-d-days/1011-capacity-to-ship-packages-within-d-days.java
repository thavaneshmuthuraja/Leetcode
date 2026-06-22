class Solution {

    public boolean check(int []w,int mid,int d)
    {
        int s=0;
        for(int i=0;i<w.length;i++)
        {
            if(mid<w[i]) return false;
            s+=w[i];
            if(s>mid){
                s=w[i];
                d--;
            }
        }

        return d>0 ? true : false;
    }
    public int shipWithinDays(int[] weights, int days) {
        int l=1,s=0,ans=0;
        for(int i:weights)
        {
            s+=i;
        }
        int h=s;

        while(l<=h)
        {
            int mid=(l+h)/2;

            if(check(weights,mid,days))
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