class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int []suf=new int [nums.length];
        int t=Integer.MAX_VALUE;
        for(int i=nums.length-1;i>=0;--i)
        {
            t=Math.min(nums[i],t);
            suf[i]=t;
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            max=Math.max(max,nums[i]);
            if((max-suf[i])<=k) return i;
        }
        return -1;
    }
}