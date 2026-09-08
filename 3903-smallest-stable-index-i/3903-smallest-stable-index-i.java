class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max=nums[0],min=Integer.MAX_VALUE;


        int val=0;
        for(int i=0;i<nums.length;i++)
        {
            min=Integer.MAX_VALUE;
            for(int j=i;j<nums.length;j++)
            {
                min=Math.min(min,nums[j]);
            }
            max=Math.max(nums[i],max);
            val=max-min;
            if(val<=k) return i;
        }

        return -1;

    }
}