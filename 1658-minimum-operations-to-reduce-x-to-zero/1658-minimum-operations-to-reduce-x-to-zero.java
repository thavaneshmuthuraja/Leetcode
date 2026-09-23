class Solution {
    public int minOperations(int[] nums, int x) {
        int l=0,r=0;
        int n=nums.length;
        int tot=0;
        for(int i=0;i<n;++i)
        {
            tot+=nums[i];
        }
        int v=tot-x;
        int cs=0,max=-1;
        while(r<n)
        {
            cs+=nums[r];
            while(l<=r && cs>v)
            {
                cs-=nums[l++];
            }
            if(cs==v)
            {
                max=Math.max(max,r-l+1);
            }
            r++;
        }
        return max==-1 ? -1:n-max;
    }
}