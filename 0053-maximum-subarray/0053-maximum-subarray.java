class Solution {
    public int maxSubArray(int[] nums) {

        int max=nums[0],curSum=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            curSum+=nums[i];
            if(curSum<nums[i])
            {
                curSum=nums[i];
            }

            max=Math.max(max,curSum);
        }

        //max=Math.max(max,curSum);
        return max;
        
    }
}