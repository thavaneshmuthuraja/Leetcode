class Solution {
    public int maxProfit(int[] nums) {

        int buy=nums[0],maxPro=0;

        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<buy)
            {
                buy=nums[i];
            }
            int pro=nums[i]-buy;

            maxPro=Math.max(maxPro,pro);

        }

        return maxPro;
    }
}