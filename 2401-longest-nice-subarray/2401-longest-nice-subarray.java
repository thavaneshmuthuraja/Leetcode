class Solution {
    public int longestNiceSubarray(int[] nums) {
        long s=nums[0];
        int ans=0;
        int l=0,r=nums.length,end=1;
        while(end<r)
        {
            if((s&nums[end])==0)
            {
                s+=nums[end];
            }else
            {
            while(l<end && (s&nums[end])!=0)
            {
                s-=nums[l];
                l++;
            }
            s+=nums[end];
            }
            ans=Math.max(ans,end-l+1);
            end++;
        }

        return ans==0 ? 1:ans;
    }
}