class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int st=0,end=1;

        int ans=1;

        while(end<nums.length)
        {
            if(nums[end-1]>=nums[end])
            {
                st=end;
            }

            ans=Math.max(ans,end-st+1);
            end++;
        }

        return ans;
    }
}