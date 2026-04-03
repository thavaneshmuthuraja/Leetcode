class Solution {
    public int maxFrequency(int[] nums, int k) {
        
        int l=0,ans=0;
        long sum=k;

        Arrays.sort(nums);


        for(int r=0;r<nums.length;r++)
        {
            sum+=nums[r];

            while(sum<(long)(r-l+1)*nums[r])
            {
                sum-=nums[l];
                l++;
            }
            ans=Math.max(ans,(r-l+1));
        }
        return ans;
    }
}