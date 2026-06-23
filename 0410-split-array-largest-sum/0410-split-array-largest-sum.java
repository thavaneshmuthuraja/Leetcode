class Solution {

    public boolean func(int []nums,long mid,int k)
    {
        long sp=1,s=0;
        for(int val:nums)
        {
            if(val>mid) return false;
            if(s+val>mid)
            {
                sp++;
                s=val;
            }else
            {
                s+=val;
            }
        }

        return sp<=k ? true:false;
    }
    public int splitArray(int[] nums, int k) {
        long l=0,r=0,ans=0,s=0;

        for(int v:nums)
        {
            l=Math.min(v,l);
            s+=v;
        }
        r=s;

        while(l<=r)
        {
            long mid=l+(r-l)/2;

            if(func(nums,mid,k))
            {
                r=mid-1;
                ans=mid;
            }else
            {
                l=mid+1;
            }
        }

        return (int)ans;
    }
}