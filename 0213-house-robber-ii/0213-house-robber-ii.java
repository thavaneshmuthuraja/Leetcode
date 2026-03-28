class Solution {

    int func(int in,int []nums,int n,int []dp)
    {
        if(in>=n)
        {
            return 0;
        }

        if(dp[in]!=-1) return dp[in];

        int take=nums[in]+func(in+2,nums,n,dp);
        int nottake=func(in+1,nums,n,dp);

        return dp[in]= Math.max(take,nottake);
    }
    public int rob(int[] nums) {

        int []dp=new int [nums.length];

        Arrays.fill(dp,-1);

        if(nums.length==1) return nums[0];

        int res1=func(0,nums,nums.length-1,dp);

        Arrays.fill(dp,-1);

        int res2=func(1,nums,nums.length,dp);

        return Math.max(res1,res2);
    }
}