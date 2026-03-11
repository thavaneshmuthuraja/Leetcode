class Solution {

    int func(int in,int s,int []nums,int []dp)
    {
        if(in>=nums.length)
        {
            return 0;
        }

        if(dp[in]!=-1) return dp[in];

        int take=nums[in]+func(in+2,s,nums,dp);
        int nottake=func(in+1,s,nums,dp);

        return dp[in]=Math.max(take,nottake);
    }
    
    public int rob(int[] nums) {

        int []dp=new int [nums.length];
        Arrays.fill(dp,-1);
        return func(0,0,nums,dp);
    }
}