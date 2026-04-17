class Solution {
    int profit=0;
    int func(int in,int buy,int []prices,int fee,int [][]dp)
    {
        int n=prices.length;

        if(in==n)
        {
            return 0;
        }

        if(dp[in][buy]!=-1) return dp[in][buy];

        if(buy==1)
        {
            profit=Math.max(-prices[in]+func(in+1,0,prices,fee,dp),0+func(in+1,1,prices,fee,dp));
        }else 
        {
            profit=Math.max(prices[in]-fee+func(in+1,1,prices,fee,dp),0+func(in+1,0,prices,fee,dp));
        }

       return dp[in][buy]=profit;
        
    }
    public int maxProfit(int[] prices, int fee) {

        int [][]dp=new int [prices.length][2];

        for(int i=0;i<prices.length;i++)
        {
            Arrays.fill(dp[i],-1);
        }

        return func(0,1,prices,fee,dp);
        
    }
}