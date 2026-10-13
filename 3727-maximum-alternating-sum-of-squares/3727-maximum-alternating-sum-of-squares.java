class Solution {
    public long maxAlternatingSum(int[] nums) {
        long sum=0;
        int n=nums.length;
        for(int i=0;i<n;++i)
        {
            nums[i]=Math.abs(nums[i]);
        }

        Arrays.sort(nums);
        int s1=0,s2=0;
        for(int i=0;i<n/2;++i)
        {
            sum-=(nums[i]*nums[i]);
        }
        for(int i=n/2;i<n;++i)
        {
            sum+=(nums[i]*nums[i]);
        }

        return sum;
    }
}