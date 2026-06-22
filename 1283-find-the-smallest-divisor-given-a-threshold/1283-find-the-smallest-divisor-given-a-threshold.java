class Solution {

    public boolean check(int []nums,int t,int m)
    {
        int s=0;
        for(int i=0;i<nums.length;i++)
        {
            s+=((nums[i]+m-1)/m);
        }
        return s<=t ? true:false;
    }
    public int smallestDivisor(int[] nums, int threshold) {

        int l=1,h=(int)1e9;

        int ans=0;

        while(l<=h)
        {
            int mid=(l+h)/2;

            if(check(nums,threshold,mid))
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